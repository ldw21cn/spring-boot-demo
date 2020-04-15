package com.xkcoding.properties.property;

import com.google.common.collect.BiMap;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Map;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/15 13:48
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "wechat")
@PropertySource(value = "classpath:wechat.properties",encoding = "UTF-8")
public class WechatProperty {

    // private Map intentMap;

    private Map intentMap;

}
