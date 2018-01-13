
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for launchProcedureResultInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="launchProcedureResultInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relatedCollectionIndex" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}launchProcedureResultEnum" minOccurs="0"/>
 *         &lt;element name="resultRelatedData" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="severity" type="{com.alarmtilt.webservice.soap.res.v3}severityEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "launchProcedureResultInfo", propOrder = {
    "relatedCollectionIndex",
    "result",
    "resultRelatedData",
    "severity"
})
public class LaunchProcedureResultInfo {

    protected Integer relatedCollectionIndex;
    protected LaunchProcedureResultEnum result;
    protected String resultRelatedData;
    protected SeverityEnum severity;

    /**
     * Gets the value of the relatedCollectionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRelatedCollectionIndex() {
        return relatedCollectionIndex;
    }

    /**
     * Sets the value of the relatedCollectionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRelatedCollectionIndex(Integer value) {
        this.relatedCollectionIndex = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link LaunchProcedureResultEnum }
     *     
     */
    public LaunchProcedureResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link LaunchProcedureResultEnum }
     *     
     */
    public void setResult(LaunchProcedureResultEnum value) {
        this.result = value;
    }

    /**
     * Gets the value of the resultRelatedData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultRelatedData() {
        return resultRelatedData;
    }

    /**
     * Sets the value of the resultRelatedData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultRelatedData(String value) {
        this.resultRelatedData = value;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link SeverityEnum }
     *     
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeverityEnum }
     *     
     */
    public void setSeverity(SeverityEnum value) {
        this.severity = value;
    }

}
