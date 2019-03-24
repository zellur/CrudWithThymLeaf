package com.test.crud.crud.controller;

import com.test.crud.crud.model.UserModel;
import org.junit.Before;
import org.junit.Test;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import static org.junit.Assert.*;

public class IndexControllerTest {

    UserModel userModel;
    Model model;

    @Test
    public void indexPage() {
        IndexController indexController = new IndexController();
        assertEquals("index",indexController.indexPage());
    }

    @Before
    public void setUp() throws Exception {
         userModel = new UserModel();
         model = new ConcurrentModel();
    }

    @Test
    public void login() {
        userModel.setUserName("rakib");
        userModel.setPassword("rakib");
        assertEquals("dashboard",new IndexController().login(userModel,model));
    }
}