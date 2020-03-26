package com.xkcoding.redisson.lock;

import org.redisson.api.RLock;

import java.util.concurrent.TimeUnit;

/**
 * 功能描述：
 *
 * @Author dawei.lv  -  daweilv@pateo.com.cn
 * @Date 2020/3/26 16:36
 */
public interface IDistributedLocker {

    /**
     * 拿不到锁就不罢休，不然线程一直 block
     * @param lockKey
     * @return
     */
    RLock lock(String lockKey);

    /**
     * leaseTime 为加锁时间，单位为秒
     * @param lockey
     * @param leaseTime
     * @return
     */
    RLock lock(String lockey, long leaseTime);

    /**
     * timeout为加锁时间，时间单位由unit确定
     * @param lockKey
     * @param unit
     * @param timeout
     * @return
     */
    RLock lock(String lockKey, TimeUnit unit, long timeout);

    /**
     *tryLock()，马上返回，拿到lock就返回true，不然返回false。
     * 带时间限制的tryLock()，拿不到lock，就等一段时间，超时返回false.
     * @param lockKey
     * @param unit
     * @param waitTime
     * @param leaseTime
     * @return
     */
    boolean tryLock(String lockKey, TimeUnit unit, long waitTime, long leaseTime);

    /**
     *  释放 key 的锁
     * @param lockKey
     */
    void unlock(String lockKey);

    /**
     * 释放锁
     * @param lock
     */
    void unlock(RLock lock);
}
