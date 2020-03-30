package com.xkcoding;

import com.google.common.collect.Lists;
import com.xkcoding.redisson.lock.RedissonDistributedLocker;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.RedissonScoredSortedSet;
import org.redisson.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import javax.sound.midi.Soundbank;
import javax.swing.event.CaretListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/26 22:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootDemoRedissonApplication.class)
public class RedissonClientTest {

    @Autowired
    RedissonClient redissonClient;
    @Autowired
    RedissonDistributedLocker redissonDistributedLocker;



    @Test
    public void redissonMap() {
        RMap<String, String> map = redissonClient.getMap("personalInfo");
        map.put("name", "hello1");
        map.put("address", "shenzhen");
        map.put("link", "https://github.com/yanglbme");

        RMap<Object, Object> rMap = redissonClient.getMap("hello");

        if (Objects.isNull(rMap)) {
            System.out.println("hello的 key 不存在");
        }

        if (Objects.isNull(map)) {
            System.out.println("personalInfo 的 key 不存在");
        }

        map.remove("name");
        map.remove("address");

        String link = map.get("link");

        if (!StringUtils.isEmpty(link)) {
            System.out.println(link);
        }

        if (map.containsKey("link")) {
            System.out.println("link 存在");
        }

        String s = map.putIfAbsent("link", "test");

        map.put("test", "test");

        System.out.println(s);

        ArrayList<String> list = Lists.newArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        RMap<String, List> user = redissonClient.getMap("user");
        user.put("user2", list);
        user.put("user1", list);


        List user1 = user.get("user1");

        if (!CollectionUtils.isEmpty(user1)) {
            user1.stream().forEach(System.out::println);
        }
    }

    @Test
    public void redissonLock() {
        RLock lock = redissonClient.getLock("lock");

        lock.lock(-1, TimeUnit.MINUTES);

        System.out.println(lock);
    }

    @Test
    public void redissonUnLock() throws InterruptedException {
        RLock lock = redissonClient.getLock("lock");
        lock.lock(-1, TimeUnit.SECONDS);

        Thread.sleep(30000);
        lock.unlock();
        System.out.println("锁释放成功");
    }

    @Test
    public void redissonListLock() {
        IntStream.range(0, 10000).forEach(i -> {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    RLock lock = redissonClient.getLock("lock" + i);
                    lock.lock(-1, TimeUnit.SECONDS);
                    System.out.println("Thread" + i + "启动");
                }
            }).start();
        });
    }

    @Test
    public void redissonStringTest() {
        RBucket<Object> bucket = redissonClient.getBucket("aaaa");
        // bucket.set(10000);

        Integer o = (Integer) bucket.get();
        System.out.println(o);
    }

    @Test
    public void redissonBoomfilter() {
        RBloomFilter<Object> bloomFilter = redissonClient.getBloomFilter("bloom");
        bloomFilter.tryInit(100000000L, 0.03);




    }

    @Test
    public void redissonBoomFilter() {
        RBloomFilter<Object> bloomFilter = redissonClient.getBloomFilter("bloom");
        boolean contains = bloomFilter.contains(2000000);
        System.out.println(contains);
    }

}
