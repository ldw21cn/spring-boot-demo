package com.xkcoding.redisson.redis;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/1 15:27
 */
@Slf4j
public class HashCodeTest extends SpringBootDemoCacheRedisApplicationTests {

    private static final int HASH_INCREMENT = 0x61c88647;

    private static AtomicInteger nextHashCode = new AtomicInteger();

    public static void main(String[] args) {
        int i = nextHashCode.getAndAdd(HASH_INCREMENT);
        log.info("hashCode: i= {}", i);

    }


}
