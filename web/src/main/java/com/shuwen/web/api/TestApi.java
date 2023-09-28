package com.shuwen.web.api;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.util.JSONPObject;
import com.shuwen.web.domain.Rsp;
import com.shuwen.web.domain.UserAddReq;
import com.shuwen.web.service.UserService;
import jdk.nashorn.internal.parser.JSONParser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("test")
@Slf4j
public class TestApi {

    @GetMapping("connect")
    private String testConnect() {
        return "hello, this is a test!";
    }

    @Resource
    private UserService userService;

    @PostMapping("user/add")
    private Rsp userAdd(@RequestBody UserAddReq req) {
        log.info(" test/user/add--param:{}", req.toString());
        return userService.save(req);
    }

}
