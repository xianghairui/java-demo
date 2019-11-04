package com.xiang.demo.java.spring.xsd;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/9/25 11:33
 * <p>Description:
 */
public class MyNameSpaceHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        // 将组建注册到容器
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }

}
