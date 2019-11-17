package com.campus.order.controller;

import com.campus.order.domain.*;
import com.campus.order.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private UserInfoService userInfoService;

    @Autowired
    private ProductService productService;

    @Autowired
    private CartService cartService;

    @Autowired
    private CollectService collectService;

    @Autowired
    private ProTypeService proTypeService;

    @Autowired
    private MerchantService merchantService;


    @RequestMapping("/indexx")
    public String indexx(){
        return "index";
    }

    @GetMapping("/usercenter")
    public String usercenter(){
        System.out.println("---------userinfo---------");
        return "user_center";
    }

    @GetMapping("/userorderlist")
    public String userorderlist(@RequestParam(value = "uid") Integer uid){
        System.out.println("我的订单========="+uid);
        return "user_orderlist";
    }

    @GetMapping("/cart")
    public String cart(@RequestParam("uid") Long uid, CartExample cartExample, Model model){
        System.out.println("-------cart--------");
        /*查询购物车列表*/
        CartExample.Criteria criteria = cartExample.createCriteria();
        criteria.andUidEqualTo(uid);
        cartExample.setDistinct(false);
        List<Cart> cartlist = cartService.selectByExample(cartExample);
        System.out.println(cartlist);
        model.addAttribute("cartlist",cartlist);
        return "cart";
    }
    @GetMapping("/userfavorites")
    public String userfavorites(CollectExample collectExample, @RequestParam("uid") Long uid,Model model){
        System.out.println("-------userfavorites--------");
        CollectExample.Criteria criteria = collectExample.createCriteria();
        criteria.andSUidEqualTo(uid);
        collectExample.setDistinct(true);
        List<Collect> collects = collectService.selectByExample(collectExample);
        model.addAttribute("col",collects);
        return "user_favorites";
    }

    @GetMapping("/list")
    public String list(ProductTypeExample productTypeExample,MerchantExample merchantExample,ProductExample productExample,Model model){
        System.out.println("-------list--------");
        /*分类*/
        List<ProductType> productTypes = proTypeService.selectByExample(productTypeExample);
        model.addAttribute("type",productTypes);

        /*位置*/
        List<Merchant> merchants = merchantService.selectByExample(merchantExample);
        model.addAttribute("mer",merchants);

        /*查询产品*/
        productExample.setDistinct(true);
        List<Product> products = productService.selectByExample2(productExample);
        model.addAttribute("prolist",products);


        return "list";
    }

    @GetMapping("/category")
    public String category(ProductTypeExample productTypeExample,Model model,MerchantExample merchantExample,ProductExample productExample){
        System.out.println("-------category--------");
        /*分类*/
        List<ProductType> productTypes = proTypeService.selectByExample(productTypeExample);
        model.addAttribute("type",productTypes);

        /*位置*/
        List<Merchant> merchants = merchantService.selectByExample(merchantExample);
        model.addAttribute("mer",merchants);

        /*查询产品*/
        productExample.setDistinct(true);
        List<Product> products = productService.selectByExample2(productExample);
        model.addAttribute("prolist",products);



        return "category";
    }

    @GetMapping("/articleread")
    public String articleread(){
        System.out.println("-------articleread--------");
        return "article_read";
    }



}
