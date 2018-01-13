
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactAttributeResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listContactAttributeResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/>
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/>
 *     &lt;enumeration value="PARAM_REQUIRED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "listContactAttributeResultEnum")
@XmlEnum
public enum ListContactAttributeResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    AUTHORIZATION_ERROR,
    PARAM_REQUIRED;

    public String value() {
        return name();
    }

    public static ListContactAttributeResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
