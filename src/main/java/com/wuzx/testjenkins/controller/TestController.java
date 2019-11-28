package com.wuzx.testjenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/testjenkins")
    public String testjenkins() {
        return "终于成功了啊，和哈哈哈哈，臭猪王";
    }
}
