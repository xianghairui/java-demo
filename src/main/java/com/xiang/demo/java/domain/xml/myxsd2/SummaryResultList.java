
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
 *         &lt;element name="invtNo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="18"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="logisticsNo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;maxLength value="80"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gnum"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;totalDigits value="5"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="gcode"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="10"/&gt;
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
    "invtNo",
    "logisticsNo",
    "gnum",
    "gcode"
})
@XmlRootElement(name = "SummaryResultList", namespace = "http://www.chinaport.gov.cn/ceb")
public class SummaryResultList {

    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String invtNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String logisticsNo;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb")
    protected int gnum;
    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String gcode;

    /**
     * Gets the value of the invtNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvtNo() {
        return invtNo;
    }

    /**
     * Sets the value of the invtNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvtNo(String value) {
        this.invtNo = value;
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
     * Gets the value of the gcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGcode() {
        return gcode;
    }

    /**
     * Sets the value of the gcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGcode(String value) {
        this.gcode = value;
    }

}
