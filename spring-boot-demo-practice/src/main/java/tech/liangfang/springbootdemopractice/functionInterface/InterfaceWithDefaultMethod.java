package tech.liangfang.springbootdemopractice.functionInterface;

import java.util.Objects;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/16 09:37
 */
@FunctionalInterface
public interface InterfaceWithDefaultMethod {

    void apply(Object obj);

    default void say(String name) {
        System.out.println("Hello " + name);
    }

    class FunctionalInterfaceWithDefaultMethod{
        public static void main(String[] args) {

            InterfaceWithDefaultMethod i = (o) -> {};

            i.apply(null);
            i.say("default method");
        }
    }


}
