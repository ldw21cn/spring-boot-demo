package com.xkcoding.redisson.handler;

import com.google.common.collect.Lists;
import com.xkcoding.mybatis.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisHandlerImplTest {

    @Autowired
    IRedisHandler redisHandler;

    @Test
    public void set() {
        User user = new User();
        user.setId(1);
        user.setAge(18);
        user.setName("张三");

        redisHandler.set("redission::user", user);
    }

    @Test
    public void setHash() {
        User user = new User();
        user.setId(1);
        user.setAge(18);
        user.setName("张三");

        User user1 = new User();
        user1.setId(2);
        user1.setAge(19);
        user1.setName("李四");

        ArrayList<Object> list = Lists.newArrayList();
        list.add(user1);
        list.add(user);

        // redisHandler.setHash("redission::hash","user2",user);
        redisHandler.setHash("redission::hash","user3",list);
    }


    @Test
    public void get() {
        User user = redisHandler.getHash("redission::hash", "user1");
        List list = redisHandler.getHash("redission::hash", "user3");
        System.out.println(list);
    }
}
