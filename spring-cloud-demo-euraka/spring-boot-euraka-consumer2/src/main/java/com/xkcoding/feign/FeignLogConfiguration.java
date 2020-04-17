package com.xkcoding.feign;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述： 对 feign 的调用输出日志
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/18 00:22
 */
@Configuration
public class FeignLogConfiguration {

    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;

    }
}
