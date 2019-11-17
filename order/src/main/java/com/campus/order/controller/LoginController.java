package com.campus.order.controller;

import com.campus.order.domain.UserInfo;
import com.campus.order.domain.UserInfoExample;
import com.campus.order.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private UserInfoService userInfoService;

    @GetMapping("/login")
    public String login(HttpSession session){
        UserInfo userInfo = new UserInfo();
        session.setAttribute("userInfo",userInfo);
        System.out.println("--------login----------");
        return "login";
    }
    @PostMapping("/loginuser")
    public ModelAndView loginuser(UserInfoExample userInfoExample, @RequestParam("uName") String uName, @RequestParam("uPwd") String uPwd, @RequestParam("uCheckcode") String uCheckcode, HttpServletRequest request, HttpSession session, HttpServletResponse response) {
        System.out.println("---------loginuser--------");
        ModelAndView mav = new ModelAndView();
        String username = request.getParameter("uName");
        String password = request.getParameter("uPwd");
        String checkcode = request.getParameter("uCheckcode");
        System.out.println(username+"------"+password+"------"+checkcode);
        List<UserInfo> userInfos = userInfoService.selectUsers(userInfoExample);
        System.out.println(userInfos);
        for (UserInfo userInfo : userInfos) {
            if (username.equals(userInfo.getuName()) && password.equals(userInfo.getuPwd2())){
                session.setAttribute("userInfo",userInfo);
                session.setAttribute("uid",userInfo.getuId());
                session.setAttribute("photo",userInfo.getuPhoto());
/*                //1.获取当前时间
                Date date = new Date();
               *//* 构造SimpleDateFormat对象*//*
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                *//*将当前日期按照指定格式输出成字符串*//*
                String currentTime = sdf.format(date);
                //2.创建cookie
                Cookie c = new Cookie("lastTime", currentTime);
                //可以设置持久时间
                c.setMaxAge(60*10);
                response.addCookie(c);
                //3.获取当前cookie
                Cookie[] cookies = request.getCookies();
                String lastTime = null;
                if (cookies != null){
                    for (Cookie cookie : cookies) {
                        //上次登录的cookie获取
                        if (cookie.getName().equals("lastTime")){
                            lastTime = cookie.getValue();

                        }

                    }

                }
                if (lastTime != null){

                }else {

                }*/

                mav.setViewName("index");
                return mav;
            }else {
                session.setAttribute("errormsg","账号或密码错误!请重新输入");
            }
        }


        mav.setViewName("login");
        return mav;
    }
}
