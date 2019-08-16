package com.xiang.demo.java.thread.threadlocal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/7/9 16:32
 * <p>Description:
 */
public class TestNum {

    private static final Logger logger = LoggerFactory.getLogger(TestNum.class);

    //通过匿名内部类覆盖ThreadLocal的initialValue()方法，指定初始值
    private static ThreadLocal<Integer> seqNum = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 0;
        }
    };

    /**
     * 获取下一个序列值
     * @return
     */
    public int getNextNum(){
        seqNum.set(seqNum.get() + 1);
        return seqNum.get();
    }

    public static void main(String[] args) {
        TestNum sn = new TestNum();
        // 3个线程共享sn,各自生产序列号
        TestClient t1 = new TestClient(sn);
        TestClient t2 = new TestClient(sn);
        TestClient t3 = new TestClient(sn);
        t1.start();
        t2.start();
        t3.start();
    }

    private static class TestClient extends Thread {

        private TestNum testNum;

        public TestClient(TestNum testNum) {
            this.testNum = testNum;
        }

        @Override
        public void run() {
            for (int i=0; i<1; i++) {
                logger.info("thread[{}] ---> sn[{}]", Thread.currentThread().getName(), testNum.getNextNum());
            }
        }
    }

}
