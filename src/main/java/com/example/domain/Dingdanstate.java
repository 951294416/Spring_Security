package com.example.domain;

import java.io.Serializable;

/**
 * (Dingdanstate)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
public class Dingdanstate implements Serializable {
    private static final long serialVersionUID = -47384029491364249L;
    /**
     * 订单状态 Id
     */
    private Integer stateid;
    /**
     * 订单状态名称
     */
    private String statename;


    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

}

