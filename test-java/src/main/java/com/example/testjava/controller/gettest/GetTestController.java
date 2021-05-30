package com.example.testjava.controller.gettest;

import com.example.testjava.model.Test;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/getTest")
public class GetTestController {

    @GetMapping("/test")
    public String test() {
        System.out.println("hello world");
        return "test";
    }

    @GetMapping("/test_p")
    public Test testParams( String a, String b,String c) {
        Test test = new Test("a", 1);
        return test;
    }

    @GetMapping("/testP/{p}")
    public String testPath(@PathVariable String p){
        return p;
    }


}
