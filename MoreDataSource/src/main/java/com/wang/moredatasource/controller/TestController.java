package com.wang.moredatasource.controller;

import com.wang.entity.Money;
import com.wang.entity.User;
import com.wang.service.MoneyService;
import com.wang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserService userService;
    @Autowired
    private MoneyService moneyService;

    @RequestMapping("/queryUser")
    public User queryUser() {
        return userService.selectUserByName("Daisy");
    }

    @RequestMapping("/queryMoney")
    public Money queryMoney() {
        return moneyService.selectMoneyById(2);
    }

}
