package com.xiang.demo.java.jvm.day01;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/2/26 18:28
 * <p>Description:
 */
public class Allocation {

    private static final int _1M = 1024 * 1024;

    public static void main(String[] args) {
//        testAllocation();
        testTenuringThreshold2();


    }

    /**
     * vm 参数
     * -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8
     */
    public static void testAllocation() {
        byte[] allocation1,allocation2, allocation3, allocation4;
        allocation1 = new byte[2 * _1M];
        allocation2 = new byte[2 * _1M];
        allocation3 = new byte[2 * _1M];
        allocation4 = new byte[2 * _1M];
    }

    /**
     * vm参数
     * -verbose:gc -Xms20M -Xmx20M -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
     * -XX:PretenureSizeThreshold=3145728
     */
    public static void testPretenureSizeThreshold() {

        byte[] allocation;
        allocation = new byte[4 * _1M];

    }

    /**
     * vm参数
     * -verbose:gc -Xms20M -Xmx20M -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1
     * -XX:+PrintTenuringDistribution=3145728
     */
    public static void testTenuringThreshold() {

        byte[] allocation1,allocation2, allocation3, allocation4;
        allocation1 = new byte[ _1M / 4];
        //什么时候进入老年代取决于XX:MaxTenuringThreshold设置
        allocation2 = new byte[4 * _1M];
        allocation3 = new byte[4 * _1M];
        allocation4 = new byte[4 * _1M];

    }

    /**
     * vm参数
     * -verbose:gc -Xms20M -Xmx20M -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15
     * -XX:+PrintTenuringDistribution=3145728
     */
    public static void testTenuringThreshold2() {

        byte[] allocation1,allocation2, allocation3, allocation4;
        allocation1 = new byte[ _1M / 4];
        //什么时候进入老年代取决于XX:MaxTenuringThreshold设置
        allocation2 = new byte[4 * _1M];
        allocation3 = new byte[4 * _1M];
        allocation4 = new byte[4 * _1M];

    }

}
