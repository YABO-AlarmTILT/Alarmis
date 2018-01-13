
package net.alarmtilt.cle.alarmis.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for wsAttachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="wsAttachment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="attachmentContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="attachmentMimeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="attachmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "wsAttachment", propOrder = {
    "attachmentContent",
    "attachmentMimeType",
    "attachmentName"
})
public class WsAttachment {

    protected byte[] attachmentContent;
    protected String attachmentMimeType;
    protected String attachmentName;

    /**
     * Gets the value of the attachmentContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getAttachmentContent() {
        return attachmentContent;
    }

    /**
     * Sets the value of the attachmentContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setAttachmentContent(byte[] value) {
        this.attachmentContent = ((byte[]) value);
    }

    /**
     * Gets the value of the attachmentMimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentMimeType() {
        return attachmentMimeType;
    }

    /**
     * Sets the value of the attachmentMimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentMimeType(String value) {
        this.attachmentMimeType = value;
    }

    /**
     * Gets the value of the attachmentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttachmentName() {
        return attachmentName;
    }

    /**
     * Sets the value of the attachmentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttachmentName(String value) {
        this.attachmentName = value;
    }

}
