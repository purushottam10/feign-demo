package com.teachbrain.feginclients.controller;

import com.teachbrain.feginclients.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("second")
public class ApplicationStatusController {

    @GetMapping(value = "/status")
    public User getStatus(){
       return new User("puru","puru@gmai.com","80000000");
    }

    @PostMapping("/save")
    public User save(@RequestBody User user){
        return user;
    }
}
