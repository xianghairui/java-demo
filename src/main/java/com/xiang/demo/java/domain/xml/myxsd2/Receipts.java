
package com.xiang.demo.java.domain.xml.myxsd2;

import java.math.BigDecimal;
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
 *         &lt;element name="guid"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="36"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="appType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="appTime"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="appStatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ebpCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="50"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ebpName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ebcCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ebcName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="orderNo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="payCode" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="payName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="payNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="60"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="charge"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="19"/&gt;
 *               &lt;fractionDigits value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="currency"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="accountingDate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="14"/&gt;
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
    "guid",
    "appType",
    "appTime",
    "appStatus",
    "ebpCode",
    "ebpName",
    "ebcCode",
    "ebcName",
    "orderNo",
    "payCode",
    "payName",
    "payNo",
    "charge",
    "currency",
    "accountingDate",
    "note"
})
@XmlRootElement(name = "Receipts", namespace = "http://www.chinaport.gov.cn/ceb")
public class Receipts {

    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String guid;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String appType;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String appTime;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true, defaultValue = "2")
    protected String appStatus;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String ebpCode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String ebpName;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String ebcCode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String ebcName;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String orderNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String payCode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String payName;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String payNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected BigDecimal charge;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String currency;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String accountingDate;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String note;

    /**
     * Gets the value of the guid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuid() {
        return guid;
    }

    /**
     * Sets the value of the guid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuid(String value) {
        this.guid = value;
    }

    /**
     * Gets the value of the appType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppType() {
        return appType;
    }

    /**
     * Sets the value of the appType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppType(String value) {
        this.appType = value;
    }

    /**
     * Gets the value of the appTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppTime() {
        return appTime;
    }

    /**
     * Sets the value of the appTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppTime(String value) {
        this.appTime = value;
    }

    /**
     * Gets the value of the appStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * Sets the value of the appStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppStatus(String value) {
        this.appStatus = value;
    }

    /**
     * Gets the value of the ebpCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbpCode() {
        return ebpCode;
    }

    /**
     * Sets the value of the ebpCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbpCode(String value) {
        this.ebpCode = value;
    }

    /**
     * Gets the value of the ebpName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbpName() {
        return ebpName;
    }

    /**
     * Sets the value of the ebpName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbpName(String value) {
        this.ebpName = value;
    }

    /**
     * Gets the value of the ebcCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbcCode() {
        return ebcCode;
    }

    /**
     * Sets the value of the ebcCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbcCode(String value) {
        this.ebcCode = value;
    }

    /**
     * Gets the value of the ebcName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEbcName() {
        return ebcName;
    }

    /**
     * Sets the value of the ebcName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEbcName(String value) {
        this.ebcName = value;
    }

    /**
     * Gets the value of the orderNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * Sets the value of the orderNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderNo(String value) {
        this.orderNo = value;
    }

    /**
     * Gets the value of the payCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayCode() {
        return payCode;
    }

    /**
     * Sets the value of the payCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayCode(String value) {
        this.payCode = value;
    }

    /**
     * Gets the value of the payName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayName() {
        return payName;
    }

    /**
     * Sets the value of the payName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayName(String value) {
        this.payName = value;
    }

    /**
     * Gets the value of the payNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * Sets the value of the payNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayNo(String value) {
        this.payNo = value;
    }

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCharge(BigDecimal value) {
        this.charge = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the accountingDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingDate() {
        return accountingDate;
    }

    /**
     * Sets the value of the accountingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingDate(String value) {
        this.accountingDate = value;
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
