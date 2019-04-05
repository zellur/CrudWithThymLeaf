package com.test.crud.crud.controller;

import com.test.crud.crud.model.UserModel;
import com.test.crud.crud.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping(value = "/save")
    public String save(@ModelAttribute("user")UserModel userModel,Model model){
        userService.save(userModel);
        model.addAttribute("saved","User Added Successfully");
        model.addAttribute("users",userService.getAllUsers());
        return "dashboard";
    }

    @GetMapping(value = "/users")
    public String getAllUser(Model model){
        model.addAttribute("users",userService.getAllUsers());
        return "dashboard";
    }

    @GetMapping(value = "user/{id}/delete")
    public String deleteUser(@PathVariable(value = "id") String id,Model model){
        Long userId = Long.parseLong(id);
        userService.delete(userId);
        model.addAttribute("deleted","User Deleted Successfuly");
        model.addAttribute("users",userService.getAllUsers());
        return "dashboard";
    }

    @GetMapping(value = "user/{id}/edit")
    public String editUser(@PathVariable(value = "id") String id,Model model){
        Long userId = Long.parseLong(id);
        model.addAttribute("user",userService.findUserByid(userId));
        return "edituser";
    }

}
