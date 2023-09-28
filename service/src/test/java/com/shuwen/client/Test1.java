package com.shuwen.client;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.shuwen.client.clientService.RequestWrapper;
import com.shuwen.client.clientService.ResponseWrapper;
import com.shuwen.client.clientService.UserAddReq;
import com.shuwen.client.clientService.UserWebService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.json.JSONArray;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ClientApplication81.class)
public class Test1 {

    @Test
    public void test2() {
        JaxWsProxyFactoryBean factoryBean = new JaxWsProxyFactoryBean();
        factoryBean.setServiceClass(UserWebService.class);
        factoryBean.setAddress("http://localhost:8080/webService/userWebService");
        UserWebService userWebService = (UserWebService) factoryBean.create();
        RequestWrapper requestWrapper = new RequestWrapper();
        UserAddReq req = new UserAddReq();
        req.setAge("12");
        req.setName("shuWen");
        req.setSex("1");
        requestWrapper.setReq(req);
        ResponseWrapper rsp = userWebService.save(requestWrapper);
        System.out.println(JSONObject.toJSONString(rsp));
    }

}
