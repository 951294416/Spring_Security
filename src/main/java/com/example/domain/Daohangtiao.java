package com.example.domain;

import java.io.Serializable;

/**
 * (Daohangtiao)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
public class Daohangtiao implements Serializable {
    private static final long serialVersionUID = 201966018921684237L;
    
    private Integer id;
    /**
     * 导航条名称
     */
    private String daohangtiaoname;
    /**
     * uri连接
     */
    private String href;
    /**
     * 是否停用
     */
    private Integer istingyong;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDaohangtiaoname() {
        return daohangtiaoname;
    }

    public void setDaohangtiaoname(String daohangtiaoname) {
        this.daohangtiaoname = daohangtiaoname;
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

}

