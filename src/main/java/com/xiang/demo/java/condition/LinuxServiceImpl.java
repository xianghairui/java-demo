package com.xiang.demo.java.condition;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/1/7 15:46
 * <p>Description:
 */
public class LinuxServiceImpl implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
