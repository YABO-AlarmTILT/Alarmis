
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for cmcDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="cmcDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="creationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inviteConfcallProcedureForm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="inviteConfcallProcedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="inviteConfcallProcedureToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openCmcProcedureForm" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="openCmcProcedureName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="openCmcProcedureToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cmcDefinition", propOrder = {
    "creationDate",
    "description",
    "inviteConfcallProcedureForm",
    "inviteConfcallProcedureName",
    "inviteConfcallProcedureToken",
    "name",
    "openCmcProcedureForm",
    "openCmcProcedureName",
    "openCmcProcedureToken",
    "token"
})
public class CmcDefinition {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDate;
    protected String description;
    protected boolean inviteConfcallProcedureForm;
    protected String inviteConfcallProcedureName;
    protected String inviteConfcallProcedureToken;
    protected String name;
    protected boolean openCmcProcedureForm;
    protected String openCmcProcedureName;
    protected String openCmcProcedureToken;
    protected String token;

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the inviteConfcallProcedureForm property.
     * 
     */
    public boolean isInviteConfcallProcedureForm() {
        return inviteConfcallProcedureForm;
    }

    /**
     * Sets the value of the inviteConfcallProcedureForm property.
     * 
     */
    public void setInviteConfcallProcedureForm(boolean value) {
        this.inviteConfcallProcedureForm = value;
    }

    /**
     * Gets the value of the inviteConfcallProcedureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteConfcallProcedureName() {
        return inviteConfcallProcedureName;
    }

    /**
     * Sets the value of the inviteConfcallProcedureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteConfcallProcedureName(String value) {
        this.inviteConfcallProcedureName = value;
    }

    /**
     * Gets the value of the inviteConfcallProcedureToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInviteConfcallProcedureToken() {
        return inviteConfcallProcedureToken;
    }

    /**
     * Sets the value of the inviteConfcallProcedureToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInviteConfcallProcedureToken(String value) {
        this.inviteConfcallProcedureToken = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the openCmcProcedureForm property.
     * 
     */
    public boolean isOpenCmcProcedureForm() {
        return openCmcProcedureForm;
    }

    /**
     * Sets the value of the openCmcProcedureForm property.
     * 
     */
    public void setOpenCmcProcedureForm(boolean value) {
        this.openCmcProcedureForm = value;
    }

    /**
     * Gets the value of the openCmcProcedureName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenCmcProcedureName() {
        return openCmcProcedureName;
    }

    /**
     * Sets the value of the openCmcProcedureName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenCmcProcedureName(String value) {
        this.openCmcProcedureName = value;
    }

    /**
     * Gets the value of the openCmcProcedureToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenCmcProcedureToken() {
        return openCmcProcedureToken;
    }

    /**
     * Sets the value of the openCmcProcedureToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenCmcProcedureToken(String value) {
        this.openCmcProcedureToken = value;
    }

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

}
