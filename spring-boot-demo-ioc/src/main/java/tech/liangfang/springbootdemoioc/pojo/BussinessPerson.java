package tech.liangfang.springbootdemoioc.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import tech.liangfang.springbootdemoioc.pojo.definition.Animal;
import tech.liangfang.springbootdemoioc.pojo.definition.Person;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/2/21 23:13
 */
@Component
public class BussinessPerson implements Person {

    private Animal animal;

    public BussinessPerson(@Autowired @Qualifier(value = "dog") Animal animal) {
        this.animal = animal;
    }

    @Override
    public void service() {
        animal.use();
    }

    @Override
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
