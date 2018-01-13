
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for messageType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="messageType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INFO"/>
 *     &lt;enumeration value="ALERT"/>
 *     &lt;enumeration value="CONFIRM"/>
 *     &lt;enumeration value="CONFCALL"/>
 *     &lt;enumeration value="DOCUMENT"/>
 *     &lt;enumeration value="MESSAGE_VOCAL"/>
 *     &lt;enumeration value="SYSTEM"/>
 *     &lt;enumeration value="DECISION"/>
 *     &lt;enumeration value="CONTACT_ACTUALIZE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "messageType")
@XmlEnum
public enum MessageType {

    INFO,
    ALERT,
    CONFIRM,
    CONFCALL,
    DOCUMENT,
    MESSAGE_VOCAL,
    SYSTEM,
    DECISION,
    CONTACT_ACTUALIZE;

    public String value() {
        return name();
    }

    public static MessageType fromValue(String v) {
        return valueOf(v);
    }

}
