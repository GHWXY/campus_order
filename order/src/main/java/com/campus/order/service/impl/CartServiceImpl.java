package com.campus.order.service.impl;

import com.campus.order.domain.Cart;
import com.campus.order.domain.CartExample;
import com.campus.order.mapper.CartMapper;
import com.campus.order.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartMapper cartMapper;
    @Override
    public int insertSelective(Cart record) {
        return cartMapper.insertSelective(record);
    }

    /*查询购物车*/
    @Override
    public List<Cart> selectByExample(CartExample example) {
        return cartMapper.selectByExample(example);
    }

    @Override
    public int deleteByExample(CartExample example) {
        return cartMapper.deleteByExample(example);
    }

}
