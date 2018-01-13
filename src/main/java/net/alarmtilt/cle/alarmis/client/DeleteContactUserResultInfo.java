
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteContactUserResultInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteContactUserResultInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resultRelatedDataInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
@XmlType(name = "deleteContactUserResultInfo", propOrder = {
    "resultRelatedDataInfo",
    "severity"
})
public class DeleteContactUserResultInfo {

    protected String resultRelatedDataInfo;
    protected SeverityEnum severity;

    /**
     * Gets the value of the resultRelatedDataInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultRelatedDataInfo() {
        return resultRelatedDataInfo;
    }

    /**
     * Sets the value of the resultRelatedDataInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultRelatedDataInfo(String value) {
        this.resultRelatedDataInfo = value;
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
