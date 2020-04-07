package tech.liangfang.springbootdemomultithread;

import lombok.Data;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/7 22:19
 */
@Data
public class AutomicIntegerDemo implements Runnable{

    AtomicInteger safeCounter = new AtomicInteger(0);


    @Override
    public void run() {
        IntStream.range(0,100000).forEach(b->{
            safeCounter.getAndIncrement();
        });
    }

    public static void main(String[] args) throws InterruptedException {
        AutomicIntegerDemo mt = new AutomicIntegerDemo();
        Thread t1 = new Thread(mt);
        Thread t2 = new Thread(mt);
        t1.start();
        t2.start();
        Thread.sleep(500);
        System.out.println(mt.safeCounter.get());
    }
}
