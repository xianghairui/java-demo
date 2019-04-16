package com.xiang.demo.java.jvm.day01;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/2/1 16:19
 * <p>Description: -Xms20m -Xmx20m -xx:HeepDumpOnOutOfMemoryError
 */
public class HeepOOM {

    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }


}
