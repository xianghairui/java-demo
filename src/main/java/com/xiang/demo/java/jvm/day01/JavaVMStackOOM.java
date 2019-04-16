package com.xiang.demo.java.jvm.day01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/2/1 17:19
 * <p>Description:
 */
public class JavaVMStackOOM {
    private static final Logger logger = LoggerFactory.getLogger(JavaVMStackOOM.class);

    public void dontStop() {

        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    logger.info("ddddddddd");
                    dontStop();
                }
            });
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }

}
