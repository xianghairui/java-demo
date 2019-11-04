
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
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}SummaryApplyHead"/&gt;
 *         &lt;element ref="{http://www.chinaport.gov.cn/ceb}SummaryApplyList" maxOccurs="100"/&gt;
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
    "summaryApplyHead",
    "summaryApplyList"
})
@XmlRootElement(name = "SummaryApply", namespace = "http://www.chinaport.gov.cn/ceb")
public class SummaryApply {

    @XmlElement(name = "SummaryApplyHead", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected SummaryApplyHead summaryApplyHead;
    @XmlElement(name = "SummaryApplyList", namespace = "http://www.chinaport.gov.cn/ceb", required = true)
    protected List<SummaryApplyList> summaryApplyList;

    /**
     * Gets the value of the summaryApplyHead property.
     * 
     * @return
     *     possible object is
     *     {@link SummaryApplyHead }
     *     
     */
    public SummaryApplyHead getSummaryApplyHead() {
        return summaryApplyHead;
    }

    /**
     * Sets the value of the summaryApplyHead property.
     * 
     * @param value
     *     allowed object is
     *     {@link SummaryApplyHead }
     *     
     */
    public void setSummaryApplyHead(SummaryApplyHead value) {
        this.summaryApplyHead = value;
    }

    /**
     * Gets the value of the summaryApplyList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the summaryApplyList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSummaryApplyList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SummaryApplyList }
     * 
     * 
     */
    public List<SummaryApplyList> getSummaryApplyList() {
        if (summaryApplyList == null) {
            summaryApplyList = new ArrayList<SummaryApplyList>();
        }
        return this.summaryApplyList;
    }

}
