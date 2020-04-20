package com.xkcoding.feign;

import feign.Request;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 功能描述： 处理 feign 的超时与重试。此文件一旦创建，即使在配置中不起用的话，还是会重试
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/12 16:51
 */
@Configuration
public class FeignConfigure {

    //超时时间
    public static int connectTimeOutMillis = 12000;
    public static int readTimeOutMillis = 12000;

    @Bean
    public Request.Options options() {
        return new Request.Options(connectTimeOutMillis, readTimeOutMillis);
    }

    /**
     * 自定义重试次数，通过这个可以控制 feign 重试的次数
     * @return
     */
    @Bean
    public Retryer feiRetryer() {
        return new Retryer.Default(100,1000,1);
    }
}
