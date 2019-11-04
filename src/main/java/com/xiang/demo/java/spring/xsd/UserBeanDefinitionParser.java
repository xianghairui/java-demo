package com.xiang.demo.java.spring.xsd;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/9/25 11:27
 * <p>Description:
 */
public class UserBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {

    @Override
    protected Class getBeanClass(Element element) {
        return User.class;
    }

    @Override
    protected void doParse(Element element, BeanDefinitionBuilder builder) {
        String userName = element.getAttribute("userName");
        String email = element.getAttribute("email");
        //将提取到的数据放入到BeanDefinitionBuilder 中， 待到完成所有bean的解析后统一注册到beanFactory中
        if(StringUtils.hasText(userName)) {
            builder.addPropertyValue("userName", userName);
        }
        if(StringUtils.hasText(email)) {
            builder.addPropertyValue("email", email);
        }

     }
}
