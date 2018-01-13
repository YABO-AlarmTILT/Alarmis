
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for mediaDeviceType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="mediaDeviceType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="IOS"/>
 *     &lt;enumeration value="ANDROID"/>
 *     &lt;enumeration value="BLACKBERRY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "mediaDeviceType")
@XmlEnum
public enum MediaDeviceType {

    IOS,
    ANDROID,
    BLACKBERRY;

    public String value() {
        return name();
    }

    public static MediaDeviceType fromValue(String v) {
        return valueOf(v);
    }

}
