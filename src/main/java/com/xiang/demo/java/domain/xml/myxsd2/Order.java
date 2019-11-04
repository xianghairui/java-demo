
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
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}OrderHead"/&gt;
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}OrderList" maxOccurs="100"/&gt;
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
    "orderHead",
    "orderList"
})
@XmlRootElement(name = "Order", namespace = "http://www.chinaport.gov.cn/ceb")
public class Order {

    @XmlElement(name = "OrderHead", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected OrderHead orderHead;
    @XmlElement(name = "OrderList", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected List<OrderList> orderList;

    /**
     * Gets the value of the orderHead property.
     * 
     * @return
     *     possible object is
     *     {@link OrderHead }
     *     
     */
    public OrderHead getOrderHead() {
        return orderHead;
    }

    /**
     * Sets the value of the orderHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderHead }
     *     
     */
    public void setOrderHead(OrderHead value) {
        this.orderHead = value;
    }

    /**
     * Gets the value of the orderList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the orderList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrderList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OrderList }
     * 
     * 
     */
    public List<OrderList> getOrderList() {
        if (orderList == null) {
            orderList = new ArrayList<OrderList>();
        }
        return this.orderList;
    }

}
