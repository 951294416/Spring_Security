package com.example.domain;

import java.io.Serializable;

/**
 * (Sex)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
public class Sex implements Serializable {
    private static final long serialVersionUID = -50675202834027702L;
    /**
     * 性别 Id
     */
    private Integer sexid;
    /**
     * 性别名称
     */
    private String sexname;


    public Integer getSexid() {
        return sexid;
    }

    public void setSexid(Integer sexid) {
        this.sexid = sexid;
    }

    public String getSexname() {
        return sexname;
    }

    public void setSexname(String sexname) {
        this.sexname = sexname;
    }

}

