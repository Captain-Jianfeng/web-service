
package com.shuwen.client.clientService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ResponseWrapper complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResponseWrapper">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Rsp" type="{http://webService.com/web}rsp" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseWrapper", propOrder = {
    "rsp"
})
public class ResponseWrapper {

    @XmlElement(name = "Rsp")
    protected Rsp rsp;

    /**
     * 获取rsp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Rsp }
     *     
     */
    public Rsp getRsp() {
        return rsp;
    }

    /**
     * 设置rsp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Rsp }
     *     
     */
    public void setRsp(Rsp value) {
        this.rsp = value;
    }

}
