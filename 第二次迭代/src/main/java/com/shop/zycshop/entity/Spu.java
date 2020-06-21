package com.shop.zycshop.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("tb_spu")
public class Spu {
    @TableId(type = IdType.AUTO)
    private Integer spuId;
    private String spuName;
    private String brandId;
    private Integer spuCategoryId;
    private char spuTag;
}
