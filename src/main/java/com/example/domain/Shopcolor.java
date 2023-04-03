package com.example.domain;

import java.io.Serializable;

/**
 * (Shopcolor)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:34
 */
public class Shopcolor implements Serializable {
    private static final long serialVersionUID = 968364993265168857L;
    /**
     * 商品 id
     */
    private Integer shopid;
    /**
     * 颜色参数
     */
    private String color;
    /**
     * 小图
     */
    private String simg;
    /**
     * 大图
     */
    private String bimg;


    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSimg() {
        return simg;
    }

    public void setSimg(String simg) {
        this.simg = simg;
    }

    public String getBimg() {
        return bimg;
    }

    public void setBimg(String bimg) {
        this.bimg = bimg;
    }

}

