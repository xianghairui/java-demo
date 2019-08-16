
package com.xiang.demo.java.domain.myxsd2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="TransInfo" type="{http://www.chinaport.gov.cn/dxp}TransInfoType"/&gt;
 *         &lt;element name="Data" type="{http://www.chinaport.gov.cn/dxp}Data"/&gt;
 *         &lt;element name="AddInfo" type="{http://www.chinaport.gov.cn/dxp}AddInfo" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="ver" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="1.0" /&gt;
 *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "transInfo",
    "data",
    "addInfo"
})
@XmlRootElement(name = "DxpMsg", namespace = "http://www.chinaport.gov.cn/dxp")
public class DxpMsg {

    @XmlElement(name = "TransInfo", namespace = "http://www.chinaport.gov.cn/dxp", required = true)
    protected TransInfoType transInfo;
    @XmlElement(name = "Data", namespace = "http://www.chinaport.gov.cn/dxp", required = true)
    protected Data data;
    @XmlElement(name = "AddInfo", namespace = "http://www.chinaport.gov.cn/dxp")
    protected AddInfo addInfo;
    @XmlAttribute(name = "ver", required = true)
    protected String ver;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

    /**
     * Gets the value of the transInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TransInfoType }
     *     
     */
    public TransInfoType getTransInfo() {
        return transInfo;
    }

    /**
     * Sets the value of the transInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransInfoType }
     *     
     */
    public void setTransInfo(TransInfoType value) {
        this.transInfo = value;
    }

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Data }
     *     
     */
    public Data getData() {
        return data;
    }

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Data }
     *     
     */
    public void setData(Data value) {
        this.data = value;
    }

    /**
     * Gets the value of the addInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AddInfo }
     *     
     */
    public AddInfo getAddInfo() {
        return addInfo;
    }

    /**
     * Sets the value of the addInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddInfo }
     *     
     */
    public void setAddInfo(AddInfo value) {
        this.addInfo = value;
    }

    /**
     * Gets the value of the ver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVer() {
        if (ver == null) {
            return "1.0";
        } else {
            return ver;
        }
    }

    /**
     * Sets the value of the ver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVer(String value) {
        this.ver = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}
