package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (Shopinfo)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shopinfo implements Serializable {
    private static final long serialVersionUID = -63526299205371880L;
    /**
     * 商品 Id
     */
    private Integer shopid;
    /**
     * 商品名称
     */
    private String shopname;
    /**
     * 商品描述
     */
    private String shopmiaoshu;
    /**
     * 商品价格 
     */
    private Object shopprice;
    /**
     * 尺寸
     */
    private String chicun;
    /**
     * 商品颜色
     */
    private String color;
    /**
     * 卖家账号
     */
    private String zhurenuser;
    /**
     * 商品类别 id
     */
    private Integer shoptypeid;
    /**
     * 商品封面图
     */
    private String image;
    /**
     * 商品介绍
     */
    private String context;
    /**
     * 商品发表日期
     */
    private Date createtime;


}

