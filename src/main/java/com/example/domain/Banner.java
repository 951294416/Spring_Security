package com.example.domain;

import java.io.Serializable;

/**
 * (Banner)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
public class Banner implements Serializable {
    private static final long serialVersionUID = 835728063270083195L;
    
    private Integer id;
    /**
     * banner 图
     */
    private String image;
    /**
     * 背景颜色
     */
    private String becolor;
    /**
     * uri连接
     */
    private String href;
    /**
     * 是否停用
     */
    private Integer istingyong;
    
    private String 备注;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBecolor() {
        return becolor;
    }

    public void setBecolor(String becolor) {
        this.becolor = becolor;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Integer getIstingyong() {
        return istingyong;
    }

    public void setIstingyong(Integer istingyong) {
        this.istingyong = istingyong;
    }

    public String get备注() {
        return 备注;
    }

    public void set备注(String 备注) {
        this.备注 = 备注;
    }

}

