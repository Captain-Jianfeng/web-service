package com.shuwen.web.service;

import com.shuwen.web.domain.Rsp;
import com.shuwen.web.domain.UserAddReq;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

@Service
@WebService(targetNamespace = "http://webService.com/web", endpointInterface = "com.shuwen.web.service.UserService")
public class UserServiceImpl implements UserService {

    @Override
    public Rsp save(UserAddReq req) {
        Rsp rsp = new Rsp();
        rsp.setCode(200);
        rsp.setMessage("请求成功");
        rsp.setData(req);
        return rsp;
    }
}
