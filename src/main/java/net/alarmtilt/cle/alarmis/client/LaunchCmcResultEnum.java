
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for launchCmcResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="launchCmcResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/>
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/>
 *     &lt;enumeration value="PARAM_REQUIRED"/>
 *     &lt;enumeration value="FILTER_REQUIRED"/>
 *     &lt;enumeration value="CMC_DEF_NOT_FOUND"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "launchCmcResultEnum")
@XmlEnum
public enum LaunchCmcResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    AUTHORIZATION_ERROR,
    PARAM_REQUIRED,
    FILTER_REQUIRED,
    CMC_DEF_NOT_FOUND;

    public String value() {
        return name();
    }

    public static LaunchCmcResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
