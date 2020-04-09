package com.xkcoding.controller;

import com.xkcoding.regex.WechatRegexConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/9 22:39
 */
@Controller
@RequestMapping
public class RegexController {

    @Autowired
    WechatRegexConfig wechatRegexConfig;

    @RequestMapping("/config")
    public List<String> getConfig() {
        List<String> regs = wechatRegexConfig.getRegs();
        return regs;
    }

}
