
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for filterOpType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="filterOpType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="STARTS_WITH"/>
 *     &lt;enumeration value="CONTAINS"/>
 *     &lt;enumeration value="EQUALS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "filterOpType")
@XmlEnum
public enum FilterOpType {

    STARTS_WITH,
    CONTAINS,
    EQUALS;

    public String value() {
        return name();
    }

    public static FilterOpType fromValue(String v) {
        return valueOf(v);
    }

}
