
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for launchProcedureResultEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="launchProcedureResultEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OK"/>
 *     &lt;enumeration value="AUTHENTICATION_ERROR"/>
 *     &lt;enumeration value="AUTHORIZATION_ERROR"/>
 *     &lt;enumeration value="PARAM_REQUIRED"/>
 *     &lt;enumeration value="PROCEDURE_DEFINITION_NOT_FOUND"/>
 *     &lt;enumeration value="PARAM_SIZE_EXCEEDED"/>
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_SMS_MEDIA_REQUIRED"/>
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_EMAIL_MEDIA_REQUIRED"/>
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_VOICE_MEDIA_REQUIRED"/>
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_FAX_MEDIA_REQUIRED"/>
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_WEB_MEDIA_REQUIRED"/>
 *     &lt;enumeration value="AT_LEAST_ONE_CONTACT_WITH_SMARTPHONE_MEDIA_REQUIRED"/>
 *     &lt;enumeration value="MAX_PROC_IN_LAUNCHED_STATE_COUNT_REACHED"/>
 *     &lt;enumeration value="PROCEDURE_DEFINITION_NOT_EXECUTABLE"/>
 *     &lt;enumeration value="PARAM_STEP_NOT_EXIST_WITH_NAME"/>
 *     &lt;enumeration value="PARAM_STEP_NAME_NOT_SET"/>
 *     &lt;enumeration value="PARAM_STEP_CONTACT_ID_OR_NAME_NOT_SET"/>
 *     &lt;enumeration value="PARAM_STEP_CONTACT_NOT_EXIST_WITH_ID"/>
 *     &lt;enumeration value="PARAM_STEP_CONTACT_NOT_EXIST_WITH_NAME"/>
 *     &lt;enumeration value="PARAM_VARIABLE_NAME_NOT_SET"/>
 *     &lt;enumeration value="PARAM_VARIABLE_NOT_EXIST_WITH_NAME"/>
 *     &lt;enumeration value="PARAM_VARIABLE_MANDATORY"/>
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_LIST"/>
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_RADIO"/>
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_NUMBER"/>
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_CHECKBOX"/>
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_DATE"/>
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_DATE_TIME"/>
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_TIME"/>
 *     &lt;enumeration value="PARAM_VARIABLE_VALUE_INVALID_NESTED_LIST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "launchProcedureResultEnum")
@XmlEnum
public enum LaunchProcedureResultEnum {

    OK,
    AUTHENTICATION_ERROR,
    AUTHORIZATION_ERROR,
    PARAM_REQUIRED,
    PROCEDURE_DEFINITION_NOT_FOUND,
    PARAM_SIZE_EXCEEDED,
    AT_LEAST_ONE_CONTACT_WITH_SMS_MEDIA_REQUIRED,
    AT_LEAST_ONE_CONTACT_WITH_EMAIL_MEDIA_REQUIRED,
    AT_LEAST_ONE_CONTACT_WITH_VOICE_MEDIA_REQUIRED,
    AT_LEAST_ONE_CONTACT_WITH_FAX_MEDIA_REQUIRED,
    AT_LEAST_ONE_CONTACT_WITH_WEB_MEDIA_REQUIRED,
    AT_LEAST_ONE_CONTACT_WITH_SMARTPHONE_MEDIA_REQUIRED,
    MAX_PROC_IN_LAUNCHED_STATE_COUNT_REACHED,
    PROCEDURE_DEFINITION_NOT_EXECUTABLE,
    PARAM_STEP_NOT_EXIST_WITH_NAME,
    PARAM_STEP_NAME_NOT_SET,
    PARAM_STEP_CONTACT_ID_OR_NAME_NOT_SET,
    PARAM_STEP_CONTACT_NOT_EXIST_WITH_ID,
    PARAM_STEP_CONTACT_NOT_EXIST_WITH_NAME,
    PARAM_VARIABLE_NAME_NOT_SET,
    PARAM_VARIABLE_NOT_EXIST_WITH_NAME,
    PARAM_VARIABLE_MANDATORY,
    PARAM_VARIABLE_VALUE_INVALID_LIST,
    PARAM_VARIABLE_VALUE_INVALID_RADIO,
    PARAM_VARIABLE_VALUE_INVALID_NUMBER,
    PARAM_VARIABLE_VALUE_INVALID_CHECKBOX,
    PARAM_VARIABLE_VALUE_INVALID_DATE,
    PARAM_VARIABLE_VALUE_INVALID_DATE_TIME,
    PARAM_VARIABLE_VALUE_INVALID_TIME,
    PARAM_VARIABLE_VALUE_INVALID_NESTED_LIST;

    public String value() {
        return name();
    }

    public static LaunchProcedureResultEnum fromValue(String v) {
        return valueOf(v);
    }

}
