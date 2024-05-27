package com.wiley.traineesapp.controller;

import com.wiley.traineesapp.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ThymeleafDemoController {

    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("user",new User("",""));
        return "form-handling.html";
    }

    @PostMapping("/submit")
    public String submit(User user, Model model){
        model.addAttribute("username",user.username());
        model.addAttribute("isLoggedIn",true);
        return "demos";
    }



}
