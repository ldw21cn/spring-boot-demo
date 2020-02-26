package tech.liangfang.springbootdemoioc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;
import tech.liangfang.springbootdemoioc.config.AppConfig;
import tech.liangfang.springbootdemoioc.pojo.BussinessPerson;
import tech.liangfang.springbootdemoioc.pojo.User;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/2/21 22:45
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoIocApplication.class)
public class ApplicationContextTest {

    @Test
    public void ctxTest() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        BussinessPerson bussinessPerson = ctx.getBean(BussinessPerson.class);
        bussinessPerson.service();
    }
}
