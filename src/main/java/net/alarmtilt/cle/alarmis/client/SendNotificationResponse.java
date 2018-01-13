
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sendNotificationResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sendNotificationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sendNotificationResult" type="{com.alarmtilt.webservice.soap.res.v3}sendNotificationResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sendNotificationResponse", propOrder = {
    "sendNotificationResult"
})
public class SendNotificationResponse {

    protected SendNotificationResult sendNotificationResult;

    /**
     * Gets the value of the sendNotificationResult property.
     * 
     * @return
     *     possible object is
     *     {@link SendNotificationResult }
     *     
     */
    public SendNotificationResult getSendNotificationResult() {
        return sendNotificationResult;
    }

    /**
     * Sets the value of the sendNotificationResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SendNotificationResult }
     *     
     */
    public void setSendNotificationResult(SendNotificationResult value) {
        this.sendNotificationResult = value;
    }

}
