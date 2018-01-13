
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createContactUserResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="createContactUserResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/>
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/>
 *     &lt;enumeration value="PARAM_REQUIRED"/>
 *     &lt;enumeration value="USER_FIRST_NAME_EMPTY"/>
 *     &lt;enumeration value="USER_LAST_NAME_EMPTY"/>
 *     &lt;enumeration value="DUPLICATE_ADDRESS_ON_MEDIA_LOCATION"/>
 *     &lt;enumeration value="ADDRESS_MEDIA_EMPTY"/>
 *     &lt;enumeration value="ADDRESS_LOCATION_EMPTY"/>
 *     &lt;enumeration value="ADDRESS_PHONE_NUMBER_EMPTY"/>
 *     &lt;enumeration value="ADDRESS_EMAIL_EMPTY"/>
 *     &lt;enumeration value="ADDRESS_PHONE_NUMBER_INVALID"/>
 *     &lt;enumeration value="ADDRESS_EMAIL_INVALID"/>
 *     &lt;enumeration value="QUOTA_CONTACT_COUNT_EXCEDEED"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "createContactUserResultEnum")
@XmlEnum
public enum CreateContactUserResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    AUTHORIZATION_ERROR,
    PARAM_REQUIRED,
    USER_FIRST_NAME_EMPTY,
    USER_LAST_NAME_EMPTY,
    DUPLICATE_ADDRESS_ON_MEDIA_LOCATION,
    ADDRESS_MEDIA_EMPTY,
    ADDRESS_LOCATION_EMPTY,
    ADDRESS_PHONE_NUMBER_EMPTY,
    ADDRESS_EMAIL_EMPTY,
    ADDRESS_PHONE_NUMBER_INVALID,
    ADDRESS_EMAIL_INVALID,
    QUOTA_CONTACT_COUNT_EXCEDEED;

    public String value() {
        return name();
    }

    public static CreateContactUserResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
