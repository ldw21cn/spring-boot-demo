package com.xkcoding.properties.controller;

import cn.hutool.core.lang.Dict;
import com.xkcoding.properties.property.ApplicationProperty;
import com.xkcoding.properties.property.DeveloperProperty;
import com.xkcoding.properties.property.WechatProperty;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * <p>
 * 测试Controller
 * </p>
 *
 * @package: com.xkcoding.properties.controller
 * @description: 测试Controller
 * @author: yangkai.shen
 * @date: Created in 2018/9/29 10:49 AM
 * @copyright: Copyright (c) 2018
 * @version: V1.0
 * @modified: yangkai.shen
 */
@Slf4j
@RestController
public class PropertyController {
	private final ApplicationProperty applicationProperty;
	private final DeveloperProperty developerProperty;
    private final WechatProperty wechatProperty;

	@Autowired
	public PropertyController(ApplicationProperty applicationProperty, DeveloperProperty developerProperty,WechatProperty wechatProperty) {
		this.applicationProperty = applicationProperty;
		this.developerProperty = developerProperty;
        this.wechatProperty = wechatProperty;
	}

	@GetMapping("/property")
	public Dict index() {
		return Dict.create().set("applicationProperty", applicationProperty).set("developerProperty", developerProperty);
	}

    @GetMapping("/getWechat")
    public Map<String, Object> wechatProperty() {
        log.info("wechat");
        Map intentMap = wechatProperty.getIntentMap();

        return intentMap;
    }
}
