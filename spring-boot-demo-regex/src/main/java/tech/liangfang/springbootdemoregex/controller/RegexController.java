package tech.liangfang.springbootdemoregex.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.liangfang.springbootdemoregex.regex.WechatRegexConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/9 22:39
 */
@Slf4j
@RestController
@RequestMapping
public class RegexController {

    @Autowired
    WechatRegexConfig wechatRegexConfig;

    @RequestMapping("/config/{input}")
    public List<String> getConfig(@PathVariable(value = "input") String input) {
        List<String> regs = wechatRegexConfig.getRegs();


        /*for (String reg : regs) {
            ArrayList<String> objects = new ArrayList<>();
            Pattern compile = Pattern.compile(reg);
            Matcher matcher = compile.matcher(input);
            if (matcher.find() && matcher.groupCount() > 0) {
                log.info("group1: {}, group2: {}", matcher.group(1), matcher.group(2));
                objects.add(reg);
                return objects;
            }
        }*/

        List<String> list = regs.stream().filter(reg -> {
            Pattern compile = Pattern.compile(reg);
            Matcher matcher = compile.matcher(input);
            if (matcher.find() && matcher.groupCount() > 0) {
                log.info("group1: {}, group2: {}", matcher.group(1), matcher.group(2));
                return true;
            }
            return false;
        }).collect(Collectors.toList());

        return list;
    }

}
