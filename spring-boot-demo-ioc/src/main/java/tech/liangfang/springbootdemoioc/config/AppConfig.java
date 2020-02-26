package tech.liangfang.springbootdemoioc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import tech.liangfang.springbootdemoioc.pojo.UserService;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/2/21 22:33
 */
@Configuration
@ComponentScan(
    basePackages = "tech.liangfang.springbootdemoioc.pojo")
public class AppConfig {

    /*@Bean(name = "user")
    public User initUser() {
        User user = new User().setId(1L).setNote("note_1").setUserName("user_name_1");
        return user;
    }*/
}
