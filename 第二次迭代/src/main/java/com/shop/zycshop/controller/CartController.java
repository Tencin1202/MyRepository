package com.shop.zycshop.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired

    //跳转购物车页面
    @RequestMapping("/list")
    public String list(){
        return "cart";
    }
}
