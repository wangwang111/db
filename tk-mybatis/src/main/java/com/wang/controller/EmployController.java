package com.wang.controller;

import com.wang.service.EmployService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

    @Autowired
    private EmployService employService;

    @GetMapping("test")
    public String test() {
        employService.selectOne();
        return "success";
    }
}
