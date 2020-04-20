package com.xkcoding.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.annotation.AliasFor;
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
@Slf4j
@RestController
@RequestMapping
public class HelloWorldController {

    @RequestMapping("/hello")
    public String hello() throws InterruptedException {
        log.info("进入 consumer1.....");

        TimeUnit.MINUTES.sleep(2);

        return "Hello";
    }
}
