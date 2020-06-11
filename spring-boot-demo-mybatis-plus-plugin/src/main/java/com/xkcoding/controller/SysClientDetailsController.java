package com.xkcoding.controller;

import com.xkcoding.model.po.SysClientDetailsPo;
import com.xkcoding.service.SysClientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/5/15 17:33
 */
@RestController
@RequestMapping("/demo")
public class SysClientDetailsController {

    @Resource
    SysClientDetailsService sysClientDetailsService;

    @RequestMapping
    public String getSysClientDetails(){
        Long aLong = sysClientDetailsService.queryTotal();
        return aLong.toString();
    }

}
