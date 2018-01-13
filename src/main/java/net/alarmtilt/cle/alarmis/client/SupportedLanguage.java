
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supportedLanguage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="supportedLanguage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="EN"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="LU"/>
 *     &lt;enumeration value="DU"/>
 *     &lt;enumeration value="DK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "supportedLanguage")
@XmlEnum
public enum SupportedLanguage {

    FR,
    EN,
    DE,
    LU,
    DU,
    DK;

    public String value() {
        return name();
    }

    public static SupportedLanguage fromValue(String v) {
        return valueOf(v);
    }

}
