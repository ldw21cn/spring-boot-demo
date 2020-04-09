package com.xkcoding.regex;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/9 22:30
 */
@Data
@Component
@PropertySource(value = "classpath:wechat.properties",encoding = "UTF-8")
@ConfigurationProperties(prefix = "wechat")
public class WechatRegexConfig {
    private List<String> regs;
}
