package com.xkcoding.controller;

import com.google.common.collect.Lists;
import com.xkcoding.redisson.lock.RedissonDistributedLocker;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * 功能描述： 通过 redis 的分布式锁实现秒杀系统
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/27 14:01
 */
@Slf4j
@RestController
@RequestMapping
public class QiangHongBaoController {

    private Integer kucun;

    private String goodsKey = "goodsKey";

    private int timeout = 30 * 1000;

    @Resource
    RedissonDistributedLocker redissonDistributedLocker;
    @Resource
    RedissonClient redissonClient;

    @RequestMapping("/qingdan")
    public List<String> qingHongBao() {

        ArrayList<String> shopUsers = Lists.newArrayList();
        ArrayList<String> users = Lists.newArrayList();

        IntStream.range(0, 10).forEach(b -> {
            users.add("用户" + b);
        });

        RBucket<Object> bucket = redissonClient.getBucket("aaaa");
        kucun = (Integer) bucket.get();

        users.parallelStream().forEach(b -> {
            String shopUser = qiangdan(b);
            if (!StringUtils.isEmpty(shopUser)) {
                shopUsers.add(shopUser);
            }
        });

        System.out.println("抢单结束");
        return shopUsers;
    }

    private String qiangdan(String user) {


        if (kucun <= 0) {
            return "";
        }

        boolean lock = redissonDistributedLocker.tryLock(goodsKey, TimeUnit.SECONDS, timeout, 1000);
        //
        if (lock) {
            log.info("用户{}拿到锁。。。", user);

            try {


                if (kucun <= 0) {
                    return "";
                }

                try {
                    TimeUnit.NANOSECONDS.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


                kucun -= 1;
                RBucket<Object> bucket = redissonClient.getBucket("aaaa");
                bucket.set(kucun);

                log.info("用户{}抢单成功，所剩库存: {}", user, kucun);

                return user + "抢单成功，所剩库存：" + kucun;
            } finally {
                log.info("用户{}释放锁...", user);
                redissonDistributedLocker.unlock(goodsKey);
            }

        } else {

        }
        return "";
    }
}
