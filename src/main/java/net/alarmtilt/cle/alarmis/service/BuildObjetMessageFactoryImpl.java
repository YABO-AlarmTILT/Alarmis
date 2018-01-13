package net.alarmtilt.cle.alarmis.service;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import net.alarmtilt.cle.alarmis.model.AlertMessage;
import net.alarmtilt.cle.alarmis.model.GenericAlert;

@Service
public class BuildObjetMessageFactoryImpl implements BuildObjetMessageFactoryService {

	/**
	 * parse XML file and create object for message alert
	 * 
	 * @throws ParserConfigurationException
	 * @throws SAXException
	 * @throws IOException
	 */
	@Override
	public AlertMessage parseXMLFile(String xmlStr) throws ParserConfigurationException, SAXException, IOException {

		AlertMessage alertMessage = new AlertMessage();
		GenericAlert genericAlert = new GenericAlert();

		File fXmlFile = convertStringToDocument(xmlStr);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(fXmlFile);

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

				genericAlert
						.setAccount(Integer.parseInt(eElement.getElementsByTagName("account").item(0).getNodeValue()));
				genericAlert
						.setAccount(Integer.parseInt(eElement.getElementsByTagName("event").item(0).getNodeValue()));
				genericAlert.setAccount(Integer.parseInt(eElement.getElementsByTagName("zone").item(0).getNodeValue()));
				alertMessage.setGenericAlert(genericAlert);

			}
		}
		return alertMessage;
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
			File file = new File("xmlFileName.xml");
			Result dest = new StreamResult(file);
			aTransformer.transform(src, dest);
			
			return file;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
}
