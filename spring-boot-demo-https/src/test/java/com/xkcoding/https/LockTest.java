package com.xkcoding.https;

import org.junit.Test;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/24 23:21
 */
public class LockTest {

    @Test
    public void renteck() throws Exception {

        setA();
    }


    synchronized void setA() throws Exception {
        Thread.sleep(1000);
        System.out.println("A");
        setB();
    }

    synchronized void setB() throws Exception {
        Thread.sleep(1000);
        System.out.println("B");
    }
}
