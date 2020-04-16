package tech.liangfang.springbootdemomultithread.futureTask;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.*;
import java.util.stream.IntStream;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/4/16 10:32
 */
@Slf4j
public class Task  implements Callable {

    @Override
    public Integer call() throws Exception {

        log.info("子进程正在进行计算...");
        Thread.sleep(300);
        int sum = IntStream.range(0, 100).sum();
        return sum;
    }


}
