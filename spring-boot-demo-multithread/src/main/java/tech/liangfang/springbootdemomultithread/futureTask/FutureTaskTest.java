package tech.liangfang.springbootdemomultithread.futureTask;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/16 10:57
 */
@Slf4j
public class FutureTaskTest {

    public static void main(String[] args) {

        // 创建线程对象
        Task task = new Task();

        // 创建线程 Future
        FutureTask<Integer> futureTask = new FutureTask<Integer>(task);

        // 创建线程
        Thread thread = new Thread(futureTask);

        // 启动线程
        thread.start();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("主线程正在执行任务");

        // 获取子线程运行的结果
        try {
            log.info("Task运行结果是 {}", futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        log.info("所有线程执行完毕。");



    }
}
