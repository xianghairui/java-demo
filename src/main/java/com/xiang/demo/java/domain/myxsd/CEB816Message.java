
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
 *         &lt;element name="Tax" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element ref="{http://www.chinaport.gov.cn/ceb}TaxHeadRd"/&gt;
 *                   &lt;element ref="{http://www.chinaport.gov.cn/ceb}TaxListRd" maxOccurs="99"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "tax"
})
@XmlRootElement(name = "CEB816Message", namespace = "http://www.chinaport.gov.cn/ceb")
public class CEB816Message {

    @XmlElement(name = "Tax", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected List<CEB816Message.Tax> tax;
    @XmlAttribute(name = "guid", required = true)
    protected String guid;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the tax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CEB816Message.Tax }
     * 
     * 
     */
    public List<CEB816Message.Tax> getTax() {
        if (tax == null) {
            tax = new ArrayList<CEB816Message.Tax>();
        }
        return this.tax;
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
     *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}TaxHeadRd"/&gt;
     *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}TaxListRd" maxOccurs="99"/&gt;
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
        "taxHeadRd",
        "taxListRd"
    })
    public static class Tax {

        @XmlElement(name = "TaxHeadRd", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
        protected TaxHeadRd taxHeadRd;
        @XmlElement(name = "TaxListRd", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
        protected List<TaxListRd> taxListRd;

        /**
         * Gets the value of the taxHeadRd property.
         * 
         * @return
         *     possible object is
         *     {@link TaxHeadRd }
         *     
         */
        public TaxHeadRd getTaxHeadRd() {
            return taxHeadRd;
        }

        /**
         * Sets the value of the taxHeadRd property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxHeadRd }
         *     
         */
        public void setTaxHeadRd(TaxHeadRd value) {
            this.taxHeadRd = value;
        }

        /**
         * Gets the value of the taxListRd property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the taxListRd property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTaxListRd().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TaxListRd }
         * 
         * 
         */
        public List<TaxListRd> getTaxListRd() {
            if (taxListRd == null) {
                taxListRd = new ArrayList<TaxListRd>();
            }
            return this.taxListRd;
        }

    }

}
