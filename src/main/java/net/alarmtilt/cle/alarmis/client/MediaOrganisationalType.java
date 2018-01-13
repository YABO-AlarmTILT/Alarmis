
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaOrganisationalType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mediaOrganisationalType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MEDIA_ORG_PRO"/>
 *     &lt;enumeration value="MEDIA_ORG_HOME"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mediaOrganisationalType")
@XmlEnum
public enum MediaOrganisationalType {

    MEDIA_ORG_PRO,
    MEDIA_ORG_HOME;

    public String value() {
        return name();
    }

    public static MediaOrganisationalType fromValue(String v) {
        return valueOf(v);
    }

}
