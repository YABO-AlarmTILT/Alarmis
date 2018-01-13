
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for conditionEvaluationMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="conditionEvaluationMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="INTERSECTION"/>
 *     &lt;enumeration value="UNION"/>
 *     &lt;enumeration value="EXPRESSION"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "conditionEvaluationMode")
@XmlEnum
public enum ConditionEvaluationMode {

    INTERSECTION,
    UNION,
    EXPRESSION;

    public String value() {
        return name();
    }

    public static ConditionEvaluationMode fromValue(String v) {
        return valueOf(v);
    }

}
