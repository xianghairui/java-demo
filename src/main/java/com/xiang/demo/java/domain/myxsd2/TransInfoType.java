
package com.xiang.demo.java.domain.myxsd2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ClientNode
 * 
 * <p>Java class for TransInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TransInfoType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CopMsgId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="255"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="SenderId"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="16"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ReceiverIds"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="ReceiverId" maxOccurs="5"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;maxLength value="16"/&gt;
 *                         &lt;minLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="CreatTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="MsgType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="0"/&gt;
 *               &lt;maxLength value="30"/&gt;
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
@XmlType(name = "TransInfoType", namespace = "http://www.chinaport.gov.cn/dxp", propOrder = {
    "copMsgId",
    "senderId",
    "receiverIds",
    "creatTime",
    "msgType"
})
public class TransInfoType {

    @XmlElement(name = "CopMsgId", namespace = "http://www.chinaport.gov.cn/dxp", required = true)
    protected String copMsgId;
    @XmlElement(name = "SenderId", namespace = "http://www.chinaport.gov.cn/dxp", required = true)
    protected String senderId;
    @XmlElement(name = "ReceiverIds", namespace = "http://www.chinaport.gov.cn/dxp", required = true)
    protected TransInfoType.ReceiverIds receiverIds;
    @XmlElement(name = "CreatTime", namespace = "http://www.chinaport.gov.cn/dxp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creatTime;
    @XmlElement(name = "MsgType", namespace = "http://www.chinaport.gov.cn/dxp", required = true)
    protected String msgType;

    /**
     * Gets the value of the copMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopMsgId() {
        return copMsgId;
    }

    /**
     * Sets the value of the copMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopMsgId(String value) {
        this.copMsgId = value;
    }

    /**
     * Gets the value of the senderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderId() {
        return senderId;
    }

    /**
     * Sets the value of the senderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderId(String value) {
        this.senderId = value;
    }

    /**
     * Gets the value of the receiverIds property.
     * 
     * @return
     *     possible object is
     *     {@link TransInfoType.ReceiverIds }
     *     
     */
    public TransInfoType.ReceiverIds getReceiverIds() {
        return receiverIds;
    }

    /**
     * Sets the value of the receiverIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransInfoType.ReceiverIds }
     *     
     */
    public void setReceiverIds(TransInfoType.ReceiverIds value) {
        this.receiverIds = value;
    }

    /**
     * Gets the value of the creatTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatTime() {
        return creatTime;
    }

    /**
     * Sets the value of the creatTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatTime(XMLGregorianCalendar value) {
        this.creatTime = value;
    }

    /**
     * Gets the value of the msgType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgType() {
        return msgType;
    }

    /**
     * Sets the value of the msgType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgType(String value) {
        this.msgType = value;
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
     *         &lt;element name="ReceiverId" maxOccurs="5"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;maxLength value="16"/&gt;
     *               &lt;minLength value="1"/&gt;
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
        "receiverId"
    })
    public static class ReceiverIds {

        @XmlElement(name = "ReceiverId", namespace = "http://www.chinaport.gov.cn/dxp", required = true)
        protected List<String> receiverId;

        /**
         * Gets the value of the receiverId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the receiverId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getReceiverId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getReceiverId() {
            if (receiverId == null) {
                receiverId = new ArrayList<String>();
            }
            return this.receiverId;
        }

    }

}
