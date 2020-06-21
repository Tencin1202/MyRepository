package com.shop.zycshop.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.shop.zycshop.entity.Commodity;
import com.shop.zycshop.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    //跳转商品详情页
    @RequestMapping("/detail")
    public String detail(Integer skuId,Model model) {
        Commodity commodity=commodityService.getById(skuId);
        model.addAttribute("commodity",commodity);
        return "detail";
    }

    @RequestMapping("/getCommodity")
    public String getCommodityData(Model model, Integer Page,Integer type){
        model.addAttribute("commodityList",commodityService.getCommodity(Page,type));
        return "getCommodity";
    }

}
