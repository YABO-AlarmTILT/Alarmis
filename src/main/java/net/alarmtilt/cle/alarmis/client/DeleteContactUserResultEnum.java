
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteContactUserResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="deleteContactUserResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/>
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/>
 *     &lt;enumeration value="PARAM_REQUIRED"/>
 *     &lt;enumeration value="TOKEN_ID_REQUIRED"/>
 *     &lt;enumeration value="CONTACT_USER_NOT_FOUND"/>
 *     &lt;enumeration value="CONTACT_USER_CAN_NOT_BE_DELETED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "deleteContactUserResultEnum")
@XmlEnum
public enum DeleteContactUserResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    AUTHORIZATION_ERROR,
    PARAM_REQUIRED,
    TOKEN_ID_REQUIRED,
    CONTACT_USER_NOT_FOUND,
    CONTACT_USER_CAN_NOT_BE_DELETED;

    public String value() {
        return name();
    }

    public static DeleteContactUserResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
