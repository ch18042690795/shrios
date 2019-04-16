package com.example.service;

import com.example.domain.User;

/**
 * Created by Administrator on 2019/4/9 0009.
 */
public interface UserService {
    public User findUserByUserName(String username);
    public void insertData();
}
