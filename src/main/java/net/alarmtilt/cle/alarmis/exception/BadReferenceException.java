/**
 * 
 */
package net.alarmtilt.cle.alarmis.exception;

import net.alarmtilt.cle.alarmis.configuration.Constants;

/**
 * @author Yaakoub
 *
 */
public class BadReferenceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2706598134072859669L;
	
	@Override
	public String getMessage() {
		return "Bad reference the message is not fomated with xml format  ";
	}
	
	public String getXmlMessage() {
		return Constants.ALARMIS_ALERT_XML_RESPONSE_REJECT_4;
	}

}
