package tech.liangfang.springbootdemomultithread.futureTask;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/16 10:57
 */
@Slf4j
public class ExcutorsTaskTest {


    public static void main(String[] args) {

        // 创建固定线程池
        ExecutorService service = Executors.newFixedThreadPool(5);

        // 创建线程对象
        Task task = new Task();

        // 将线程提交到线程池运行
        Future future = service.submit(task);

        // 关闭线程池
        service.shutdown();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        log.info("主线程正在执行任务");

        // 获取子线程运行的结果
        try {
            log.info("Task运行结果是 {}", future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }


        log.info("所有线程执行完毕。");



    }
}
