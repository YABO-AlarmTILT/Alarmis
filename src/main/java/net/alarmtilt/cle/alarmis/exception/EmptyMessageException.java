package net.alarmtilt.cle.alarmis.exception;

import net.alarmtilt.cle.alarmis.configuration.Constants;

public class EmptyMessageException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 765642767785485082L;

	@Override
	public String getMessage() {
		return "Message Empty From Client , after  retring to read ..... ";
	}
	
	public String getXmlMessage() {
		return Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_11;
	}

}
