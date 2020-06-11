package com.xkcoding.listner;

import com.xkcoding.event.UserRegisterEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/5/12 20:08
 */
@Component
public class RegisterListner {

    @EventListener
    public void registerListner(UserRegisterEvent event) {
        System.out.println("监听到注册成功了。。。");

    }

}
