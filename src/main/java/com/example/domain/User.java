package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-11-21 11:52:00
 */
@Data
@ToString
@NoArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = -59896215130627150L;
    /**
     * 默讣 Id
     */
    private Long id;
    /**
     * 用户账号
     */
    private String username;
    /**
     * 用户密码
     */
    private String password;
    /**
     * 账号是否停用 0 是正常 1 是停 用
     */
    private Integer state;
    /**
     * 注册日期
     */
    private Date createtime;

    public User(String username, String password, Integer state) {
        this.username = username;
        this.password = password;
        this.state = state;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(String username) {
        this.username = username;
    }

}

