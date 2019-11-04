package com.xiang.demo.java.collection.test;

import org.springframework.beans.factory.ObjectFactory;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestQueue {
	
	public static final List<String> s = new ArrayList<>();


    /** Cache of singleton objects: bean name --> bean instance */
    private static final Map<String, Object> singletonObjects = new ConcurrentHashMap<String, Object>(256);

    /** Cache of singleton factories: bean name --> ObjectFactory */
    private static final Map<String, ObjectFactory<?>> singletonFactories = new HashMap<String, ObjectFactory<?>>(16);

    /** Cache of early singleton objects: bean name --> bean instance */
    private static final Map<String, Object> earlySingletonObjects = new HashMap<String, Object>(16);

	public static void main(String[] args) {
        WeakReference<String> sr = new WeakReference<String>(new String("hello"));
        System.out.println(sr.get());
        System.gc();                //通知JVM的gc进行垃圾回收
        System.out.println(sr.get());
        
        s.add("a");
        System.out.println(s.toString());


        for(int i=0;i<2000;i++) {
            singletonObjects.put("" + i, "i");
        }
        System.out.println(singletonObjects.size());
	}



}
