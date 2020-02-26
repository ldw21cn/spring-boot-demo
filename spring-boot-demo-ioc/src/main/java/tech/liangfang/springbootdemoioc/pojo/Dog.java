package tech.liangfang.springbootdemoioc.pojo;

import org.springframework.stereotype.Component;
import tech.liangfang.springbootdemoioc.pojo.definition.Animal;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/2/21 23:14
 */
@Component
public class Dog implements Animal {

    @Override
    public void use() {
        System.out.println("【狗】是看门用的" + Dog.class.getSimpleName());
    }
}
