package com.example.domain;

import java.io.Serializable;

/**
 * (Shoptype)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
public class Shoptype implements Serializable {
    private static final long serialVersionUID = -48240753652743762L;
    /**
     * 商品 id
     */
    private Integer shoptypeid;
    /**
     * 商品类别名称
     */
    private String shoptypename;


    public Integer getShoptypeid() {
        return shoptypeid;
    }

    public void setShoptypeid(Integer shoptypeid) {
        this.shoptypeid = shoptypeid;
    }

    public String getShoptypename() {
        return shoptypename;
    }

    public void setShoptypename(String shoptypename) {
        this.shoptypename = shoptypename;
    }

}

