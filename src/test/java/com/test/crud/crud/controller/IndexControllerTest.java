package com.test.crud.crud.controller;

import com.test.crud.crud.model.UserModel;
import com.test.crud.crud.service.UserService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.ConcurrentModel;
import org.springframework.ui.Model;

import static org.junit.Assert.*;

public class IndexControllerTest {

    UserModel userModel;
    Model model;

    @Mock
    UserService userService;

    @Test
    public void indexPage() {
        IndexController indexController = new IndexController(userService);
        assertEquals("index",indexController.indexPage());
    }

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
         userModel = new UserModel();
         model = new ConcurrentModel();

    }


}