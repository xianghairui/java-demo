
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
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}InventoryHead"/&gt;
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}InventoryList" maxOccurs="100"/&gt;
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
    "inventoryHead",
    "inventoryList"
})
@XmlRootElement(name = "Inventory", namespace = "http://www.chinaport.gov.cn/ceb")
public class Inventory {

    @XmlElement(name = "InventoryHead", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected InventoryHead inventoryHead;
    @XmlElement(name = "InventoryList", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected List<InventoryList> inventoryList;

    /**
     * Gets the value of the inventoryHead property.
     * 
     * @return
     *     possible object is
     *     {@link InventoryHead }
     *     
     */
    public InventoryHead getInventoryHead() {
        return inventoryHead;
    }

    /**
     * Sets the value of the inventoryHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link InventoryHead }
     *     
     */
    public void setInventoryHead(InventoryHead value) {
        this.inventoryHead = value;
    }

    /**
     * Gets the value of the inventoryList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the inventoryList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInventoryList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InventoryList }
     * 
     * 
     */
    public List<InventoryList> getInventoryList() {
        if (inventoryList == null) {
            inventoryList = new ArrayList<InventoryList>();
        }
        return this.inventoryList;
    }

}
