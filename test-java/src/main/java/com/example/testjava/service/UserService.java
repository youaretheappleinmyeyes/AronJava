package com.example.testjava.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.testjava.entity.User;

public interface UserService extends IService<User> {

    void login(String username, String password);

}
