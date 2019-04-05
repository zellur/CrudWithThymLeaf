package com.test.crud.crud.controller;

import com.test.crud.crud.model.UserModel;
import com.test.crud.crud.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    private UserService userService;

    public IndexController(UserService userService){
        this.userService = userService;
    }



    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String indexPage(){
        return "index";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(@ModelAttribute("user") UserModel userModel, Model model){
        if(userModel.getUserName().equals("rakib") && userModel.getPassword().equals("rakib")){
            model.addAttribute("users",userService.getAllUsers());
            return "dashboard";
        } else {
            model.addAttribute("error","Bad Credential");
            return "error";
        }
    }
}
