package net.alarmtilt.cle.alarmis.service;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import net.alarmtilt.cle.alarmis.configuration.Constants;
import net.alarmtilt.cle.alarmis.configuration.LoaderConfigurationImpl;
import net.alarmtilt.cle.alarmis.model.AlertMessage;
import net.alarmtilt.cle.alarmis.model.CredentialClient;
import net.alarmtilt.cle.alarmis.model.GenericAlert;

@Service
public class BuildObjetMessageFactoryImpl implements BuildObjetMessageFactoryService {

	private static final Logger log = LoggerFactory.getLogger(BuildObjetMessageFactoryImpl.class);
	private static String filePath = "alarmisMsg";
	private static String fileExtension = "xml";
	@Autowired
	private LoaderConfigurationImpl loaderConfigurationService;
	private CredentialClient credentialClient;

	/**
	 * parse XML file and create object for message alert
	 * 
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	@Override
	public AlertMessage parseXMLFile(String xmlStr) {

		log.info("begin parsing Message from client .....");

		AlertMessage alertMessage = new AlertMessage();
		GenericAlert genericAlert = new GenericAlert();
		try {
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder;

			dBuilder = dbFactory.newDocumentBuilder();

			InputSource is = new InputSource(new StringReader(xmlStr));
			Document doc = dBuilder.parse(is);

			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName(Constants.ALARMIS_ALERT_XML_ROOT_NODE);
			if (nList.getLength() == 0)
				throw new Exception("SEND ERROR RESPONSE TO CIENT ....CAUSE NOT RESPECTING DTD XML FILE");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					// Set AlertMessage
					alertMessage.setPwd(eElement.getAttribute(Constants.ALARMIS_ALERT_XML_ATTRIBUT_MDP));
					alertMessage.setSid(eElement.getAttribute(Constants.ALARMIS_ALERT_XML_ATTRIBUT_SID));
					alertMessage.setUid(eElement.getAttribute(Constants.ALARMIS_ALERT_XML_ATTRIBUT_UID));
					alertMessage.setName(eElement.getAttribute(Constants.ALARMIS_ALERT_XML_ATTRIBUT_NAME));
					alertMessage
							.setDestination(eElement.getAttribute(Constants.ALARMIS_ALERT_XML_ATTRIBUT_DESTINATION));
					genericAlert.setAccount(Integer.parseInt(
							eElement.getElementsByTagName(Constants.ALARMIS_ALERT_XML_CHILD_NODE_GENERIC_ALERT).item(0)
									.getAttributes().getNamedItem(Constants.ALARMIS_ALERT_XML_ATTRIBUT_ACCOUNT)
									.getNodeValue()));
					genericAlert.setZone(eElement
							.getElementsByTagName(Constants.ALARMIS_ALERT_XML_CHILD_NODE_GENERIC_ALERT).item(0)
							.getAttributes().getNamedItem(Constants.ALARMIS_ALERT_XML_ATTRIBUT_ZONE).getNodeValue());
					genericAlert.setEvent(eElement
							.getElementsByTagName(Constants.ALARMIS_ALERT_XML_CHILD_NODE_GENERIC_ALERT).item(0)
							.getAttributes().getNamedItem(Constants.ALARMIS_ALERT_XML_ATTRIBUT_EVENT).getNodeValue());
					// Set generic Alert
					alertMessage.setGenericAlert(genericAlert);
					alertMessage = checkCredentail(eElement, alertMessage);

					if (alertMessage.getResponseMessage() == null) {
						alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_ACCEPT);
						log.info("ALERT IS READY TO RUN WITH ATTRIBUTE :  {}", alertMessage);
					} else {
						log.info("ALERT IS NOT READY TO RUN  ATTRIBUTE : {} WITH RESPONSE --> {} ", alertMessage,
								alertMessage.getResponseMessage());
					}

				}
			}
			log.info("END parsing Message from client .....");
			return alertMessage;
		} catch (Exception e) {
			e.printStackTrace();
			log.error("ERROR : {}", e);
			alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_6);
			log.error("ERROR PARSING XML FILE .... WITH RESPONSE --> {}", alertMessage.getResponseMessage());

			log.error("END parsing Message from client with error .....");
			return alertMessage;
		}

	}

	private AlertMessage checkCredentail(Element eElement, AlertMessage alertMessage) {
		credentialClient = getCredentialClient(eElement.getAttribute(Constants.ALARMIS_ALERT_XML_ATTRIBUT_UID),
				eElement.getAttribute(Constants.ALARMIS_ALERT_XML_ATTRIBUT_MDP),
				alertMessage.getGenericAlert().getAccount(), alertMessage.getGenericAlert().getZone(),
				alertMessage.getGenericAlert().getEvent());

		if (credentialClient != null) {
			if (!eElement.getAttribute(Constants.ALARMIS_ALERT_XML_ATTRIBUT_MDP).equals(credentialClient.getPwd())) {
				log.warn("WARN CREDENTIAL ALARMTILT PWD -->{} ",
						eElement.getAttribute(Constants.ALARMIS_ALERT_XML_ATTRIBUT_MDP));
				alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_3);
			}
			if (!eElement.getAttribute(Constants.ALARMIS_ALERT_XML_ATTRIBUT_UID).equals(credentialClient.getUid())) {
				log.warn("WARN CREDENTIAL ALARMTILT UID -->{} ",
						eElement.getAttribute(Constants.ALARMIS_ALERT_XML_ATTRIBUT_UID));
				alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_2);
			}
			return alertMessage;
		} else {
			alertMessage.setResponseMessage(Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_1);
			log.warn("WARN CREDENTIAL NO MATCHED  ");
			return alertMessage;
		}

	}

	@SuppressWarnings("unused")
	private static File convertStringToDocument(String xmlStr) throws Exception {

		log.info("CONVERT STRING TO FILE ..... STRING --> ", xmlStr);
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder;

		try {
			builder = factory.newDocumentBuilder();

			// Use String reader
			Document document = builder.parse(new InputSource(new StringReader(xmlStr)));

			TransformerFactory tranFactory = TransformerFactory.newInstance();
			Transformer aTransformer = tranFactory.newTransformer();
			Source src = new DOMSource(document);
			File dir = new File("AlertMessages");

			// attempt to create the directory here
			boolean successful = dir.mkdir();
			if (successful) {
				// creating the directory succeeded
				log.info("directory was created successfully");
			} else {
				// creating the directory failed
				log.info("failed trying to create the directory");
			}
			File file = new File("AlertMessages/" + generateFileName());
			Result dest = new StreamResult(file);
			aTransformer.transform(src, dest);

			return file;
		} catch (Exception e) {
			throw new Exception("ERROR IN CONVERTING STRING TO FILE :{} ", e);

		}

	}

	/**
	 * return client credential current by :
	 * 
	 * @param uid
	 * @param pwd
	 * @param account
	 * @param zone
	 * @param event
	 * @return
	 */
	private CredentialClient getCredentialClient(String uid, String pwd, Integer account, String zone, String event) {
		List<CredentialClient> getCredentialClientlist = loaderConfigurationService.getConfigOfService()
				.getCredentialClientlist();
		for (CredentialClient credentialClient : getCredentialClientlist) {
			// if account exist in rules table
			if (credentialClient.getAccount() != null) {
				if (uid.equals(credentialClient.getUid()) && pwd.equals(credentialClient.getPwd())
						&& account.equals(credentialClient.getAccount())) {
					log.warn("WARN CREDENTIAL ALARMTILT ACCOUNT -->{} ", credentialClient.getAccount());
					return this.credentialClient = credentialClient;
				}
				// if zone exist in rules table
			} else if (credentialClient.getZone() != null) {
				if (uid.equals(credentialClient.getUid()) && pwd.equals(credentialClient.getPwd())
						&& zone.equals(credentialClient.getZone())) {
					return this.credentialClient = credentialClient;
				}
				// if event exist in rules table
			} else if (credentialClient.getEvent() != null) {
				if (uid.equals(credentialClient.getUid()) && pwd.equals(credentialClient.getPwd())
						&& event.equals(credentialClient.getEvent())) {

					return this.credentialClient = credentialClient;
				}
			} else {
				//
				if (uid.equals(credentialClient.getUid()) && pwd.equals(credentialClient.getPwd())) {
					return this.credentialClient = credentialClient;
				}

			}

		}
		return null;

	}

	/**
	 * generate the file name with yyyyMMddhhmmss format
	 * 
	 * @return
	 */
	private static String generateFileName() {
		DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
		String filename = filePath + df.format(new Date()) + "." + fileExtension;
		log.info("GENERATE FILE NAME {}..... ", filename);
		return filename;
	}
}
