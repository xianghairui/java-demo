
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
 *         &lt;element name="invtNo"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;length value="18"/&gt;
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
    "invtNo"
})
@XmlRootElement(name = "SummaryApplyList", namespace = "http://www.chinaport.gov.cn/ceb")
public class SummaryApplyList {

    @XmlElement(namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected String invtNo;

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

}
