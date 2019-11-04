package com.xiang.demo.java.spring.xsd;

import com.alibaba.fastjson.JSON;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/9/25 17:28
 * <p>Description:
 */
public class TestXsd {

    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("my-test.xml");
        User user = (User) bf.getBean("testBean");
        System.out.println(JSON.toJSONString(user));
    }

}
