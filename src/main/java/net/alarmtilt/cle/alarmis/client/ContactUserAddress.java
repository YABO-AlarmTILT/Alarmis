
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContactUserAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContactUserAddress">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="confidential" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="location" type="{com.alarmtilt.webservice.soap.res.v3}mediaOrganisationalType" minOccurs="0"/>
 *         &lt;element name="media" type="{com.alarmtilt.webservice.soap.res.v3}mediaType" minOccurs="0"/>
 *         &lt;element name="timeoutInterval" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactUserAddress", propOrder = {
    "address",
    "confidential",
    "location",
    "media",
    "timeoutInterval"
})
public class ContactUserAddress {

    protected String address;
    protected boolean confidential;
    protected MediaOrganisationalType location;
    protected MediaType media;
    protected int timeoutInterval;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the confidential property.
     * 
     */
    public boolean isConfidential() {
        return confidential;
    }

    /**
     * Sets the value of the confidential property.
     * 
     */
    public void setConfidential(boolean value) {
        this.confidential = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link MediaOrganisationalType }
     *     
     */
    public MediaOrganisationalType getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaOrganisationalType }
     *     
     */
    public void setLocation(MediaOrganisationalType value) {
        this.location = value;
    }

    /**
     * Gets the value of the media property.
     * 
     * @return
     *     possible object is
     *     {@link MediaType }
     *     
     */
    public MediaType getMedia() {
        return media;
    }

    /**
     * Sets the value of the media property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaType }
     *     
     */
    public void setMedia(MediaType value) {
        this.media = value;
    }

    /**
     * Gets the value of the timeoutInterval property.
     * 
     */
    public int getTimeoutInterval() {
        return timeoutInterval;
    }

    /**
     * Sets the value of the timeoutInterval property.
     * 
     */
    public void setTimeoutInterval(int value) {
        this.timeoutInterval = value;
    }

}
