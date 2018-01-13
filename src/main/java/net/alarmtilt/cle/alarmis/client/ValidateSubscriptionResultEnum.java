
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for validateSubscriptionResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="validateSubscriptionResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/>
 *     &lt;enumeration value="INVALID_SUBSCRIPTION_KEY"/>
 *     &lt;enumeration value="SUBSCRIPTION_ID_OR_MEDIA_REQUIRED"/>
 *     &lt;enumeration value="SUBSCRIPTION_NOT_FOUND"/>
 *     &lt;enumeration value="SUBSCRIPTION_ALREADY_IN_STATE_VALIDATED"/>
 *     &lt;enumeration value="SUBSCRIPTION_KEY_EXPIRED"/>
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/>
 *     &lt;enumeration value="PARAM_REQUIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "validateSubscriptionResultEnum")
@XmlEnum
public enum ValidateSubscriptionResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    INVALID_SUBSCRIPTION_KEY,
    SUBSCRIPTION_ID_OR_MEDIA_REQUIRED,
    SUBSCRIPTION_NOT_FOUND,
    SUBSCRIPTION_ALREADY_IN_STATE_VALIDATED,
    SUBSCRIPTION_KEY_EXPIRED,
    AUTHORIZATION_ERROR,
    PARAM_REQUIRED;

    public String value() {
        return name();
    }

    public static ValidateSubscriptionResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
