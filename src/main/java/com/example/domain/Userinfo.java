package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Userinfo)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:33
 */
@Data
@NoArgsConstructor
public class Userinfo implements Serializable {
    private static final long serialVersionUID = 573713422002124780L;
    /**
     * 用户账号
     */
    private String username;
    /**
     * 用户昵称
     */
    private String usernick;
    /**
     * 真实姓名
     */
    private String name;
    /**
     * 身份证号
     */
    private String shenfenzheng;
    /**
     * 居住地址
     */
    private String address;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 手机号码
     */
    private String phone;
    /**
     * 性别 Id
     */
    private Integer sexid;
    /**
     * 是否是店铺 
     */
    private Integer isdianpu;
    /**
     * 余额
     */
    private int money;
    /**
     * 庖铺余额
     */
    private Object dianpumoney;
    /**
     * 头像
     */
    private String image;
    /**
     * 说明
     */
    private String jianjie;



    public Userinfo(String usernick, String name, String shenfenzheng, String address, String phone, Integer sexid, String image, String jianjie) {
        this.usernick = usernick;
        this.name = name;
        this.shenfenzheng = shenfenzheng;
        this.address = address;
        this.phone = phone;
        this.sexid = sexid;
        this.image = image;
        this.jianjie = jianjie;
    }

    public Userinfo(String username, String email) {
        this.username = username;
        this.email = email;
    }
}

