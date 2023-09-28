
package com.shuwen.client.clientService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>RequestWrapper complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RequestWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Req" type="{http://webService.com/web}userAddReq" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestWrapper", propOrder = {
    "req"
})
public class RequestWrapper {

    @XmlElement(name = "Req")
    protected UserAddReq req;

    /**
     * 获取req属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UserAddReq }
     *     
     */
    public UserAddReq getReq() {
        return req;
    }

    /**
     * 设置req属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UserAddReq }
     *     
     */
    public void setReq(UserAddReq value) {
        this.req = value;
    }

}
