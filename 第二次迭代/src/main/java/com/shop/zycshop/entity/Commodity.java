package com.shop.zycshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.sql.Timestamp;

@Data
@TableName("tb_sku")
@EqualsAndHashCode(callSuper = false)
public class Commodity extends Model<Commodity> {
    @TableId(type = IdType.AUTO)
    private Integer skuId;
    private String skuName;
    private Integer spuId;
    private Integer sellerId;
    private String skuDes;
    private String skuImg;
    private String skuOldPrice;
    private String skuNewPrice;
    private Integer skuStock;
    private String skuSales;
    private Timestamp skuRegister;
    private String skuTag;

    public Commodity() {
    }

    public Commodity(Integer skuId, String skuName, Integer spuId, Integer sellerId, String skuDes,
                     String skuImg, String skuOldPrice, String skuNewPrice, Integer skuStock, String skuSales, Timestamp skuRegister, String skuTag) {
        this.skuId = skuId;
        this.skuName = skuName;
        this.spuId = spuId;
        this.sellerId = sellerId;
        this.skuDes = skuDes;
        this.skuImg = skuImg;
        this.skuOldPrice = skuOldPrice;
        this.skuNewPrice = skuNewPrice;
        this.skuStock = skuStock;
        this.skuSales = skuSales;
        this.skuRegister = skuRegister;
        this.skuTag = skuTag;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public String getSkuName() {
        return skuName;
    }

    public void setSkuName(String skuName) {
        this.skuName = skuName;
    }

    public Integer getSpuId() {
        return spuId;
    }

    public void setSpuId(Integer spuId) {
        this.spuId = spuId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public String getSkuDes() {
        return skuDes;
    }

    public void setSkuDes(String skuDes) {
        this.skuDes = skuDes;
    }

    public String getSkuImg() {
        return skuImg;
    }

    public void setSkuImg(String skuImg) {
        this.skuImg = skuImg;
    }

    public String getSkuOldPrice() {
        return skuOldPrice;
    }

    public void setSkuOldPrice(String skuOldPrice) {
        this.skuOldPrice = skuOldPrice;
    }

    public String getSkuNewPrice() {
        return skuNewPrice;
    }

    public void setSkuNewPrice(String skuNewPrice) {
        this.skuNewPrice = skuNewPrice;
    }

    public Integer getSkuStock() {
        return skuStock;
    }

    public void setSkuStock(Integer skuStock) {
        this.skuStock = skuStock;
    }

    public String getSkuSales() {
        return skuSales;
    }

    public void setSkuSales(String skuSales) {
        this.skuSales = skuSales;
    }

    public Timestamp getSkuRegister() {
        return skuRegister;
    }

    public void setSkuRegister(Timestamp skuRegister) {
        this.skuRegister = skuRegister;
    }

    public String getSkuTag() {
        return skuTag;
    }

    public void setSkuTag(String skuTag) {
        this.skuTag = skuTag;
    }
}
