package com.teachbrain.feginclientf.controller;

import com.teachbrain.feginclientf.client.FeignClientF;
import com.teachbrain.feginclientf.model.User;
import com.teachbrain.feginclientf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import static org.springframework.http.MediaType.APPLICATION_JSON;


@RestController
@RequestMapping("status")
public class ApplicationStatusController {

    private FeignClientF feignClientF;
    private UserService userService;

    @Autowired
    public ApplicationStatusController(FeignClientF feignClientF,UserService userService) {
        this.feignClientF = feignClientF;
        this.userService = userService;
    }

    @GetMapping
    public ResponseEntity getStatus(){
        return new ResponseEntity(feignClientF.client2Response(),HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity createUser(@RequestBody User user){
        return new ResponseEntity(feignClientF.saveClient(user),HttpStatus.OK);
    }

    @GetMapping("/getAll")
    public ResponseEntity getAll(){
        return new  ResponseEntity(userService.getAllUser(),HttpStatus.OK);
    }
}
