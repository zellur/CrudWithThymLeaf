package com.test.crud.crud.model;

import com.test.crud.crud.data.User;

public class UserModel {

    private Long id;

    private String userName;

    private String password;

    private String name;

    private String email;

    private String mobile;

    public UserModel() {
    }

    public UserModel(User user) {
        this.setId(user.getId());
        this.setName(user.getName());
        this.setMobile(user.getMobile());
        this.setEmail(user.getEmail());
        this.setPassword(user.getPassword());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
