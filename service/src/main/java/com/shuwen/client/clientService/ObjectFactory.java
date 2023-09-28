
package com.shuwen.client.clientService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.webservice.web package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _RequestWrapper_QNAME = new QName("http://webService.com/web", "RequestWrapper");
    private final static QName _ResponseWrapper_QNAME = new QName("http://webService.com/web", "ResponseWrapper");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.webservice.web
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestWrapper }
     * 
     */
    public RequestWrapper createRequestWrapper() {
        return new RequestWrapper();
    }

    /**
     * Create an instance of {@link ResponseWrapper }
     * 
     */
    public ResponseWrapper createResponseWrapper() {
        return new ResponseWrapper();
    }

    /**
     * Create an instance of {@link UserAddReq }
     * 
     */
    public UserAddReq createUserAddReq() {
        return new UserAddReq();
    }

    /**
     * Create an instance of {@link Rsp }
     * 
     */
    public Rsp createRsp() {
        return new Rsp();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RequestWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.com/web", name = "RequestWrapper")
    public JAXBElement<RequestWrapper> createRequestWrapper(RequestWrapper value) {
        return new JAXBElement<RequestWrapper>(_RequestWrapper_QNAME, RequestWrapper.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResponseWrapper }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webService.com/web", name = "ResponseWrapper")
    public JAXBElement<ResponseWrapper> createResponseWrapper(ResponseWrapper value) {
        return new JAXBElement<ResponseWrapper>(_ResponseWrapper_QNAME, ResponseWrapper.class, null, value);
    }

}
