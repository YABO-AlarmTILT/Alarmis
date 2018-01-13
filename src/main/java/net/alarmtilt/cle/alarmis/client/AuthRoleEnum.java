
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authRoleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="authRoleEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DESTINATION"/>
 *     &lt;enumeration value="ADMINISTRATOR"/>
 *     &lt;enumeration value="AUDITOR"/>
 *     &lt;enumeration value="ACCESS_MANAGER"/>
 *     &lt;enumeration value="DIRECTORY_MANAGER"/>
 *     &lt;enumeration value="PROCEDURE_LAUNCHER"/>
 *     &lt;enumeration value="PROCEDURE_MANAGER"/>
 *     &lt;enumeration value="CUSTOM_ROLE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "authRoleEnum")
@XmlEnum
public enum AuthRoleEnum {

    DESTINATION,
    ADMINISTRATOR,
    AUDITOR,
    ACCESS_MANAGER,
    DIRECTORY_MANAGER,
    PROCEDURE_LAUNCHER,
    PROCEDURE_MANAGER,
    CUSTOM_ROLE;

    public String value() {
        return name();
    }

    public static AuthRoleEnum fromValue(String v) {
        return valueOf(v);
    }

}
