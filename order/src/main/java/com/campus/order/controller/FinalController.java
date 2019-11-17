package com.campus.order.controller;

import com.campus.order.domain.Final;
import com.campus.order.service.FinalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class FinalController {
    @Autowired
    private FinalService finalService;
    @RequestMapping("finall")
    public String finall(Final fin, Model model, HttpSession session){
        System.out.println("-----------finall-----------");
        System.out.println(fin);
        model.addAttribute("sum",fin.getfSum());

        int i = finalService.insertSelective(fin);
        System.out.println(i);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(date);
        System.out.println(currentTime);
        session.setAttribute("tt",currentTime);
        session.setAttribute("suu",fin.getfSum());

        return "final";
    }
}
