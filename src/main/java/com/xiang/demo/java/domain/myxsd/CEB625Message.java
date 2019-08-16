
package com.xiang.demo.java.domain.myxsd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="InvtRefund" maxOccurs="100"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.chinaport.gov.cn/ceb}InvtRefundHead"/&gt;
 *                   &lt;element ref="{http://www.chinaport.gov.cn/ceb}InvtRefundList" maxOccurs="99"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}BaseTransfer"/&gt;
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}BaseSubscribe" maxOccurs="5" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}ExtendMessage" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="guid" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;length value="36"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *       &lt;attribute name="version" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *             &lt;maxLength value="10"/&gt;
 *             &lt;minLength value="1"/&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "invtRefund",
    "baseTransfer",
    "baseSubscribe",
    "extendMessage"
})
@XmlRootElement(name = "CEB625Message", namespace = "http://www.chinaport.gov.cn/ceb")
public class CEB625Message {

    @XmlElement(name = "InvtRefund", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected List<CEB625Message.InvtRefund> invtRefund;
    @XmlElement(name = "BaseTransfer", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected BaseTransfer baseTransfer;
    @XmlElement(name = "BaseSubscribe", namespace = "http://www.chinaport.gov.cn/ceb")
    protected List<BaseSubscribe> baseSubscribe;
    @XmlElement(name = "ExtendMessage", namespace = "http://www.chinaport.gov.cn/ceb")
    protected ExtendMessage extendMessage;
    @XmlAttribute(name = "guid", required = true)
    protected String guid;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the invtRefund property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invtRefund property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvtRefund().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CEB625Message.InvtRefund }
     * 
     * 
     */
    public List<CEB625Message.InvtRefund> getInvtRefund() {
        if (invtRefund == null) {
            invtRefund = new ArrayList<CEB625Message.InvtRefund>();
        }
        return this.invtRefund;
    }

    /**
     * Gets the value of the baseTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link BaseTransfer }
     *     
     */
    public BaseTransfer getBaseTransfer() {
        return baseTransfer;
    }

    /**
     * Sets the value of the baseTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaseTransfer }
     *     
     */
    public void setBaseTransfer(BaseTransfer value) {
        this.baseTransfer = value;
    }

    /**
     * Gets the value of the baseSubscribe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseSubscribe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseSubscribe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaseSubscribe }
     * 
     * 
     */
    public List<BaseSubscribe> getBaseSubscribe() {
        if (baseSubscribe == null) {
            baseSubscribe = new ArrayList<BaseSubscribe>();
        }
        return this.baseSubscribe;
    }

    /**
     * Gets the value of the extendMessage property.
     * 
     * @return
     *     possible object is
     *     {@link ExtendMessage }
     *     
     */
    public ExtendMessage getExtendMessage() {
        return extendMessage;
    }

    /**
     * Sets the value of the extendMessage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtendMessage }
     *     
     */
    public void setExtendMessage(ExtendMessage value) {
        this.extendMessage = value;
    }

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
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }


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
     *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}InvtRefundHead"/&gt;
     *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}InvtRefundList" maxOccurs="99"/&gt;
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
        "invtRefundHead",
        "invtRefundList"
    })
    public static class InvtRefund {

        @XmlElement(name = "InvtRefundHead", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
        protected InvtRefundHead invtRefundHead;
        @XmlElement(name = "InvtRefundList", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
        protected List<InvtRefundList> invtRefundList;

        /**
         * Gets the value of the invtRefundHead property.
         * 
         * @return
         *     possible object is
         *     {@link InvtRefundHead }
         *     
         */
        public InvtRefundHead getInvtRefundHead() {
            return invtRefundHead;
        }

        /**
         * Sets the value of the invtRefundHead property.
         * 
         * @param value
         *     allowed object is
         *     {@link InvtRefundHead }
         *     
         */
        public void setInvtRefundHead(InvtRefundHead value) {
            this.invtRefundHead = value;
        }

        /**
         * Gets the value of the invtRefundList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the invtRefundList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInvtRefundList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link InvtRefundList }
         * 
         * 
         */
        public List<InvtRefundList> getInvtRefundList() {
            if (invtRefundList == null) {
                invtRefundList = new ArrayList<InvtRefundList>();
            }
            return this.invtRefundList;
        }

    }

}
