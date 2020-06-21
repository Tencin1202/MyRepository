package com.shop.zycshop.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.zycshop.entity.Commodity;
import com.shop.zycshop.mapper.CommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommodityService extends ServiceImpl<CommodityMapper, Commodity> {
    @Autowired
    private CommodityMapper commodityMapper;


    public List<Commodity> getCommodity(Integer Page,Integer type){
        QueryWrapper<Commodity> queryWrapper=new QueryWrapper<>();
        if(type ==1) {
            queryWrapper.orderByDesc("sku_sales");
        } else if(type==2) {
            queryWrapper.isNotNull("sku_new_price");
        } else if(type==3){
            queryWrapper.orderByDesc("sku_register");
        }
        IPage<Commodity> iPage = this.page(new Page<>(Page, 4), queryWrapper);
        return iPage.getRecords();
    }
}
