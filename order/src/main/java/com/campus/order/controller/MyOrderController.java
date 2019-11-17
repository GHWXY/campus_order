package com.campus.order.controller;

import com.campus.order.domain.Address;
import com.campus.order.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class MyOrderController {
    @Autowired
    private AddressService addressService;

    /*收货地址回显及修改地址*/
    @GetMapping("/useraddress")
    public String usercenter(@RequestParam("uid") Integer uid, HttpSession session){
        System.out.println("收获地址========="+uid);
        List<Address> addresses = addressService.selectAll(uid);
        System.out.println(addresses);
        for (Address address : addresses) {
            session.setAttribute("address",address);
        }

        return "user_address";
    }

    @RequestMapping("/editaddr")
    public String editaddr(Address address){
        System.out.println("---------editaddr---------");
        System.out.println(address);
        int i = addressService.updateByPrimaryKey(address);
        System.out.println(i);
        return "user_address";

    }

    @RequestMapping("/address")
    public String address(Address address){
        System.out.println("--------address--------");
        int i = addressService.insert(address);
        System.out.println(i);
        return "success";
    }

}
