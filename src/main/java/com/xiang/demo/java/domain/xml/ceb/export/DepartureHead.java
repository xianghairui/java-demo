
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
 *         &lt;element name="customsCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="copNo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="30"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="preNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="logisticsCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="logisticsName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trafMode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="trafName" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="voyageNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="32"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="billNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="37"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="leaveTime"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="14"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="msgCount"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;totalDigits value="9"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="msgSeqNo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;totalDigits value="9"/&gt;
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
    "customsCode",
    "copNo",
    "preNo",
    "logisticsCode",
    "logisticsName",
    "trafMode",
    "trafName",
    "voyageNo",
    "billNo",
    "leaveTime",
    "msgCount",
    "msgSeqNo",
    "note"
})
@XmlRootElement(name = "DepartureHead", namespace = "http://www.chinaport.gov.cn/ceb")
public class DepartureHead {

    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String guid;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String appType;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String appTime;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String appStatus;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String customsCode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String copNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String preNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String logisticsCode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String logisticsName;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String trafMode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String trafName;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String voyageNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String billNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String leaveTime;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected int msgCount;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected int msgSeqNo;
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
     * Gets the value of the customsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomsCode() {
        return customsCode;
    }

    /**
     * Sets the value of the customsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomsCode(String value) {
        this.customsCode = value;
    }

    /**
     * Gets the value of the copNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopNo() {
        return copNo;
    }

    /**
     * Sets the value of the copNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopNo(String value) {
        this.copNo = value;
    }

    /**
     * Gets the value of the preNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreNo() {
        return preNo;
    }

    /**
     * Sets the value of the preNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreNo(String value) {
        this.preNo = value;
    }

    /**
     * Gets the value of the logisticsCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsCode() {
        return logisticsCode;
    }

    /**
     * Sets the value of the logisticsCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsCode(String value) {
        this.logisticsCode = value;
    }

    /**
     * Gets the value of the logisticsName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsName() {
        return logisticsName;
    }

    /**
     * Sets the value of the logisticsName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsName(String value) {
        this.logisticsName = value;
    }

    /**
     * Gets the value of the trafMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafMode() {
        return trafMode;
    }

    /**
     * Sets the value of the trafMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafMode(String value) {
        this.trafMode = value;
    }

    /**
     * Gets the value of the trafName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrafName() {
        return trafName;
    }

    /**
     * Sets the value of the trafName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrafName(String value) {
        this.trafName = value;
    }

    /**
     * Gets the value of the voyageNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoyageNo() {
        return voyageNo;
    }

    /**
     * Sets the value of the voyageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoyageNo(String value) {
        this.voyageNo = value;
    }

    /**
     * Gets the value of the billNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBillNo() {
        return billNo;
    }

    /**
     * Sets the value of the billNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBillNo(String value) {
        this.billNo = value;
    }

    /**
     * Gets the value of the leaveTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLeaveTime() {
        return leaveTime;
    }

    /**
     * Sets the value of the leaveTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLeaveTime(String value) {
        this.leaveTime = value;
    }

    /**
     * Gets the value of the msgCount property.
     * 
     */
    public int getMsgCount() {
        return msgCount;
    }

    /**
     * Sets the value of the msgCount property.
     * 
     */
    public void setMsgCount(int value) {
        this.msgCount = value;
    }

    /**
     * Gets the value of the msgSeqNo property.
     * 
     */
    public int getMsgSeqNo() {
        return msgSeqNo;
    }

    /**
     * Sets the value of the msgSeqNo property.
     * 
     */
    public void setMsgSeqNo(int value) {
        this.msgSeqNo = value;
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
