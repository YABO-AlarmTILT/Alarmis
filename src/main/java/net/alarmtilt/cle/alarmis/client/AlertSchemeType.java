
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for alertSchemeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="alertSchemeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PERSONAL"/>
 *     &lt;enumeration value="GLOBAL"/>
 *     &lt;enumeration value="MEDIA_SELECTION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "alertSchemeType")
@XmlEnum
public enum AlertSchemeType {

    PERSONAL,
    GLOBAL,
    MEDIA_SELECTION;

    public String value() {
        return name();
    }

    public static AlertSchemeType fromValue(String v) {
        return valueOf(v);
    }

}
