
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pingServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pingServiceResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pingServiceResult" type="{com.alarmtilt.webservice.soap.res.v3}pingServiceResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pingServiceResponse", propOrder = {
    "pingServiceResult"
})
public class PingServiceResponse {

    protected PingServiceResult pingServiceResult;

    /**
     * Gets the value of the pingServiceResult property.
     * 
     * @return
     *     possible object is
     *     {@link PingServiceResult }
     *     
     */
    public PingServiceResult getPingServiceResult() {
        return pingServiceResult;
    }

    /**
     * Sets the value of the pingServiceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link PingServiceResult }
     *     
     */
    public void setPingServiceResult(PingServiceResult value) {
        this.pingServiceResult = value;
    }

}
