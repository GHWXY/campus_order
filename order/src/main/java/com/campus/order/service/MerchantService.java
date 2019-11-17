package com.campus.order.service;

import com.campus.order.domain.Merchant;
import com.campus.order.domain.MerchantExample;

import java.util.List;

public interface MerchantService {

    Merchant selectByPrimaryKey(Long mId);

    List<Merchant> selectByExample(MerchantExample example);
}
