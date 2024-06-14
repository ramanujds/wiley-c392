package com.todo.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping
    public String browseHomePage(){
        return "redirect:index.html";
    }

    @GetMapping("/api")
    public String browseApiPage(){
        return "redirect:swagger-ui.html";
    }
}
