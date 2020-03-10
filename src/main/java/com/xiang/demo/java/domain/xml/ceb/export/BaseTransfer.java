
package com.xiang.demo.java.domain.xml.ceb.export;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="copCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="copName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dxpMode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="dxpId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="note" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="1000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "copCode",
    "copName",
    "dxpMode",
    "dxpId",
    "note"
})
@XmlRootElement(name = "BaseTransfer", namespace = "http://www.chinaport.gov.cn/ceb")
public class BaseTransfer {

    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String copCode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String copName;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String dxpMode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String dxpId;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String note;

    /**
     * Gets the value of the copCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopCode() {
        return copCode;
    }

    /**
     * Sets the value of the copCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopCode(String value) {
        this.copCode = value;
    }

    /**
     * Gets the value of the copName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopName() {
        return copName;
    }

    /**
     * Sets the value of the copName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopName(String value) {
        this.copName = value;
    }

    /**
     * Gets the value of the dxpMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDxpMode() {
        return dxpMode;
    }

    /**
     * Sets the value of the dxpMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDxpMode(String value) {
        this.dxpMode = value;
    }

    /**
     * Gets the value of the dxpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDxpId() {
        return dxpId;
    }

    /**
     * Sets the value of the dxpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDxpId(String value) {
        this.dxpId = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

}
