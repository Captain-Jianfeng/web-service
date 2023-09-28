package com.shuwen.web.service;


import com.shuwen.web.domain.Rsp;
import com.shuwen.web.domain.UserAddReq;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(name = "UserWebService",targetNamespace="http://webService.com/web")
public interface UserService {

    @WebMethod
    @WebResult(name = "Rsp")
    @RequestWrapper(localName = "RequestWrapper")
    @ResponseWrapper(localName = "ResponseWrapper")
    Rsp save(@WebParam(name = "Req") UserAddReq req);

}
