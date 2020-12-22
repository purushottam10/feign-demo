package com.teachbrain.feginclientf.service.impl;

import com.teachbrain.feginclientf.model.User;
import com.teachbrain.feginclientf.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getAllUser() {
        List<User> users= new ArrayList<>();
        users.add(new User("purushottam","puru@gmail.com","988484883"));
        users.add(new User("purus","puru@gmail.com","988484883"));
        return users;
    }
}
