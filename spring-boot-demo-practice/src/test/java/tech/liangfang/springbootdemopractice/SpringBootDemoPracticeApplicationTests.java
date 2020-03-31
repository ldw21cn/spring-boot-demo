package tech.liangfang.springbootdemopractice;

import com.google.common.collect.Lists;
import org.junit.Test;
import tech.liangfang.springbootdemopractice.practice.EmptyObject;

import java.util.ArrayList;

public class SpringBootDemoPracticeApplicationTests {

    /**
     * 测试一个空对象在内存的占用空间
     * @throws InterruptedException
     */
    @Test
    public void objectTest() throws InterruptedException {

        ArrayList<EmptyObject> objects = Lists.newArrayList();

        for (int i = 0; i < 1000; i++) {
            objects.add(new EmptyObject());
        }

        Thread.sleep(60 * 1000);

    }

}
