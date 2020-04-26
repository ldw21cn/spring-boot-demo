package com.xkcoding.redisson.ehcache.controller;

import com.xkcoding.redisson.ehcache.entity.User;
import com.xkcoding.redisson.ehcache.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/26 16:03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/save")
    public ResponseEntity save() {
        User user = new User();
        user.setId(11L);
        user.setName("张三");
        userService.saveOrUpdate(user);
        return ResponseEntity.ok(user);
    }

    @RequestMapping("/get/{id}")
    public ResponseEntity get(@PathVariable("id") Long id) {
        User user = userService.get(id);
        return ResponseEntity.ok(user);
    }

    @RequestMapping("/del/{id}")
    public ResponseEntity del(@PathVariable("id") Long id) {
        userService.delete(id);
        return ResponseEntity.ok().build();
    }

}
