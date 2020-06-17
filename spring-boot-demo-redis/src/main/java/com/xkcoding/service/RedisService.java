package com.xkcoding.service;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/6/16 14:45
 */
@Service
public class RedisService {

    @Resource(name = "intRedisTemplate")
    RedisTemplate intRedisTemplate;
    @Resource(name = "strRedisTemplate")
    RedisTemplate strRedisTemplate;


    public void set(String key, Object val) {
        strRedisTemplate.opsForValue().set(key, val);
    }

    public <T extends Object> T get(String key) {
        return (T) strRedisTemplate.opsForValue().get(key);
    }


    public void incrHash(String key, String field, Integer value) {
        intRedisTemplate.opsForHash().increment(key, field, value);
    }

    public void setHash(String key, String field, Object object) {
        strRedisTemplate.opsForHash().put(key, field, object);
    }

    public <T extends Object> T getHash(String key, String field) {
        return (T) strRedisTemplate.opsForHash().get(key, field);
    }

    public void incrKey(String key, Integer value) {
        if (null == key || null == value) {
            return;
        }
        intRedisTemplate.opsForValue().increment(key, value);
    }

    public <T extends Object> T getInt(String key) {
        if (null == key) {
            return null;
        }
        return (T) intRedisTemplate.opsForValue().get(key);
    }
}
