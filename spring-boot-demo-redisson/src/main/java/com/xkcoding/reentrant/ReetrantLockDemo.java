package com.xkcoding.reentrant;

import java.util.concurrent.locks.ReentrantLock;

/**
 * 功能描述：  可重入锁7
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/30 21:25
 */
public class ReetrantLockDemo implements Runnable {

    public static ReentrantLock lock = new ReentrantLock();

    public static int i = 0;

    @Override
    public void run() {
        for (int j = 0; j < 10; j++) {
            //加锁
            // lock.lock();
            // 可重入锁
            // lock.lock();
            try {
                i++;
            }finally {
                // 解锁
                // lock.unlock();
                // 可重入锁
                // lock.unlock();

            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReetrantLockDemo reetrantLockDemo = new ReetrantLockDemo();
        Thread t1 = new Thread(reetrantLockDemo);
        t1.start();
        t1.join();
        System.out.println(i);
    }
}
