package com.xiang.demo.java.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/1/7 15:48
 * <p>Description:
 */
@Configuration
public class MyConfiguration {

    @Bean(name = "service")
    @Conditional(WindowsCondition.class)
    public ListService windowsService() {
        return new WindowsServiceImpl();
    }


    @Bean(name = "service")
    @Conditional(LinuxCondition.class)
    public ListService LinuxService() {
        return new WindowsServiceImpl();
    }

}
