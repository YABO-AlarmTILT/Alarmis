
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for exportAgendaResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="exportAgendaResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/>
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/>
 *     &lt;enumeration value="NAME_REQUIRED"/>
 *     &lt;enumeration value="AGENDA_DOES_NOT_EXISTS"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "exportAgendaResultEnum")
@XmlEnum
public enum ExportAgendaResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    AUTHORIZATION_ERROR,
    NAME_REQUIRED,
    AGENDA_DOES_NOT_EXISTS;

    public String value() {
        return name();
    }

    public static ExportAgendaResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
