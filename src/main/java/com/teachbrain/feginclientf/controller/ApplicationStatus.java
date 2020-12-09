package com.teachbrain.feginclientf.controller;

import com.teachbrain.feginclientf.client.FeignClientF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;

@RestController
@RequestMapping("status")
public class ApplicationStatus {

    private FeignClientF feignClientF;

    @Autowired
    public ApplicationStatus(FeignClientF feignClientF) {
        this.feignClientF = feignClientF;
    }

    @GetMapping
    public Response getStatus(){
        return Response.status(200).entity(feignClientF.client2Response()).build();
    }
}
