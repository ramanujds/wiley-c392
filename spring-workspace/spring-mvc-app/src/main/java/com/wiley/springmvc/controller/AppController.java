package com.wiley.springmvc.controller;

import com.wiley.springmvc.dto.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AppController {
    @GetMapping("/hello")
    public String sayHello(){
        System.out.println("Hello Sir/Mam");
        return "welcome.jsp";
    }

    @GetMapping("/user")
    public String getUser(Model model){
        User user = new User("Harsh","harsh@yahoo,com");
        model.addAttribute("user",user);
        return "show-user.jsp";
    }

    @PostMapping("/user")
    public String addUser(@ModelAttribute User user){
        return "show-user.jsp";
    }

}
