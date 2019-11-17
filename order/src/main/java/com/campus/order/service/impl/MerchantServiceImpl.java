package com.campus.order.service.impl;

import com.campus.order.domain.Merchant;
import com.campus.order.domain.MerchantExample;
import com.campus.order.mapper.MerchantMapper;
import com.campus.order.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantMapper merchantMapper;
    @Override
    public Merchant selectByPrimaryKey(Long mId) {
        return merchantMapper.selectByPrimaryKey(mId);
    }

    @Override
    public List<Merchant> selectByExample(MerchantExample example) {
        return merchantMapper.selectByExample(example);
    }
}
