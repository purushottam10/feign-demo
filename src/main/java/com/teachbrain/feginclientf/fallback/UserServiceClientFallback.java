package com.teachbrain.feginclientf.fallback;

import com.teachbrain.feginclientf.client.FeignClientF;
import com.teachbrain.feginclientf.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class UserServiceClientFallback implements FeignClientF {

    Logger logger = LoggerFactory.getLogger(this.getClass());
    private final Throwable cause;

    public UserServiceClientFallback(Throwable cause) {
        this.cause = cause;
    }

    @Override
    public User client2Response() {
        logger.error(cause.getLocalizedMessage());
        return new User();
    }
}
