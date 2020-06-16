package com.xkcoding.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

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
        ValueOperations ops = strRedisTemplate.opsForValue();
        ops.set(key, val);
    }

    public Object get(String key) {
        ValueOperations ops = strRedisTemplate.opsForValue();
        return ops.get(key);
    }


    public void incrHash(String key, String field, Integer value) {
        intRedisTemplate.opsForHash().increment(key, field, value);
    }

    public void setHash(String key, String field, Object object) {
        strRedisTemplate.opsForHash().put(key, field, object);
    }

    public Object getHash(String key,String field) {
        return strRedisTemplate.opsForHash().get(key, field);
    }

    public void incrKey(String key, Integer value){
        if (null == key || null == value) {
            return;
        }
        intRedisTemplate.opsForValue().increment(key, value);
    }

    public Integer getInt(String key) {
        if (null == key) {
            return null;
        }
        return (Integer) intRedisTemplate.opsForValue().get(key);
    }




}
