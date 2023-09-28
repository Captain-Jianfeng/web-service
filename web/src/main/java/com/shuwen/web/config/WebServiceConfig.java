package com.shuwen.web.config;


import com.shuwen.web.service.UserService;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.staxutils.StaxUtils;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.xml.ws.Endpoint;


@Configuration
public class WebServiceConfig {
    @Bean(name = "cxfServlet")
    public ServletRegistrationBean dispatcherServlet(){
        return new ServletRegistrationBean(new CXFServlet(),"/webService/*");//发布服务名称
    }

    @Autowired
    private Bus bus;

    @PostConstruct
    public void init() {
        System.setProperty(StaxUtils.ALLOW_INSECURE_PARSER, "1");
    }

    @Resource
    private UserService userService;

    @Bean
    public Endpoint rSapToMomService() {
        EndpointImpl endpoint=new EndpointImpl(bus, userService);//绑定要发布的服务
        endpoint.publish("/userWebService"); //显示要发布的名称
        return endpoint;
    }


}
