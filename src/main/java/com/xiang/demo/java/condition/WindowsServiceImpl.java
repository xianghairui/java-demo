package com.xiang.demo.java.condition;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/1/7 15:48
 * <p>Description:
 */
public class WindowsServiceImpl implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
