package com.shop.zycshop.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shop.zycshop.entity.Seller;
import com.shop.zycshop.mapper.SellerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService extends ServiceImpl<SellerMapper, Seller> {
    @Autowired
    private SellerMapper sellerMapper;

    public String checkShopName(String shopName){
        QueryWrapper<Seller> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("shop_name" ,shopName);
        Seller seller=sellerMapper.selectOne(queryWrapper);
        if(seller==null)
            return "101";
        else
            return "102";
    }


    public String isSeller(Integer userId){
        QueryWrapper<Seller> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("user_id" ,userId);
        System.out.print(sellerMapper.selectOne(queryWrapper).getSellerRegister());
        if(sellerMapper.selectOne(queryWrapper).getSellerRegister()!=null)
            return "101";
        else
            return "102";
    }

}
