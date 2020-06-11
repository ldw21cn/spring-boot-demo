package com.xkcoding.orm.mybatis.service;

import com.xkcoding.orm.mybatis.entity.User;
import com.xkcoding.orm.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/5/15 17:58
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public List<User> getUserList() {
        List<User> users = userMapper.selectAllUser();
        return users;
    }
}
