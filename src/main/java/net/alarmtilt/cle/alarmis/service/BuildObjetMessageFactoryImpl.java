package net.alarmtilt.cle.alarmis.service;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

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
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import net.alarmtilt.cle.alarmis.api.AlarmisEventApiController;
import net.alarmtilt.cle.alarmis.model.AlertMessage;
import net.alarmtilt.cle.alarmis.model.GenericAlert;

@Service
public class BuildObjetMessageFactoryImpl implements BuildObjetMessageFactoryService {

	private static final Logger log = LoggerFactory.getLogger(AlarmisEventApiController.class);
	private static String FILE_PATH = "FilesMsg\\alarmisMsg";
	private static String FILE_EXTENSION = "xml";

	/**
	 * parse XML file and create object for message alert
	 * 
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	@Override
	public AlertMessage parseXMLFile(String xmlStr)   {

		AlertMessage alertMessage = new AlertMessage();
		GenericAlert genericAlert = new GenericAlert();
		//
		File fXmlFile = convertStringToDocument(xmlStr);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder;
		try {
			dBuilder = dbFactory.newDocumentBuilder();

			Document doc;

			doc = dBuilder.parse(fXmlFile);

			doc.getDocumentElement().normalize();

			NodeList nList = doc.getElementsByTagName("message");

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);

				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					Element eElement = (Element) nNode;

					alertMessage.setPwd(eElement.getAttribute("pwd"));

					alertMessage.setSid(eElement.getAttribute("sid"));
					alertMessage.setUid(eElement.getAttribute("uid"));
					alertMessage.setName(eElement.getAttribute("name"));
					alertMessage.setDestination(eElement.getAttribute("destination"));

					genericAlert.setAccount(Integer.parseInt(eElement.getElementsByTagName("generic_alert").item(0)
							.getAttributes().getNamedItem("account").getNodeValue()));
					
					
					genericAlert.setZone(eElement.getElementsByTagName("generic_alert").item(0).getAttributes()
							.getNamedItem("zone").getNodeValue());
					genericAlert.setEvent(eElement.getElementsByTagName("generic_alert").item(0).getAttributes()
							.getNamedItem("event").getNodeValue());
					alertMessage.setGenericAlert(genericAlert);
					alertMessage.setResponseMessage("<response result=\"accept\" />");

				}
			}
			return alertMessage;
		} catch (ParserConfigurationException | IOException | SAXException e) {
			log.info("ERROR : " + e);
			alertMessage.setResponseMessage("<response result=\"error\" />");
			e.printStackTrace();
			return alertMessage;
		}

	}

	private static File convertStringToDocument(String xmlStr) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		DocumentBuilder builder;

		try {
			builder = factory.newDocumentBuilder();

			// Use String reader
			Document document = builder.parse(new InputSource(new StringReader(xmlStr)));

			TransformerFactory tranFactory = TransformerFactory.newInstance();
			Transformer aTransformer = tranFactory.newTransformer();
			Source src = new DOMSource(document);
			File file = new File(generateFileName());
			Result dest = new StreamResult(file);
			aTransformer.transform(src, dest);

			return file;
		} catch (Exception e) {
			log.error("error : " + e);
			return null;
		}

	}

	/**
	 * generate the file name with yyyyMMddhhmmss format
	 * 
	 * @return
	 */
	private static String generateFileName() {
		DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
		String filename = FILE_PATH + df.format(new Date()) + "." + FILE_EXTENSION;
		return filename;
	}
}
