
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listSubscriptionResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listSubscriptionResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/>
 *     &lt;enumeration value="PARAM_REQUIRED"/>
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "listSubscriptionResultEnum")
@XmlEnum
public enum ListSubscriptionResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    PARAM_REQUIRED,
    AUTHORIZATION_ERROR;

    public String value() {
        return name();
    }

    public static ListSubscriptionResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
