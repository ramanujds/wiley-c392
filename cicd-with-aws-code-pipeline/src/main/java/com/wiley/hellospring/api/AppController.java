package com.wiley.hellospring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    @GetMapping
    public String sayHello(){
        return "Hello Everyone, have a great day";
    }

}
