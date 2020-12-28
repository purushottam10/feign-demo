package com.teachbrain.feginclientf.service;

import com.teachbrain.feginclientf.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUser();

    User getById(String id);
}
