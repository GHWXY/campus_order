package com.campus.order.controller;

import com.campus.order.domain.Merchant;
import com.campus.order.domain.Product;
import com.campus.order.service.MerchantService;
import com.campus.order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DetailspController {
    @Autowired
    private ProductService productService;

    @Autowired
    private MerchantService merchantService;

    @RequestMapping("/detailsp1")
    public String detailsp1(@RequestParam("pid") Long pid, Model model){
        System.out.println(pid);
        model.addAttribute("pid",pid);
        Product product1 = productService.selectByPrimaryKey(pid);
        System.out.println(product1);
        model.addAttribute("d1",product1);

        /*查询商家*/
        Merchant merchant = merchantService.selectByPrimaryKey(product1.getmId());
        model.addAttribute("m",merchant);


        return "detailsp";
    }

    @RequestMapping("/detailsp2")
    public String detailsp12(@RequestParam("pid") Long pid, Model model){
        System.out.println(pid);
        Product product = productService.selectByPrimaryKey(pid);
        model.addAttribute("d1",product);

        /*查询商家*/
        Merchant merchant = merchantService.selectByPrimaryKey(product.getmId());
        model.addAttribute("m",merchant);
        return "detailsp";
    }
    @RequestMapping("/detailsp3")
    public String detailsp3(@RequestParam("pid") Long pid,Model model){
        System.out.println("--------detailsp3-----");
        System.out.println(pid);
        Product product = productService.selectByPrimaryKey(pid);
        System.out.println(product.getpPicon());
        model.addAttribute("d1",product);

        /*查询商家*/
        Merchant merchant = merchantService.selectByPrimaryKey(product.getmId());
        model.addAttribute("m",merchant);
        return "detailsp";

    }
    @RequestMapping("/shop")
    public String shop(){
        System.out.println("----------shop----------");
        return "index";
    }


}
