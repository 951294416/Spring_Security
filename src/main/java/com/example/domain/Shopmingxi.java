package com.example.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品明细表(Shopmingxi)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
public class Shopmingxi implements Serializable {
    private static final long serialVersionUID = -93216149180084135L;
    /**
     * 店铺类型id（账号）
     */
    private Integer shoptypeid;
    /**
     * 商品id
     */
    private Integer shopid;
    /**
     * 商品小图
     */
    private String slmg;
    /**
     * 商品大图
     */
    private String blmg;
    
    private Date createtime;


    public Integer getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(Integer shoptypeid) {
        this.shoptypeid = shoptypeid;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public String getSlmg() {
        return slmg;
    }

    public void setSlmg(String slmg) {
        this.slmg = slmg;
    }

    public String getBlmg() {
        return blmg;
    }

    public void setBlmg(String blmg) {
        this.blmg = blmg;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

}

