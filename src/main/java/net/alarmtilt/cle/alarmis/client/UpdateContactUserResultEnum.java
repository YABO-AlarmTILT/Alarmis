
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateContactUserResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="updateContactUserResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/>
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/>
 *     &lt;enumeration value="PARAM_REQUIRED"/>
 *     &lt;enumeration value="TOKEN_ID_REQUIRED"/>
 *     &lt;enumeration value="CONTACT_USER_NOT_FOUND"/>
 *     &lt;enumeration value="USER_FIRST_NAME_EMPTY"/>
 *     &lt;enumeration value="USER_LAST_NAME_EMPTY"/>
 *     &lt;enumeration value="DUPLICATE_ADDRESS_ON_MEDIA_LOCATION"/>
 *     &lt;enumeration value="ADDRESS_MEDIA_EMPTY"/>
 *     &lt;enumeration value="ADDRESS_LOCATION_EMPTY"/>
 *     &lt;enumeration value="ADDRESS_PHONE_NUMBER_EMPTY"/>
 *     &lt;enumeration value="ADDRESS_EMAIL_EMPTY"/>
 *     &lt;enumeration value="ADDRESS_PHONE_NUMBER_INVALID"/>
 *     &lt;enumeration value="ADDRESS_EMAIL_INVALID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "updateContactUserResultEnum")
@XmlEnum
public enum UpdateContactUserResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    AUTHORIZATION_ERROR,
    PARAM_REQUIRED,
    TOKEN_ID_REQUIRED,
    CONTACT_USER_NOT_FOUND,
    USER_FIRST_NAME_EMPTY,
    USER_LAST_NAME_EMPTY,
    DUPLICATE_ADDRESS_ON_MEDIA_LOCATION,
    ADDRESS_MEDIA_EMPTY,
    ADDRESS_LOCATION_EMPTY,
    ADDRESS_PHONE_NUMBER_EMPTY,
    ADDRESS_EMAIL_EMPTY,
    ADDRESS_PHONE_NUMBER_INVALID,
    ADDRESS_EMAIL_INVALID;

    public String value() {
        return name();
    }

    public static UpdateContactUserResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
