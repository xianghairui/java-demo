package com.xiang.demo.java.jvm.day01;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/2/1 17:40
 * <p>Description:
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        //使用List保持常量池引用，避免fullGC 回收常量池行为
        List<String> list = new ArrayList<>();
        //10M的permSize在Integer范围内存足够产生OOM
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }

}
