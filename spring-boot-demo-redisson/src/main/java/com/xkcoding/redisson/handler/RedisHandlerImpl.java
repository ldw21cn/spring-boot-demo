package com.xkcoding.redisson.handler;

import com.sun.org.apache.xerces.internal.xs.StringList;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBucket;
import org.redisson.api.RList;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.client.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/6/17 15:42
 */
@Slf4j
@Component("redisHandler")
public class RedisHandlerImpl implements IRedisHandler {

    @Autowired
    RedissonClient redissonClient;

    @Override
    public void set(String key, Object value) {
        RBucket<Object> bucket = redissonClient.getBucket(key);
        bucket.set(value);
    }

    @Override
    public <T> T get(String key) {
        RBucket<Object> bucket = redissonClient.getBucket(key);
        return  (T) bucket.get();
    }

    @Override
    public void setHash(String key, String field, Object value) {
        RMap<Object, Object> map = redissonClient.getMap(key);
        map.put(field, value);
    }

    @Override
    public <T> T getHash(String key, String field) {
        RMap<Object, Object> map = redissonClient.getMap(key);
        return (T) map.get(field);
    }


}
