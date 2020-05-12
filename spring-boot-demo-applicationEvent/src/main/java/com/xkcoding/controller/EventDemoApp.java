package com.xkcoding.controller;

import com.xkcoding.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/5/12 19:58
 */
@RestController
public class EventDemoApp {

    @Autowired
    UserService userService;


    @RequestMapping("/register")
    public String register() {
        userService.register("lvdawei");
        return "success";
    }

}
