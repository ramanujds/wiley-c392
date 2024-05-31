package com.wiley.traineeapp.api;

import com.wiley.traineeapp.dto.GitHubUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
@RequestMapping("/api/v1/github")
public class GitHubUserApi {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/{login}")
    public GitHubUser getUserDetails(@PathVariable String login){
        return restTemplate.getForObject("https://api.github.com/users/"+login,GitHubUser.class);
    }

}
