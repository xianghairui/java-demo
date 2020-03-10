
package com.xiang.demo.java.domain.xml.ceb.export;

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
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}DepartureHead"/&gt;
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}DepartureList" maxOccurs="100"/&gt;
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
    "departureHead",
    "departureList"
})
@XmlRootElement(name = "Departure", namespace = "http://www.chinaport.gov.cn/ceb")
public class Departure {

    @XmlElement(name = "DepartureHead", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected DepartureHead departureHead;
    @XmlElement(name = "DepartureList", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected List<DepartureList> departureList;

    /**
     * Gets the value of the departureHead property.
     * 
     * @return
     *     possible object is
     *     {@link DepartureHead }
     *     
     */
    public DepartureHead getDepartureHead() {
        return departureHead;
    }

    /**
     * Sets the value of the departureHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link DepartureHead }
     *     
     */
    public void setDepartureHead(DepartureHead value) {
        this.departureHead = value;
    }

    /**
     * Gets the value of the departureList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the departureList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDepartureList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepartureList }
     * 
     * 
     */
    public List<DepartureList> getDepartureList() {
        if (departureList == null) {
            departureList = new ArrayList<DepartureList>();
        }
        return this.departureList;
    }

}
