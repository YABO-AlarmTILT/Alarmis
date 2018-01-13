
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for listManagementUnitResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="listManagementUnitResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="listManagementUnitResult" type="{com.alarmtilt.webservice.soap.res.v3}listManagementUnitResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listManagementUnitResponse", propOrder = {
    "listManagementUnitResult"
})
public class ListManagementUnitResponse {

    protected ListManagementUnitResult listManagementUnitResult;

    /**
     * Gets the value of the listManagementUnitResult property.
     * 
     * @return
     *     possible object is
     *     {@link ListManagementUnitResult }
     *     
     */
    public ListManagementUnitResult getListManagementUnitResult() {
        return listManagementUnitResult;
    }

    /**
     * Sets the value of the listManagementUnitResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListManagementUnitResult }
     *     
     */
    public void setListManagementUnitResult(ListManagementUnitResult value) {
        this.listManagementUnitResult = value;
    }

}
