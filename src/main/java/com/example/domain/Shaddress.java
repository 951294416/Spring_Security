package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Shaddress)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Shaddress implements Serializable {
    private static final long serialVersionUID = 985779281109427849L;
    
    private Integer id;
    /**
     * 用户账号
     */
    private String username;
    /**
     * 收货人姓名
     */
    private String name;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 备用手机号
     */
    private String byphone;
    /**
     * 所在地区
     */
    private String city;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 标签
     */
    private String lable;


}

