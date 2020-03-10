
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
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}SummaryResultHead"/&gt;
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}SummaryResultList" maxOccurs="100" minOccurs="0"/&gt;
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
    "summaryResultHead",
    "summaryResultList"
})
@XmlRootElement(name = "SummaryResult", namespace = "http://www.chinaport.gov.cn/ceb")
public class SummaryResult {

    @XmlElement(name = "SummaryResultHead", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected SummaryResultHead summaryResultHead;
    @XmlElement(name = "SummaryResultList", namespace = "http://www.chinaport.gov.cn/ceb")
    protected List<SummaryResultList> summaryResultList;

    /**
     * Gets the value of the summaryResultHead property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryResultHead }
     *     
     */
    public SummaryResultHead getSummaryResultHead() {
        return summaryResultHead;
    }

    /**
     * Sets the value of the summaryResultHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryResultHead }
     *     
     */
    public void setSummaryResultHead(SummaryResultHead value) {
        this.summaryResultHead = value;
    }

    /**
     * Gets the value of the summaryResultList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryResultList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryResultList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryResultList }
     * 
     * 
     */
    public List<SummaryResultList> getSummaryResultList() {
        if (summaryResultList == null) {
            summaryResultList = new ArrayList<SummaryResultList>();
        }
        return this.summaryResultList;
    }

}
