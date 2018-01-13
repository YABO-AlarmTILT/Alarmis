
package net.alarmtilt.cle.alarmis.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deleteContactUserResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deleteContactUserResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="deleteContactUserResultInfos" type="{com.alarmtilt.webservice.soap.res.v3}deleteContactUserResultInfo" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="result" type="{com.alarmtilt.webservice.soap.res.v3}deleteContactUserResultEnum" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "deleteContactUserResult", propOrder = {
    "deleteContactUserResultInfos",
    "result"
})
public class DeleteContactUserResult {

    @XmlElement(nillable = true)
    protected List<DeleteContactUserResultInfo> deleteContactUserResultInfos;
    protected DeleteContactUserResultEnum result;

    /**
     * Gets the value of the deleteContactUserResultInfos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the deleteContactUserResultInfos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeleteContactUserResultInfos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DeleteContactUserResultInfo }
     * 
     * 
     */
    public List<DeleteContactUserResultInfo> getDeleteContactUserResultInfos() {
        if (deleteContactUserResultInfos == null) {
            deleteContactUserResultInfos = new ArrayList<DeleteContactUserResultInfo>();
        }
        return this.deleteContactUserResultInfos;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteContactUserResultEnum }
     *     
     */
    public DeleteContactUserResultEnum getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteContactUserResultEnum }
     *     
     */
    public void setResult(DeleteContactUserResultEnum value) {
        this.result = value;
    }

}
