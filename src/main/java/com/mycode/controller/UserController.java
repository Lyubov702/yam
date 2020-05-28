package com.mycode.controller;

import com.mycode.model.User;
import com.mycode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

/*
    @GetMapping(value = "/save")
    public String addMessage(Model model) {
        model.addAttribute("user", new User());

        return "user/save";
    }

    @PostMapping(value = "/save")
    public String add(@ModelAttribute("user") User user) {
        userService.save(user);
        return "redirect:/user";
    }

*/


}
