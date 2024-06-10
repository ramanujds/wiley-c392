package com.todo.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String browseHomePage(){
        return "redirect:swagger-ui/index.html";
    }
}
