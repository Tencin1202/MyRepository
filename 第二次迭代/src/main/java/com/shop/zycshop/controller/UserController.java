package com.shop.zycshop.controller;

import com.shop.zycshop.entity.User;
import com.shop.zycshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    //注册
    @ResponseBody
    @RequestMapping("/register")
    public String register(User user){
        System.out.println(user);
        user.setUserRegisterTime(new Timestamp(new Date().getTime()).toString());
        userService.save(user);
        return "success";
    }

    //登录
    @ResponseBody
    @RequestMapping("/login")
    public String login(User user, HttpSession session){
        return userService.loginCheck(user,session);
    }

    //退出
    @RequestMapping("/logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }

    @ResponseBody
    //检查用户名是否存在
    @RequestMapping("/checkAccount")
    public String CheckAccount(String account) {
        return userService.checkAccount(account);
    }

    @ResponseBody
    //检查昵称是否存在
    @RequestMapping("/checkName")
    public String CheckName(String name) {
        return userService.checkName(name);
    }

    //跳转个人信息页
    @RequestMapping("/information")
    public String Information() {
        return "information";
    }

    @ResponseBody
    @RequestMapping("/updateInfo")
    public String updateInfo(User user,HttpSession session){
        return userService.updateInfo(user,session);
    }
}
