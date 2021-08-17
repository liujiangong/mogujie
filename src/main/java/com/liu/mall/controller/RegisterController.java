package com.liu.mall.controller;

import com.liu.mall.pojo.User;
import com.liu.mall.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/app")
public class RegisterController {
    @Autowired
    RegisterService ls;
    //用户注册
    @RequestMapping("/register")
    public Object register(User u) {
        System.out.println(u.getPassword());
        return ls.register(u);
    }
    //用户登录
    @RequestMapping("/login")
    public Object login(User u, HttpSession s) {
        return ls.login(u,s);
    }
    //检测用户在线状态
    @RequestMapping("/useronline")
    public Object useronline(HttpSession s) {
        return ls.useronline(s);
    }
    //用户注销登录
    @RequestMapping("/logout")
    public Object logout(HttpSession s) {
        return ls.logout(s);
    }
}
