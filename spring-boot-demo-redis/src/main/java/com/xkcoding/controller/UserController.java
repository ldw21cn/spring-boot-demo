package com.xkcoding.controller;

import com.xkcoding.pojo.User;
import com.xkcoding.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/6/16 14:52
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    RedisService redisService;

    @RequestMapping("/get")
    public Object getUser() {
        Object o = redisService.get("1");
        return o;
    }

    @RequestMapping("/set")
    public void setUser() {
        User user = new User();
        user.setAge(18);
        user.setGender("男");
        user.setName("张三");
        redisService.set("1", user);
    }

    @RequestMapping("/setInt")
    public void setInt() {
        redisService.incrKey("2", 10);
    }

    @RequestMapping("/getInt")
    public Integer getInt() {
        return redisService.getInt("2");
    }

    @RequestMapping("/setHash")
    public void setHash() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        redisService.setHash("3", "4", list);
    }

    @RequestMapping("/getHash")
    public List getHash() {
        return (List) redisService.getHash("3", "4");
    }
}
