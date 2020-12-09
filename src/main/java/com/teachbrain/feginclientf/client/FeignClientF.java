package com.teachbrain.feginclientf.client;

import com.teachbrain.feginclientf.fallback.UserFallBackFactory;
import com.teachbrain.feginclientf.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "feignClientf", url = "http://localhost:9904/second",fallbackFactory = UserFallBackFactory.class)
public interface FeignClientF {
    @GetMapping("/status")
    User client2Response();
}
