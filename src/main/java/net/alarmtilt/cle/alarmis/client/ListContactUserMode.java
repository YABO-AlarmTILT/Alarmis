
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listContactUserMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="listContactUserMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CLASSIC"/>
 *     &lt;enumeration value="DYNAMIC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "listContactUserMode")
@XmlEnum
public enum ListContactUserMode {

    CLASSIC,
    DYNAMIC;

    public String value() {
        return name();
    }

    public static ListContactUserMode fromValue(String v) {
        return valueOf(v);
    }

}
