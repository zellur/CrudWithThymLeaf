package com.test.crud.crud.data;

import com.test.crud.crud.model.UserModel;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name",length = 20)
    private String name;

    @Column(name = "email",length = 30)
    private String email;

    @Column(name = "mobile",length = 20)
    private String mobile;

    @Column(name = "password",length = 10)
    private String password;

    public User() {
    }

    public User(UserModel userModel) {
        this.setName(userModel.getName());
        this.setEmail(userModel.getEmail());
        this.setMobile(userModel.getMobile());
        this.setPassword(userModel.getPassword());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
