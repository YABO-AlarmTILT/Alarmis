package net.alarmtilt.cle.alarmis.configuration;

public final class Constants {

	public static final String ALARMIS_ALERT_XML_ROOT_NODE = "message";
	public static final String ALARMIS_ALERT_XML_ATTRIBUT_PWD = "pwd";
	public static final String ALARMIS_ALERT_XML_ATTRIBUT_SID = "sid";
	public static final String ALARMIS_ALERT_XML_ATTRIBUT_UID = "uid";
	public static final String ALARMIS_ALERT_XML_ATTRIBUT_NAME = "name";
	public static final String ALARMIS_ALERT_XML_ATTRIBUT_DESTINATION = "destination";
	public static final String ALARMIS_ALERT_XML_CHILD_NODE_GENERIC_ALERT = "generic_alert";
	public static final String ALARMIS_ALERT_XML_ATTRIBUT_ACCOUNT = "account";
	public static final String ALARMIS_ALERT_XML_ATTRIBUT_EVENT = "event";
	public static final String ALARMIS_ALERT_XML_ATTRIBUT_ZONE = "zone";
	
	
	
	public static final String ALARMIS_ALERT_FORMAT_RESPONSE_DATA_LENGTH = "Data-Length: ";
	public static final String ALARMIS_ALERT_FORMAT_RESPONSE_VERSION_ECLIPS = "e-CLIPS: ";
	public static final String ALARMIS_ALERT_XML_TAG = "<?xml";
	
	
	public static final String SKIP_LINE = "\n";
	public static final byte[] DELIMITER = "\n".getBytes();
	
	
	
	
	
	public static final String ALARMIS_ALERT_XML_RESPONSE_REJECT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"reject\" />";
	public static final String ALARMIS_ALERT_XML_RESPONSE_REJECT_1 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"reject\" errornum=\"1\" errortext=\"Rejected\" />";
	public static final String ALARMIS_ALERT_XML_RESPONSE_REJECT_2 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"reject\" errornum=\"2\" errortext=\"User unknown\" />";
	public static final String ALARMIS_ALERT_XML_RESPONSE_REJECT_3 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"reject\" errornum=\"3\" errortext=\"Login failed\" />";
	public static final String ALARMIS_ALERT_XML_RESPONSE_REJECT_4 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"reject\" errornum=\"4\" errortext=\"Bad reference\" />";
	public static final String ALARMIS_ALERT_XML_RESPONSE_REJECT_5 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"reject\" errornum=\"5\" errortext=\"Unknown message\" />";
	public static final String ALARMIS_ALERT_XML_RESPONSE_REJECT_6 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"reject\" errornum=\"6\" errortext=\"Internal error\" />";
	public static final String ALARMIS_ALERT_XML_RESPONSE_REJECT_7 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"reject\" errornum=\"7\" errortext=\"Validation error\" />";
	public static final String ALARMIS_ALERT_XML_RESPONSE_REJECT_8 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"reject\" errornum=\"8\" errortext=\"Version error\" />";
	public static final String ALARMIS_ALERT_XML_RESPONSE_REJECT_9 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"reject\" errornum=\"9\" errortext=\"Data length error\" />";
	public static final String ALARMIS_ALERT_XML_RESPONSE_REJECT_10 = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"reject\" errornum=\"10\" errortext=\"Unknown session\" />";

	
	
	
	public static final String ALARMIS_ALERT_XML_RESPONSE_ACCEPT = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"accept\" />";
	public static final String ALARMIS_ALERT_XML_RESPONSE_ERROR = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><response result=\"error\" />";
	
	
	


}
