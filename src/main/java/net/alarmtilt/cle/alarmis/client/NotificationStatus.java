
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for notificationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="notificationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IN_PROGRESS"/>
 *     &lt;enumeration value="SENT"/>
 *     &lt;enumeration value="DELIVERED"/>
 *     &lt;enumeration value="READ"/>
 *     &lt;enumeration value="REPLIED"/>
 *     &lt;enumeration value="FAILED"/>
 *     &lt;enumeration value="NOT_SENT"/>
 *     &lt;enumeration value="NOT_DELIVERED"/>
 *     &lt;enumeration value="RETRY_LATER"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "notificationStatus")
@XmlEnum
public enum NotificationStatus {

    IN_PROGRESS,
    SENT,
    DELIVERED,
    READ,
    REPLIED,
    FAILED,
    NOT_SENT,
    NOT_DELIVERED,
    RETRY_LATER;

    public String value() {
        return name();
    }

    public static NotificationStatus fromValue(String v) {
        return valueOf(v);
    }

}
