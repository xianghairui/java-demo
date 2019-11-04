
package com.xiang.demo.java.domain.xml.myxsd2;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}ArrivalHead"/&gt;
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}ArrivalList" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "arrivalHead",
    "arrivalList"
})
@XmlRootElement(name = "Arrival", namespace = "http://www.chinaport.gov.cn/ceb")
public class Arrival {

    @XmlElement(name = "ArrivalHead", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected ArrivalHead arrivalHead;
    @XmlElement(name = "ArrivalList", namespace = "http://www.chinaport.gov.cn/ceb")
    protected List<ArrivalList> arrivalList;

    /**
     * Gets the value of the arrivalHead property.
     * 
     * @return
     *     possible object is
     *     {@link ArrivalHead }
     *     
     */
    public ArrivalHead getArrivalHead() {
        return arrivalHead;
    }

    /**
     * Sets the value of the arrivalHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrivalHead }
     *     
     */
    public void setArrivalHead(ArrivalHead value) {
        this.arrivalHead = value;
    }

    /**
     * Gets the value of the arrivalList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrivalList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrivalList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrivalList }
     * 
     * 
     */
    public List<ArrivalList> getArrivalList() {
        if (arrivalList == null) {
            arrivalList = new ArrayList<ArrivalList>();
        }
        return this.arrivalList;
    }

}
