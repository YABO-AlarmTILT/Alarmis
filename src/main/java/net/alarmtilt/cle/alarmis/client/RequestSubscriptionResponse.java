
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for requestSubscriptionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="requestSubscriptionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="requestSubscriptionResult" type="{com.alarmtilt.webservice.soap.res.v3}requestSubscriptionResult" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "requestSubscriptionResponse", propOrder = {
    "requestSubscriptionResult"
})
public class RequestSubscriptionResponse {

    protected RequestSubscriptionResult requestSubscriptionResult;

    /**
     * Gets the value of the requestSubscriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link RequestSubscriptionResult }
     *     
     */
    public RequestSubscriptionResult getRequestSubscriptionResult() {
        return requestSubscriptionResult;
    }

    /**
     * Sets the value of the requestSubscriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestSubscriptionResult }
     *     
     */
    public void setRequestSubscriptionResult(RequestSubscriptionResult value) {
        this.requestSubscriptionResult = value;
    }

}
