package com.wuzx.testjenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/testjenkins")
    public String testjenkins() {
        return "hello 奇迹臭猪猪1";
    }
}
