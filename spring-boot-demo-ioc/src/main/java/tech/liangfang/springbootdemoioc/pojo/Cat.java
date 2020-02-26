package tech.liangfang.springbootdemoioc.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import tech.liangfang.springbootdemoioc.pojo.definition.Animal;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/2/21 23:20
 */
@Component
@Primary
public class Cat implements Animal {
    @Override
    public void use() {
        System.out.println("【猫】会喵喵叫" + Cat.class.getSimpleName());
    }
}
