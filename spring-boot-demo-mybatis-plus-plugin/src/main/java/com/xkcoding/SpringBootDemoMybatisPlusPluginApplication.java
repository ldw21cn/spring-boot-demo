package com.xkcoding;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/5/15 16:50
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = {"com.xkcoding.dao"})
public class SpringBootDemoMybatisPlusPluginApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoMybatisPlusPluginApplication.class, args);
    }

}
