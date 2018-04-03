/**
 * 
 */
package net.alarmtilt.cle.alarmis.exception;

import net.alarmtilt.cle.alarmis.configuration.Constants;

/**
 * @author Yaakoub
 *
 */
public class VersionErrorException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -723551123401303119L;
	
	@Override
	public String getMessage() {
		return "VERSION OF ECLIPS MESSENGER NOT SUPPORTED... ";
	}
	
	public String getXmlMessage() {
		return Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_8;
	}

}
