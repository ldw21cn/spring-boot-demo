package com.xkcoding.controller;

import com.xkcoding.mybatis.entity.User;
import com.xkcoding.mybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/26 18:19
 */
@Slf4j
@RequestMapping
@RestController
public class UserController {

    @Resource
    UserMapper userMapper;

    @RequestMapping("/insert")
    public String insertUser() {
        User user = new User();
        user.setName("张三");
        user.setAge(11);

        userMapper.insert(user);
        return "success";
    }

}
