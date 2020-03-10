
package com.xiang.demo.java.domain.xml.ceb.export;

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
 *         &lt;element name="customsCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="sumNo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="opDate"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="17"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="declSeqNo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="decTmpNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="decPreNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="entryId" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="decState"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="3"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="agentCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="agentName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ebcCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ebcName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="declAgentCode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="declAgentName"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="grossWeight"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="19"/&gt;
 *               &lt;fractionDigits value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="netWeight"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}decimal"&gt;
 *               &lt;totalDigits value="19"/&gt;
 *               &lt;fractionDigits value="5"/&gt;
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
    "customsCode",
    "sumNo",
    "opDate",
    "declSeqNo",
    "decTmpNo",
    "decPreNo",
    "entryId",
    "decState",
    "agentCode",
    "agentName",
    "ebcCode",
    "ebcName",
    "declAgentCode",
    "declAgentName",
    "grossWeight",
    "netWeight",
    "msgCount",
    "msgSeqNo",
    "note"
})
@XmlRootElement(name = "SummaryResultHead", namespace = "http://www.chinaport.gov.cn/ceb")
public class SummaryResultHead {

    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String guid;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String customsCode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String sumNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String opDate;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String declSeqNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String decTmpNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String decPreNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String entryId;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String decState;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String agentCode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String agentName;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String ebcCode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String ebcName;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String declAgentCode;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String declAgentName;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected BigDecimal grossWeight;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected BigDecimal netWeight;
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
     * Gets the value of the sumNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSumNo() {
        return sumNo;
    }

    /**
     * Sets the value of the sumNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSumNo(String value) {
        this.sumNo = value;
    }

    /**
     * Gets the value of the opDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpDate() {
        return opDate;
    }

    /**
     * Sets the value of the opDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpDate(String value) {
        this.opDate = value;
    }

    /**
     * Gets the value of the declSeqNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclSeqNo() {
        return declSeqNo;
    }

    /**
     * Sets the value of the declSeqNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclSeqNo(String value) {
        this.declSeqNo = value;
    }

    /**
     * Gets the value of the decTmpNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecTmpNo() {
        return decTmpNo;
    }

    /**
     * Sets the value of the decTmpNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecTmpNo(String value) {
        this.decTmpNo = value;
    }

    /**
     * Gets the value of the decPreNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecPreNo() {
        return decPreNo;
    }

    /**
     * Sets the value of the decPreNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecPreNo(String value) {
        this.decPreNo = value;
    }

    /**
     * Gets the value of the entryId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * Sets the value of the entryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryId(String value) {
        this.entryId = value;
    }

    /**
     * Gets the value of the decState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDecState() {
        return decState;
    }

    /**
     * Sets the value of the decState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDecState(String value) {
        this.decState = value;
    }

    /**
     * Gets the value of the agentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentCode() {
        return agentCode;
    }

    /**
     * Sets the value of the agentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentCode(String value) {
        this.agentCode = value;
    }

    /**
     * Gets the value of the agentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentName() {
        return agentName;
    }

    /**
     * Sets the value of the agentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentName(String value) {
        this.agentName = value;
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
     * Gets the value of the declAgentCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclAgentCode() {
        return declAgentCode;
    }

    /**
     * Sets the value of the declAgentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclAgentCode(String value) {
        this.declAgentCode = value;
    }

    /**
     * Gets the value of the declAgentName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeclAgentName() {
        return declAgentName;
    }

    /**
     * Sets the value of the declAgentName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeclAgentName(String value) {
        this.declAgentName = value;
    }

    /**
     * Gets the value of the grossWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getGrossWeight() {
        return grossWeight;
    }

    /**
     * Sets the value of the grossWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setGrossWeight(BigDecimal value) {
        this.grossWeight = value;
    }

    /**
     * Gets the value of the netWeight property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNetWeight() {
        return netWeight;
    }

    /**
     * Sets the value of the netWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNetWeight(BigDecimal value) {
        this.netWeight = value;
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
