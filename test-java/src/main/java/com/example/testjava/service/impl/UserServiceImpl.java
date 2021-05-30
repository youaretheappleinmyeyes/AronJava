package com.example.testjava.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.testjava.entity.User;
import com.example.testjava.mapper.UserMapper;
import com.example.testjava.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService {
    @Override
    public void login(String username, String password) {
        System.out.println("登录");
        System.out.println(username);
        System.out.println(password);
    }
}
