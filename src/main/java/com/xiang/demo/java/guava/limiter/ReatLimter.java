package com.xiang.demo.java.guava.limiter;

import com.google.common.util.concurrent.RateLimiter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2018/12/24 18:04
 * <p>Description:
 */
public class ReatLimter {

    private static final Logger logger = LoggerFactory.getLogger(ReatLimter.class);

    public static void main(String[] args) {
//        testNoRateLimiter();
//        testWithRateLimiter();
        testWithRateLimiter2();
    }

    public static void testNoRateLimiter() {
        Long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            logger.info("testNoRateLimiter call execute.." + i);
        }
        Long end = System.currentTimeMillis();
        logger.info("testNoRateLimiter = {}",end - start);
    }


    public static void testWithRateLimiter() {
        Long start = System.currentTimeMillis();
        RateLimiter limiter = RateLimiter.create(10.0, 5, TimeUnit.SECONDS); // 每秒不超过10个任务被提交
        for (int i = 0; i < 10; i++) {
            limiter.acquire(); // 请求RateLimiter, 超过permits会被阻塞
            logger.info("testWithRateLimiter call execute.." + i);

        }
        Long end = System.currentTimeMillis();

        logger.info("testWithRateLimiter = {}",end - start);

    }

    public static void testWithRateLimiter2() {
        Long start = System.currentTimeMillis();
        RateLimiter limiter = RateLimiter.create(0.2, 1, TimeUnit.SECONDS); // 每秒不超过10个任务被提交
//        create(double permitsPerSecond, long warmupPeriod, TimeUnit unit)
        for (int i = 0; i < 100; i++) {
            long begin = System.currentTimeMillis();
            limiter.acquire(); // 请求RateLimiter, 超过permits会被阻塞
            long end = System.currentTimeMillis();
            logger.info("testWithRateLimiter call execute.." + i + "[" + (end-begin)/1000.0 +"]");
        }
        Long end = System.currentTimeMillis();

        logger.info("testWithRateLimiter = {}",end - start);

    }

}
