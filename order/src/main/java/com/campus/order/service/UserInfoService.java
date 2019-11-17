package com.campus.order.service;

import com.campus.order.domain.UserInfo;
import com.campus.order.domain.UserInfoExample;

import java.util.List;

public interface UserInfoService {
   /*用户注册*/
   int insertHero(UserInfo userInfo);

   List<UserInfo> selectUsers(UserInfoExample userInfoExample);

  /* *//*通过用户名查询用户*//*
   List<UserInfo> userLogin();

   UserInfo select(String uNme,String uPwd);*/

   /*用户管理   保存*/
   int updateByPrimaryKeySelective(UserInfo record);
}
