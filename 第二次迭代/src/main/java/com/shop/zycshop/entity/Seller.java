package com.shop.zycshop.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "tb_seller_info")
public class Seller {
    @TableId(type = IdType.AUTO)
    private Integer sellerId;
    private Integer userId;
    private String shopName;
    private String shopAddress;
    private String sellerRegister;
    private Integer shopLevel;

    public Seller(Integer userId, Integer sellerId, String shopName, String shopAddress, String sellerRegister,Integer shopLevel) {
        this.userId = userId;
        this.sellerId=sellerId;
        this.shopName=shopName;
        this.shopAddress=shopAddress;
        this.sellerRegister=sellerRegister;
        this.shopLevel=shopLevel;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getShopName(){return shopName;}

    public void setShopName(){this.shopName=shopName;}

    public String getShopAddress(){return shopAddress;}

    public void setShopAddress(){this.shopAddress=shopAddress;}

    public String getSellerRegister() {
        return sellerRegister;
    }

    public void setSellerRegister(String sellerRegister) {
        this.sellerRegister = sellerRegister;
    }

    public Integer getShopLevel(){return shopLevel;}

    public void setShopLevel(){this.shopLevel=shopLevel;}
}
