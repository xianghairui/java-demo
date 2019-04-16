package com.xiang.demo.java.condition;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/1/7 15:51
 * <p>Description:
 */
public class MyConfigurationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        ListService service = context.getBean(ListService.class);
        System.out.println(service.showListCmd());
        context.close();

    }

}