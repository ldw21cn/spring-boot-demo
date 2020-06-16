package com.xkcoding.service;

import com.google.common.collect.Maps;
import com.xkcoding.pojo.People;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/6/16 16:44
 */
@Slf4j
@Service
public class PeopleService {
    private static final Map<Long, People> DATABASES = Maps.newConcurrentMap();

    static {
        DATABASES.put(1L, new People(1L, "user1"));
        DATABASES.put(2L, new People(2L, "user2"));
        DATABASES.put(3L, new People(3L, "user3"));
    }


    @CachePut(value = "user", key = "#user.id")
    public People saveOrUpdate(People user) {
        DATABASES.put(user.getId(), user);
        log.info("保存用户【user】= {}", user);
        return user;
    }

    @Cacheable(value = "user", key = "#id")
    public People get(Long id) {
        // 我们假设从数据库读取
        log.info("查询用户【id】= {}", id);
        return DATABASES.get(id);
    }
}
