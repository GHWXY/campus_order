package com.campus.order.controller;

import com.campus.order.domain.Collect;
import com.campus.order.domain.CollectExample;
import com.campus.order.service.CollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class CollectController {
    @Autowired
    private CollectService collectService;
    @RequestMapping("/collect")
    public String collect(CollectExample collectExample, Collect collect, @RequestParam("name") String name, @RequestParam("photo") String photo, @RequestParam("mid") Long mid,@RequestParam("uid") Long uid ,Model model){
        System.out.println("----------collect-----------");
        /*点击收藏*/
        collect.setsName(name);
        collect.setsPhoto(photo);
        collect.setsMid(mid);
        collect.setsUid(uid);
        System.out.println(collect);

        collectService.insertSelective(collect);

        /*查询收藏店铺*/
        CollectExample.Criteria criteria = collectExample.createCriteria();
        criteria.andSUidEqualTo(uid);
        collectExample.setDistinct(true);
        List<Collect> collects = collectService.selectByExample(collectExample);
        model.addAttribute("col",collects);

        return "user_favorites";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("sid") Long sid,@RequestParam("uid") Long uid ,Model model){
        System.out.println("---------delete-------");
        CollectExample collectExample = new CollectExample();
        /*删除收藏*/
        CollectExample.Criteria criteria = collectExample.createCriteria();
        criteria.andSIdEqualTo(sid);
        collectService.deleteByExample(collectExample);

        /*查询收藏店铺*/
        CollectExample.Criteria criteria2 = collectExample.createCriteria();
        criteria2.andSUidEqualTo(uid);
        System.out.println(uid);
        List<Collect> collects = collectService.selectByExample(collectExample);
        System.out.println("鸭蛋是----"+collects);
        model.addAttribute("col",collects);
        return "user_favorites";
    }

}
