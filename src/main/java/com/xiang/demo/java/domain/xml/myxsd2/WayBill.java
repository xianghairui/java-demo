
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
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}WayBillHead"/&gt;
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}WayBillList" maxOccurs="100"/&gt;
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
    "wayBillHead",
    "wayBillList"
})
@XmlRootElement(name = "WayBill", namespace = "http://www.chinaport.gov.cn/ceb")
public class WayBill {

    @XmlElement(name = "WayBillHead", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected WayBillHead wayBillHead;
    @XmlElement(name = "WayBillList", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected List<WayBillList> wayBillList;

    /**
     * Gets the value of the wayBillHead property.
     * 
     * @return
     *     possible object is
     *     {@link WayBillHead }
     *     
     */
    public WayBillHead getWayBillHead() {
        return wayBillHead;
    }

    /**
     * Sets the value of the wayBillHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link WayBillHead }
     *     
     */
    public void setWayBillHead(WayBillHead value) {
        this.wayBillHead = value;
    }

    /**
     * 提运单项，申请删除时可不填 Gets the value of the wayBillList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wayBillList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWayBillList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WayBillList }
     * 
     * 
     */
    public List<WayBillList> getWayBillList() {
        if (wayBillList == null) {
            wayBillList = new ArrayList<WayBillList>();
        }
        return this.wayBillList;
    }

}
