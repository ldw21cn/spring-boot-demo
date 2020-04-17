package com.xkcoding.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/17 23:21
 */
@RestController
@RequestMapping
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() throws InterruptedException {
        TimeUnit.MINUTES.sleep(2);

        return "Hello";
    }
}
