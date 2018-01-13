
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subscriptionState.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="subscriptionState">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SUBSCRIPTION_REQUESTED"/>
 *     &lt;enumeration value="SUBSCRIPTION_VALIDATED"/>
 *     &lt;enumeration value="UNSUBSCRIPTION_REQUESTED"/>
 *     &lt;enumeration value="UNSUBSCRIPTION_VALIDATED"/>
 *     &lt;enumeration value="CONTACT_DELETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "subscriptionState")
@XmlEnum
public enum SubscriptionState {

    SUBSCRIPTION_REQUESTED,
    SUBSCRIPTION_VALIDATED,
    UNSUBSCRIPTION_REQUESTED,
    UNSUBSCRIPTION_VALIDATED,
    CONTACT_DELETED;

    public String value() {
        return name();
    }

    public static SubscriptionState fromValue(String v) {
        return valueOf(v);
    }

}
