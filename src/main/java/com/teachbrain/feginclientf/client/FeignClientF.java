package com.teachbrain.feginclientf.client;

import com.teachbrain.feginclientf.fallback.UserFallBackFactory;
import com.teachbrain.feginclientf.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Service
@FeignClient(name = "feignClientf", url = "http://localhost:9904/second",fallbackFactory = UserFallBackFactory.class)
public interface FeignClientF {
    @GetMapping("/status")
    User client2Response();

    @PostMapping(value = "/save", consumes = "application/json")
    User saveClient(User user);
}
