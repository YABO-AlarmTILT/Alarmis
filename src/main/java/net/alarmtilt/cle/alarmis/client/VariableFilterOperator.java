
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for variableFilterOperator.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="variableFilterOperator">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="FILTER_OP_STARTS_WITH"/>
 *     &lt;enumeration value="FILTER_OP_CONTAINS"/>
 *     &lt;enumeration value="FILTER_OP_EQUALS"/>
 *     &lt;enumeration value="FILTER_OP_NOT_EQUALS"/>
 *     &lt;enumeration value="FILTER_OP_LESS_EQUALS"/>
 *     &lt;enumeration value="FILTER_OP_LESS_THAN"/>
 *     &lt;enumeration value="FILTER_OP_GREAT_EQUALS"/>
 *     &lt;enumeration value="FILTER_OP_GREAT_THAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "variableFilterOperator")
@XmlEnum
public enum VariableFilterOperator {

    FILTER_OP_STARTS_WITH,
    FILTER_OP_CONTAINS,
    FILTER_OP_EQUALS,
    FILTER_OP_NOT_EQUALS,
    FILTER_OP_LESS_EQUALS,
    FILTER_OP_LESS_THAN,
    FILTER_OP_GREAT_EQUALS,
    FILTER_OP_GREAT_THAN;

    public String value() {
        return name();
    }

    public static VariableFilterOperator fromValue(String v) {
        return valueOf(v);
    }

}
