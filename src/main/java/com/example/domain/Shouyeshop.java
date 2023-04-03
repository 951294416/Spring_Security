package com.example.domain;

import java.io.Serializable;

/**
 * (Shouyeshop)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
public class Shouyeshop implements Serializable {
    private static final long serialVersionUID = -56257386668972017L;
    
    private Integer id;
    /**
     * 商品id
     */
    private Integer shopid;
    /**
     * 商品类型id
     */
    private Integer shoptypeid;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopid() {
        return shopid;
    }

    public void setShopid(Integer shopid) {
        this.shopid = shopid;
    }

    public Integer getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(Integer shoptypeid) {
        this.shoptypeid = shoptypeid;
    }

}

