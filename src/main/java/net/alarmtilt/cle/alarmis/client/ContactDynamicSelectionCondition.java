
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for contactDynamicSelectionCondition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="contactDynamicSelectionCondition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="extendedToAuthorizedMUs" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extendedToAuthorizedMuTokens" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="variableOp" type="{com.alarmtilt.webservice.soap.res.v3}variableFilterOperator" minOccurs="0"/>
 *         &lt;element name="variableValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contactDynamicSelectionCondition", propOrder = {
    "extendedToAuthorizedMUs",
    "extendedToAuthorizedMuTokens",
    "variableKey",
    "variableOp",
    "variableValue"
})
public class ContactDynamicSelectionCondition {

    protected String extendedToAuthorizedMUs;
    protected String extendedToAuthorizedMuTokens;
    protected String variableKey;
    protected VariableFilterOperator variableOp;
    protected String variableValue;

    /**
     * Gets the value of the extendedToAuthorizedMUs property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedToAuthorizedMUs() {
        return extendedToAuthorizedMUs;
    }

    /**
     * Sets the value of the extendedToAuthorizedMUs property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedToAuthorizedMUs(String value) {
        this.extendedToAuthorizedMUs = value;
    }

    /**
     * Gets the value of the extendedToAuthorizedMuTokens property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtendedToAuthorizedMuTokens() {
        return extendedToAuthorizedMuTokens;
    }

    /**
     * Sets the value of the extendedToAuthorizedMuTokens property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtendedToAuthorizedMuTokens(String value) {
        this.extendedToAuthorizedMuTokens = value;
    }

    /**
     * Gets the value of the variableKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableKey() {
        return variableKey;
    }

    /**
     * Sets the value of the variableKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableKey(String value) {
        this.variableKey = value;
    }

    /**
     * Gets the value of the variableOp property.
     * 
     * @return
     *     possible object is
     *     {@link VariableFilterOperator }
     *     
     */
    public VariableFilterOperator getVariableOp() {
        return variableOp;
    }

    /**
     * Sets the value of the variableOp property.
     * 
     * @param value
     *     allowed object is
     *     {@link VariableFilterOperator }
     *     
     */
    public void setVariableOp(VariableFilterOperator value) {
        this.variableOp = value;
    }

    /**
     * Gets the value of the variableValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVariableValue() {
        return variableValue;
    }

    /**
     * Sets the value of the variableValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVariableValue(String value) {
        this.variableValue = value;
    }

}
