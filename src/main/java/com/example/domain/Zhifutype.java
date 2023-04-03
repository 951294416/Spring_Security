package com.example.domain;

import java.io.Serializable;

/**
 * (Zhifutype)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
public class Zhifutype implements Serializable {
    private static final long serialVersionUID = -37484763450862045L;
    /**
     * 支付方式 Id
     */
    private Integer zhifuid;
    /**
     * 支付方式名称
     */
    private String zhifuname;


    public Integer getZhifuid() {
        return zhifuid;
    }

    public void setZhifuid(Integer zhifuid) {
        this.zhifuid = zhifuid;
    }

    public String getZhifuname() {
        return zhifuname;
    }

    public void setZhifuname(String zhifuname) {
        this.zhifuname = zhifuname;
    }

}

