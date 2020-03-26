package com.xkcoding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/26 14:45
 */
@SpringBootApplication
@MapperScan("com.xkcoding.mybatis.mapper")
public class SpringBootDemoRedissonApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoRedissonApplication.class, args);
    }
}
