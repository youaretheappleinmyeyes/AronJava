package com.example.testjava.controller.posttest;

import com.example.testjava.model.CPost;
import com.example.testjava.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/postTest")
public class PostTestController {

    @Autowired
    private UserService userService;



    @PostMapping("/test")
    public String test(){
        return "1";
    }

    //    'Content-Type': 'application/json',
    @PostMapping("addPostB")
    public CPost addPostN(@RequestBody CPost par){
        return par;
    }

    //    'application/json',
    //  || application/x-www-form-urlencoded
    @PostMapping("addPost")
    public CPost addPost( CPost par){
        userService.login(par.getName(),par.getAge());
        return par;
    }
}
