package com.teachbrain.feginclients.controller;

import com.teachbrain.feginclients.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("second")
public class ApplicationStatusController {

    @GetMapping("/status")
    public User getStatus(){
       return new User("puru","puru@gmai.com","80000000");
    }
}
