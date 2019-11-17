package com.campus.order.service;

import com.campus.order.domain.Cart;
import com.campus.order.domain.CartExample;

import java.util.List;

public interface CartService {
    /*加入购物车*/
    int insertSelective(Cart record);

    /*查询购物车*/
    List<Cart> selectByExample(CartExample example);

    /*删除购物车*/
    int deleteByExample(CartExample example);



}
