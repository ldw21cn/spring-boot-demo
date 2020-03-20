package com.xkcoding.https.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/20 10:00
 */
@RestController
@RequestMapping
public class HelloWorldController {

    @RequestMapping("/hello")
    public String welcome() {
        return "Hello world!";
    }
}
