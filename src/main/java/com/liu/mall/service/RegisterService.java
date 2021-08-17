package com.liu.mall.service;

import com.liu.mall.mapper.Mapper;
import com.liu.mall.mapper.UserMapper;
import com.liu.mall.mapper.UserinfoMapper;
import com.liu.mall.pojo.User;
import com.liu.mall.pojo.UserExample;
import com.liu.mall.pojo.Userinfo;
import com.liu.mall.pojo.UserinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.servlet.http.HttpSession;
import java.security.spec.ECField;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class RegisterService {

    @Autowired
    UserMapper um;
    @Autowired
    UserinfoMapper uim;
    @Autowired
    Mapper m;


    //用户注册
    @Transactional(rollbackFor = Exception.class)
    public Object register(User u) {
        u.setState(1);//用户初始状态
        u.setGrade(1);//用户等级
        u.setDate(new GregorianCalendar().getTime());//本地时间
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(u.getUsername());
        UUID uuid = UUID.randomUUID();
        Userinfo userinfo = new Userinfo();
        userinfo.setAvatarurl("head.jpg");
        userinfo.setName("用户"+uuid);
        List<User> users = um.selectByExample(example);
        if (users.isEmpty()) {
            um.insertSelective(u);//创建user
            uim.insertSelective(userinfo);//创建userinfo
            return 1;//注册成功返回1
        } else {
            return 2;//重名返回2
        }
    }

    //用户登录
    public Object login(User u, HttpSession s) {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(u.getUsername())
                .andPasswordEqualTo(u.getPassword());
        List<User> users = um.selectByExample(example);

        if (users.isEmpty()) {
            return 2;//用户名或者密码错误
        } else {
            UserExample example1 = new UserExample();
            example1.createCriteria().andUsernameEqualTo(u.getUsername())
                    .andPasswordEqualTo(u.getPassword()).andStateEqualTo(1);
            List<User> list = um.selectByExample(example1);
            if (list.isEmpty()) {
                return 3;//账号被冻结
            } else {
                s.setAttribute("user", users.get(0));
                return 1;//登录成功
            }
        }
    }
    //检测用户登录状态
    public Object useronline(HttpSession s) {
        User user = (User) s.getAttribute("user");
        if (user!=null){
            //说明已经登录，user两表联查
           return m.useronline(user.getUsername()).get(0);
        }else {
        return null;
    }}
    //用户注销登录
    public Object logout(HttpSession s) {
        s.removeAttribute("user");
        return 1;
    }
}