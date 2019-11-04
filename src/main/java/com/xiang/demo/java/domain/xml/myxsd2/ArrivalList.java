
package com.xiang.demo.java.domain.xml.myxsd2;

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
 *         &lt;element name="gnum"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;totalDigits value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="logisticsNo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *               &lt;minLength value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="totalPackageNo" minOccurs="0"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="37"/&gt;
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
    "gnum",
    "logisticsNo",
    "totalPackageNo",
    "note"
})
@XmlRootElement(name = "ArrivalList", namespace = "http://www.chinaport.gov.cn/ceb")
public class ArrivalList {

    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected int gnum;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String logisticsNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String totalPackageNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected String note;

    /**
     * Gets the value of the gnum property.
     * 
     */
    public int getGnum() {
        return gnum;
    }

    /**
     * Sets the value of the gnum property.
     * 
     */
    public void setGnum(int value) {
        this.gnum = value;
    }

    /**
     * Gets the value of the logisticsNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogisticsNo() {
        return logisticsNo;
    }

    /**
     * Sets the value of the logisticsNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogisticsNo(String value) {
        this.logisticsNo = value;
    }

    /**
     * Gets the value of the totalPackageNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPackageNo() {
        return totalPackageNo;
    }

    /**
     * Sets the value of the totalPackageNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPackageNo(String value) {
        this.totalPackageNo = value;
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
