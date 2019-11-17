package com.campus.order.controller;

import com.campus.order.domain.Merchant;
import com.campus.order.domain.Product;
import com.campus.order.domain.ProductExample;
import com.campus.order.service.MerchantService;
import com.campus.order.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ShopController {
    @Autowired
    private MerchantService merchantService;
    @Autowired
    private ProductService productService;

    @RequestMapping("/shop1")
    public String shop1(ProductExample productExample, @RequestParam("mid") Long mid, Model model, HttpSession session){
        System.out.println("------shop---------");
        model.addAttribute("mid",mid);
        Merchant merchant = merchantService.selectByPrimaryKey(mid);
        System.out.println(merchant.getmPhoto());
        model.addAttribute("shop",merchant);
        List<Product> products = productService.selectBymid(mid);
        System.out.println(products);
        model.addAttribute("list",products);
        System.out.println(products);
        return "shop";

    }
    @RequestMapping("/shop2")
    public String shop2(ProductExample productExample,@RequestParam("mid") Long mid, Model model){
        System.out.println("------shop---------");
        model.addAttribute("mid",mid);
        Merchant merchant = merchantService.selectByPrimaryKey(mid);
        model.addAttribute("shop",merchant);
        List<Product> products = productService.selectBymid(mid);
        model.addAttribute("list",products);
        System.out.println(products);
        return "shop";

    }
    @RequestMapping("/shop3")
    public String shop3(ProductExample productExample,@RequestParam("mid") Long mid, Model model){
        System.out.println("------shop---------");
        Merchant merchant = merchantService.selectByPrimaryKey(mid);
        model.addAttribute("shop",merchant);
        List<Product> products = productService.selectBymid(mid);
        model.addAttribute("list",products);
        System.out.println(products);
        return "shop";

    }
    @RequestMapping("/shop4")
    public String shop4(ProductExample productExample,@RequestParam("mid") Long mid, Model model){
        System.out.println("------shop---------");
        Merchant merchant = merchantService.selectByPrimaryKey(mid);
        model.addAttribute("shop",merchant);
        List<Product> products = productService.selectBymid(mid);
        model.addAttribute("list",products);
        System.out.println(products);
        return "shop";

    }
    @RequestMapping("/shop5")
    public String shop5(ProductExample productExample,@RequestParam("mid") Long mid, Model model){
        System.out.println("------shop---------");
        Merchant merchant = merchantService.selectByPrimaryKey(mid);
        model.addAttribute("shop",merchant);
        List<Product> products = productService.selectBymid(mid);
        model.addAttribute("list",products);
        System.out.println(products);
        return "shop";

    }
    @RequestMapping("/shop6")
    public String shop6(ProductExample productExample,@RequestParam("mid") Long mid, Model model){
        System.out.println("------shop---------");
        Merchant merchant = merchantService.selectByPrimaryKey(mid);
        model.addAttribute("shop",merchant);
        List<Product> products = productService.selectBymid(mid);
        model.addAttribute("list",products);
        System.out.println(products);
        return "shop";

    }
    @RequestMapping("/shop7")
    public String shop7(ProductExample productExample,@RequestParam("mid") Long mid, Model model){
        System.out.println("------shop---------");
        Merchant merchant = merchantService.selectByPrimaryKey(mid);
        model.addAttribute("shop",merchant);
        List<Product> products = productService.selectBymid(mid);
        model.addAttribute("list",products);
        System.out.println(products);
        return "shop";

    }
    @RequestMapping("/shop8")
    public String shop8(ProductExample productExample,@RequestParam("mid") Long mid, Model model){
        System.out.println("------shop---------");
        Merchant merchant = merchantService.selectByPrimaryKey(mid);
        model.addAttribute("shop",merchant);
        List<Product> products = productService.selectBymid(mid);
        model.addAttribute("list",products);
        System.out.println(products);
        return "shop";

    }
    @RequestMapping("/shop9")
    public String shop9(ProductExample productExample,@RequestParam("mid") Long mid, Model model){
        System.out.println("------shop---------");
        Merchant merchant = merchantService.selectByPrimaryKey(mid);
        model.addAttribute("shop",merchant);
        List<Product> products = productService.selectBymid(mid);
        model.addAttribute("list",products);
        System.out.println(products);
        return "shop";

    }
    @RequestMapping("/shop10")
    public String shop10(ProductExample productExample,@RequestParam("mid") Long mid, Model model){
        System.out.println("------shop---------");
        Merchant merchant = merchantService.selectByPrimaryKey(mid);
        model.addAttribute("shop",merchant);
        List<Product> products = productService.selectBymid(mid);
        model.addAttribute("list",products);
        System.out.println(products);
        return "shop";

    }

}
