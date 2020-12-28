package com.teachbrain.feginclientf.fallback;

import com.teachbrain.feginclientf.client.FeignClientF;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class UserFallBackFactory implements FallbackFactory<FeignClientF> {
    @Override
    public FeignClientF create(Throwable throwable) {
        return new UserServiceClientFallback(throwable);
    }
}
