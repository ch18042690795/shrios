package com.example.service.impl;

import com.example.domain.Module;
import com.example.domain.User;
import com.example.mapper.cluster.ModuleMapper;
import com.example.mapper.master.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: shrios
 * @description:
 * @author: Mr.Wang
 * @create: 2019-04-09 13:25
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ModuleMapper moduleMapper;
    @Override
    public User findUserByUserName(String username) {
        this.insertData();
        return userMapper.findByUserName(username);

    }

    @Override
    public void insertData() {
        Module m =new Module();
        m.setMid(5);
        m.setMname("a");
        moduleMapper.insert(m);
    }



}
