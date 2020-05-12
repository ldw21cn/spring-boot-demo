package com.xkcoding.event;

import org.springframework.context.ApplicationEvent;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/5/12 19:55
 */
public class UserRegisterEvent extends ApplicationEvent {

    public UserRegisterEvent(String name) {
        super(name);
    }
}
