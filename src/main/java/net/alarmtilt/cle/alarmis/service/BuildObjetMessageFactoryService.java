package net.alarmtilt.cle.alarmis.service;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import net.alarmtilt.cle.alarmis.model.AlertMessage;

public interface BuildObjetMessageFactoryService {


	AlertMessage parseXMLFile(String fXmlStr) throws ParserConfigurationException, SAXException, IOException;

}
