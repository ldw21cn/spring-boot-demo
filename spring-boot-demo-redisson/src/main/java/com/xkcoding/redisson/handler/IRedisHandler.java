package com.xkcoding.redisson.handler;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/6/17 15:41
 */
public interface IRedisHandler {

    /**
     * 保存普通对象
     * @param key
     * @param value
     */
    void set(String key, Object value);

    /**
     * 获取普通对象
     * @param key
     * @param <T>
     * @return
     */
    <T extends Object> T get(String key);

    /**
     * 保存 Hash
     * @param key
     * @param field
     * @param value
     */
    void setHash(String key, String field, Object value);

    /**
     * 获取 hash
     * @param key
     * @param field
     * @param <T>
     * @return
     */
    <T extends Object> T getHash(String key,String field);

}
