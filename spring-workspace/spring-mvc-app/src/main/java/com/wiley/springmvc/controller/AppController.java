package com.wiley.springmvc.controller;

import com.wiley.springmvc.dto.User;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
    @GetMapping("/")
    public String sayHello(){
        System.out.println("Hello Sir/Mam");
        return "welcome";
    }

    @GetMapping("/user")
    public String getUser(Model model){
        User user = new User("Harsh","harsh@yahoo,com");
        model.addAttribute("user",user);
        return "show-user";
    }

//    @PostMapping("/user")
//    public ModelAndView addUser(HttpServletRequest request){
//        String username = request.getParameter("username");
//        String email = request.getParameter("email");
//        User user = new User(username,email);
//        ModelAndView mv = new ModelAndView("show-user.jsp");
//        mv.addObject("user",user);
//        return mv;
//    }

//    @PostMapping("/user")
//    public ModelAndView addUser(@RequestParam("username") String username,
//                                @RequestParam("email") String email){
//        User user = new User(username,email);
//        ModelAndView mv = new ModelAndView("show-user.jsp");
//        mv.addObject("user",user);
//        return mv;
//    }

    @PostMapping("/user")
    public String addUser(@ModelAttribute("user") User user){
        return "show-user";
    }


}
