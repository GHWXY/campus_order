package com.campus.order.service.impl;

import com.campus.order.domain.UserInfo;
import com.campus.order.domain.UserInfoExample;
import com.campus.order.mapper.UserInfoMapper;
import com.campus.order.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Override
    public int insertHero(UserInfo userInfo) {
        return  userInfoMapper.insertSelective(userInfo);

    }

    @Override
    public List<UserInfo> selectUsers(UserInfoExample userInfoExample) {
        return userInfoMapper.selectByExample(userInfoExample);
    }

    /*用户管理   保存*/
    @Override
    public int updateByPrimaryKeySelective(UserInfo record) {
        int i = userInfoMapper.updateByPrimaryKeySelective(record);
        return i;
    }




/*    @Override
    public List<UserInfo> userLogin() {
        return userInfoMapper.userLogin();
    }

    @Override
    public UserInfo select(String uNme, String uPwd) {
        return userInfoMapper.select(uNme,uPwd);
    }*/
}
