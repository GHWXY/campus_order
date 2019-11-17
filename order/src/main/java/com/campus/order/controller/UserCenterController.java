package com.campus.order.controller;

import com.campus.order.domain.UserInfo;
import com.campus.order.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserCenterController {
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/usermessage")
    public String usermessage(){
        System.out.println("------usermessage-------");
        return "user_message";
    }

    @RequestMapping("/useraccount")
    public String useraccount(){
        System.out.println("------useraccount-------");
        return "user_account";
    }

    @PostMapping("/saveuser")
    public String saveuser(UserInfo userInfo){
        System.out.println("-------saveuser------");
        System.out.println(userInfo);
        int i = userInfoService.updateByPrimaryKeySelective(userInfo);
        System.out.println(i);
        return "user_account";
    }
}
