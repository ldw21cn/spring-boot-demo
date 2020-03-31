package com.xkcoding.redisson.redis.controller;

import cn.hutool.core.util.ReUtil;
import com.xkcoding.redisson.redis.entity.User;
import com.xkcoding.redisson.redis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/31 23:27
 */
@RestController
@RequestMapping
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/get/{id}")
    public User getUser(@PathVariable(name = "id") Long id) {
        User user = userService.get(id);

        if (user == null) {
            user = new User().setId(5L).setName("李四");
        }

        return user;
    }

    @RequestMapping("/put")
    public User saveUsers() {
        User user = new User();
        user.setId(4L);
        user.setName("张三");
        userService.saveOrUpdate(user);
        return user;
    }

    @RequestMapping("/del/{id}")
    public String delUser(@PathVariable(name = "id") Long id) {
        userService.delete(id);
        return "delete success";
    }
}
