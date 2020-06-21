package com.shop.zycshop.controller;


import com.shop.zycshop.entity.Seller;
import com.shop.zycshop.service.SellerService;
import com.shop.zycshop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.sql.Timestamp;
import java.util.Date;

@Controller
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    //商家入驻
    @ResponseBody
    @RequestMapping("/settle")
    public String settle(Seller seller, HttpSession session){
        seller.setSellerRegister(new Timestamp(new Date().getTime()).toString());
        sellerService.save(seller);
        return "success";
    }

    @ResponseBody
    //检查店铺名是否存在
    @RequestMapping("/checkShopName")
    public String CheckShopName(String shopName) {
        return sellerService.checkShopName(shopName);
    }

    //跳转店铺信息页
    @RequestMapping("/shop")
    public String shop() {
        return "shop";
    }

    @ResponseBody
    //检查用户是否有店铺
    @RequestMapping("/isSeller")
    public String isSeller(Integer userId) {
        return sellerService.isSeller(userId);
    }
}
