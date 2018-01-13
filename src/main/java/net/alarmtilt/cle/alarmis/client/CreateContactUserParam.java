
package net.alarmtilt.cle.alarmis.client;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createContactUserParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createContactUserParam">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualizeContactToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addresses" type="{com.alarmtilt.webservice.soap.res.v3}ContactUserAddress" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="attributes" type="{com.alarmtilt.webservice.soap.res.v3}ContactUserAttributeVariableValue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="language" type="{com.alarmtilt.webservice.soap.res.v3}supportedLanguage" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="muTokenId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createContactUserParam", propOrder = {
    "actualizeContactToken",
    "addresses",
    "attributes",
    "firstName",
    "language",
    "lastName",
    "muTokenId"
})
public class CreateContactUserParam {

    protected String actualizeContactToken;
    @XmlElement(nillable = true)
    protected List<ContactUserAddress> addresses;
    @XmlElement(nillable = true)
    protected List<ContactUserAttributeVariableValue> attributes;
    protected String firstName;
    protected SupportedLanguage language;
    protected String lastName;
    protected String muTokenId;

    /**
     * Gets the value of the actualizeContactToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActualizeContactToken() {
        return actualizeContactToken;
    }

    /**
     * Sets the value of the actualizeContactToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActualizeContactToken(String value) {
        this.actualizeContactToken = value;
    }

    /**
     * Gets the value of the addresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactUserAddress }
     * 
     * 
     */
    public List<ContactUserAddress> getAddresses() {
        if (addresses == null) {
            addresses = new ArrayList<ContactUserAddress>();
        }
        return this.addresses;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactUserAttributeVariableValue }
     * 
     * 
     */
    public List<ContactUserAttributeVariableValue> getAttributes() {
        if (attributes == null) {
            attributes = new ArrayList<ContactUserAttributeVariableValue>();
        }
        return this.attributes;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link SupportedLanguage }
     *     
     */
    public SupportedLanguage getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupportedLanguage }
     *     
     */
    public void setLanguage(SupportedLanguage value) {
        this.language = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the muTokenId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuTokenId() {
        return muTokenId;
    }

    /**
     * Sets the value of the muTokenId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuTokenId(String value) {
        this.muTokenId = value;
    }

}
