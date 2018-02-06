package net.alarmtilt.cle.alarmis.service;

import net.alarmtilt.cle.alarmis.model.AlertMessage;

public interface BuildObjetMessageFactoryService {


	AlertMessage parseXMLFile(String fXmlStr);

}
