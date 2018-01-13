
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getContactUserResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="getContactUserResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/>
 *     &lt;enumeration value="PARAM_REQUIRED"/>
 *     &lt;enumeration value="NOT_FOUND"/>
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "getContactUserResultEnum")
@XmlEnum
public enum GetContactUserResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    PARAM_REQUIRED,
    NOT_FOUND,
    AUTHORIZATION_ERROR;

    public String value() {
        return name();
    }

    public static GetContactUserResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
