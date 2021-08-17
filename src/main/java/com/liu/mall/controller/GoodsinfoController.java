package com.liu.mall.controller;



import com.liu.mall.service.GoodsinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/app")
public class GoodsinfoController {

    @Autowired
    GoodsinfoService gs;

    //首页显示商品信息
    @RequestMapping("/showinfo")
    public Object showinfo(Integer pn, HttpSession s){
        return gs.showinfo(pn,s);
    }

    //搜索框提示的内容
    @RequestMapping("/search")
    public Object search(String keyword){

        return gs.search(keyword);
    }
    //商城页面显示商品
    @RequestMapping("/showkeywordgoods")
    public Object showkeywordgoods(Integer pn,String gtkeywords){

        return gs.showkeywordgoods(pn,gtkeywords);
    }


}