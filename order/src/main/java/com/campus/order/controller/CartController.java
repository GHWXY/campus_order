package com.campus.order.controller;

import com.campus.order.domain.Address;
import com.campus.order.domain.Cart;
import com.campus.order.domain.CartExample;
import com.campus.order.service.AddressService;
import com.campus.order.service.CartService;
import com.campus.order.service.MerchantService;
import com.campus.order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CartController {
    @Autowired
    private CartService cartService;
    @Autowired
    private ProductService productService;
    @Autowired
    private MerchantService merchantService;

    @Autowired
    private AddressService addressService;

    @PostMapping("/cart")
    public String cart(Cart cart, CartExample cartExample, Model model){
        System.out.println("-----cart-----");
        System.out.println(cart);
        /*加入购物车*/
        int i = cartService.insertSelective(cart);
        System.out.println(i);

        /*查询购物车列表*/
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andUidEqualTo(cart.getUid());
        cartExample.setDistinct(false);
        List<Cart> cartlist = cartService.selectByExample(cartExample);
        System.out.println(cartlist);
        model.addAttribute("cartlist",cartlist);
        return "cart";
    }
    @RequestMapping("/cartdelete")
    public String delete(@RequestParam("uid") Long uid,@RequestParam("pname") String pname,CartExample cartExample,Model model){
        System.out.println("-------delete----------");
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andCnameEqualTo(pname);
        int i = cartService.deleteByExample(cartExample);
        System.out.println(i);


       /* *//*查询购物车列表*//*
        System.out.println(uid);
        CartExample.Criteria criteria1 = cartExample.createCriteria();
        criteria1.andUidEqualTo(uid);
        cartExample.setDistinct(false);
        List<Cart> cartlist1 = cartService.selectByExample(cartExample);
        System.out.println(cartlist1);
        model.addAttribute("cartlist",cartlist1);*/
        return "cart";
    }

    @RequestMapping("/confirmorder")
    public String confirmorder(@RequestParam("uid") Integer uid,@RequestParam("sum") double sum,Model model){
        System.out.println("————confirmorder————————");
        System.out.println("sum="+sum);
        model.addAttribute("sum",sum+2);
        System.out.println(uid);
        List<Address> addresses = addressService.selectAll(uid);
        model.addAttribute("addr",addresses);

        return "confirm_order";
    }
}
