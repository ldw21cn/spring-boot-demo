package tech.liangfang.springbootdemomultithread.threadPool;

import java.util.Queue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/21 20:02
 */
public class ThreadPoolExecutorDemo {

    public static void main(String[] args) {

        final int QUEUE_CAPACITY = 20;

        LinkedBlockingDeque<Object> blockingDeque = new LinkedBlockingDeque<>(QUEUE_CAPACITY);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 10, 60, TimeUnit.SECONDS, (LinkedBlockingDeque)blockingDeque);



    }


}
