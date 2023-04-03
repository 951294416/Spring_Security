package com.example.domain;

import java.io.Serializable;

/**
 * (Jibeninfo)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
public class Jibeninfo implements Serializable {
    private static final long serialVersionUID = -54803896251164550L;
    
    private Integer id;
    
    private String key;
    
    private String value;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

