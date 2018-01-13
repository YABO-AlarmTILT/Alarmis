
package net.alarmtilt.cle.alarmis.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listManagementUnitResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listManagementUnitResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="managementUnits" type="{com.alarmtilt.webservice.soap.res.v3}managementUnit" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}listManagementUnitResultEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listManagementUnitResult", propOrder = {
    "managementUnits",
    "message",
    "result"
})
public class ListManagementUnitResult {

    @XmlElement(nillable = true)
    protected List<ManagementUnit> managementUnits;
    protected String message;
    protected ListManagementUnitResultEnum result;

    /**
     * Gets the value of the managementUnits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the managementUnits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getManagementUnits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ManagementUnit }
     * 
     * 
     */
    public List<ManagementUnit> getManagementUnits() {
        if (managementUnits == null) {
            managementUnits = new ArrayList<ManagementUnit>();
        }
        return this.managementUnits;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link ListManagementUnitResultEnum }
     *     
     */
    public ListManagementUnitResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListManagementUnitResultEnum }
     *     
     */
    public void setResult(ListManagementUnitResultEnum value) {
        this.result = value;
    }

}
