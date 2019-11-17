package com.campus.order.controller;

import com.campus.order.domain.UserInfo;
import com.campus.order.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/register")
    public String register(){
        System.out.println("---------register---------");
        return "register";
    }
    @PostMapping("/registeruser")
    public String registeruser(UserInfo userInfo){
        System.out.println("----------registeruser-----------");
        System.out.println(userInfo);
        int i = userInfoService.insertHero(userInfo);
        System.out.println(i);
        return "login";
    }
}
