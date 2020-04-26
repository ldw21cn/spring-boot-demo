package tech.liangfang.springbootdemomultithread.threadPool;

import java.util.concurrent.TimeUnit;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/21 19:59
 */
public class Worker implements Runnable {

    private String name;

    public Worker(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        exec();
    }

    private void exec() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "will be called.");
    }
}
