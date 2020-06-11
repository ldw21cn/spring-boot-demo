package com.xkcoding.orm.mybatis.controller;

import com.xkcoding.orm.mybatis.entity.User;
import com.xkcoding.orm.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/5/15 17:57
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping
    public List<User> getUser() {
        List<User> userList = userService.getUserList();
        return userList;
    }
}
