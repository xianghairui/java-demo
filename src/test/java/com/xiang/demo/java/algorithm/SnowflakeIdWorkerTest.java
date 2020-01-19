package com.xiang.demo.java.algorithm;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.junit.Test;

import java.util.Set;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.Assert.*;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/12/25 16:36
 * <p>Description:
 */
public class SnowflakeIdWorkerTest {

    @Test
    public void nextId() {

        SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        for (int i = 0; i < 1000; i++) {
            long id = idWorker.nextId();
            System.out.println(Long.toBinaryString(id));
            System.out.println(id);
        }
    }

    @Test
    public void testThread() {

        final int count = 10000 * 1000;
        final int threadCount = 100;
        final AtomicInteger counter = new AtomicInteger(0);



        final SnowflakeIdWorker idWorker = new SnowflakeIdWorker(0, 0);
        final CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        final Set<Long> idSet = new ConcurrentSkipListSet<Long>();

        Thread[] threads = new Thread[threadCount];
        for(int i=0; i<threads.length;i++) {
            threads[i] = new Thread(new Runnable() {
                @Override
                public void run() {
                    while (counter.get() < count) {
                        counter.incrementAndGet();
                        long newId = idWorker.nextId();
                        System.out.println(Long.toBinaryString(newId));
/*                        synchronized (locker) {
                            if (idSet.contains(newId)) {
                                System.out.println("duplicate id " + newId);
                            } else {
                                idSet.add(idGen.gen(tableName));
                            }
                        }*/
                    }
                    countDownLatch.countDown();
                }
            });
            threads[i].start();
        }
        System.out.println("" + counter.get());

    }
}