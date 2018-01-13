
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variableTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="variableTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TEXT"/>
 *     &lt;enumeration value="TEXTAREA"/>
 *     &lt;enumeration value="DATE"/>
 *     &lt;enumeration value="DATE_TIME"/>
 *     &lt;enumeration value="TIME"/>
 *     &lt;enumeration value="NUMBER"/>
 *     &lt;enumeration value="LIST"/>
 *     &lt;enumeration value="LIST_MULTI"/>
 *     &lt;enumeration value="RADIO"/>
 *     &lt;enumeration value="NESTED_LIST"/>
 *     &lt;enumeration value="DATA_LIST"/>
 *     &lt;enumeration value="CHECKBOX"/>
 *     &lt;enumeration value="CHECKBOX_MULTI"/>
 *     &lt;enumeration value="ENTITY"/>
 *     &lt;enumeration value="LIST_OF_ENTITY"/>
 *     &lt;enumeration value="TEXT_DISPLAY"/>
 *     &lt;enumeration value="SYSTEM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "variableTypeEnum")
@XmlEnum
public enum VariableTypeEnum {

    TEXT,
    TEXTAREA,
    DATE,
    DATE_TIME,
    TIME,
    NUMBER,
    LIST,
    LIST_MULTI,
    RADIO,
    NESTED_LIST,
    DATA_LIST,
    CHECKBOX,
    CHECKBOX_MULTI,
    ENTITY,
    LIST_OF_ENTITY,
    TEXT_DISPLAY,
    SYSTEM;

    public String value() {
        return name();
    }

    public static VariableTypeEnum fromValue(String v) {
        return valueOf(v);
    }

}
