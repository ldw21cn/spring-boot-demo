package com.xkcoding.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/17 23:55
 */
@FeignClient(value = "demo-client1",configuration = FeignLogConfiguration.class)
public interface ConsumerClientFeign {

    @GetMapping(value = "/hello")
    String hello();
}
