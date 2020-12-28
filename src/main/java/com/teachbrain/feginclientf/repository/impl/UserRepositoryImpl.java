package com.teachbrain.feginclientf.repository.impl;

import com.teachbrain.feginclientf.model.User;
import com.teachbrain.feginclientf.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class UserRepositoryImpl extends BaseRepositoryImpl<User> implements UserRepository {
}
