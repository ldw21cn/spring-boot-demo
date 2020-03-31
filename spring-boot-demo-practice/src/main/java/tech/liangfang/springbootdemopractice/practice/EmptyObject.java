package tech.liangfang.springbootdemopractice.practice;

import com.google.common.collect.Lists;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * 功能描述： 通过 jvisualvm 查看对象占用内存大小
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/30 15:27
 */
@Data
@NoArgsConstructor
public class EmptyObject {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<EmptyObject> objects = Lists.newArrayList();

        for (int i = 0; i < 100; i++) {
            objects.add(new EmptyObject());
        }

        Thread.sleep(600 * 1000);

    }
}
