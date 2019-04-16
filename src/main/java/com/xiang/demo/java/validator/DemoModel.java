package com.xiang.demo.java.validator;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/1/10 16:26
 * <p>Description:
 */
public class DemoModel {

    @NotNull(message = "用户名不能为空")
    private String userName;

    @NotNull(message = "年龄不能为空")
    @Pattern(regexp = "^[0-9]{1,2}$", message = "年龄不正确")
    private String age;

    @AssertFalse(message = "必须为false")
    private String isFalse;

    @Pattern(regexp = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$", message = "出生日期格式不正确")
    private String birthday;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIsFalse() {
        return isFalse;
    }

    public void setIsFalse(String isFalse) {
        this.isFalse = isFalse;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
