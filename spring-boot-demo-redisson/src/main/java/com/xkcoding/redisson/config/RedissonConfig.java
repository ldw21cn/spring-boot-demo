package com.xkcoding.redisson.config;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.io.IOException;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/26 16:26
 */
@Slf4j
@Data
@ConfigurationProperties(prefix = "redisson")
@Configuration
public class RedissonConfig {

    private String address;
    private String password;
    private Integer database;

    @Bean(name = "redissonClient")
    public RedissonClient redissonClientSingle() throws IOException {
        Config config = new Config();
        config.useSingleServer().setDatabase(database);
        config.useSingleServer().setAddress(address);

        if (!StringUtils.isEmpty(password)) {
            config.useSingleServer().setPassword(password);
        }

        RedissonClient redissonClient = Redisson.create(config);

        log.info("redissonClient: {}", redissonClient.getConfig().toJSON());

        return redissonClient;
    }


}
