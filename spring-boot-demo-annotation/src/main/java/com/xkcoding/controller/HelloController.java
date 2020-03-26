package com.xkcoding.controller;

import com.xkcoding.annotation.ErrorChecker;
import com.xkcoding.pojo.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/26 14:53
 */
@Slf4j
@RequestMapping
@RestController
public class HelloController {

    @RequestMapping
    @ErrorChecker
    public Result hello() throws Exception {
        throw new Exception();
    }

}
