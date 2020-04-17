package com.xkcoding.controller;

import com.xkcoding.feign.ConsumerClientFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/17 23:21
 */
@RestController
@RequestMapping
public class HelloWorldController {

    @Resource
    ConsumerClientFeign consumerClientFeign;

    @RequestMapping("/hello")
    public String hello() throws ExecutionException, InterruptedException {

        CompletableFuture.runAsync(new Runnable() {
            @Override
            public void run() {
                consumerClientFeign.hello();
            }
        });


        return "Success";
    }
}
