package com.xiang.demo.java.spring.xsd;

/**
 * <p>Auther: xianghairui
 * <p>Date: 2019/9/25 11:19
 * <p>Description:
 */
public class User {

    public User() {
    }

    public User(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    private String userName;

    private String email;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
