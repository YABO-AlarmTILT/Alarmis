
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mediaType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="EMAIL"/>
 *     &lt;enumeration value="POSTAL"/>
 *     &lt;enumeration value="VOICE"/>
 *     &lt;enumeration value="FAX"/>
 *     &lt;enumeration value="IM"/>
 *     &lt;enumeration value="WEB"/>
 *     &lt;enumeration value="SMARTPHONE"/>
 *     &lt;enumeration value="GENERIC"/>
 *     &lt;enumeration value="FORM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mediaType")
@XmlEnum
public enum MediaType {

    SMS,
    EMAIL,
    POSTAL,
    VOICE,
    FAX,
    IM,
    WEB,
    SMARTPHONE,
    GENERIC,
    FORM;

    public String value() {
        return name();
    }

    public static MediaType fromValue(String v) {
        return valueOf(v);
    }

}
