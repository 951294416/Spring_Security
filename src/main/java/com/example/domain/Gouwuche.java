package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * (Gouwuche)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Gouwuche implements Serializable {
    private static final long serialVersionUID = 260794093789160655L;
    /**
     * id号
     */
    private Integer id;
    /**
     * 用户账号
     */
    private String username;
    /**
     * 商品标题
     */
    private String shopname;
    /**
     * 尺寸
     */
    private String chicui;
    /**
     * 颜色
     */
    private String color;
    /**
     * 数量
     */
    private Integer count;
    /**
     * 单价
     */
    private Object price;
    /**
     * 商品图片
     */
    private String image;

}

