package com.xkcoding;

import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.HashMap;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/27 23:15
 */
public class HashMapTest {

    @Test
    public void hashMap() {
        HashMap<Object, Object> map = Maps.newHashMapWithExpectedSize(1);

        map.put("a", 1);
        map.put("b", 1);
        map.put("c", 1);
        map.put("e", 1);
        map.put("f", 1);
        map.put("g", 1);




        System.out.println();
    }

}
