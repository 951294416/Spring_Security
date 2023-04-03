package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * (Dingdanxiangqing)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Dingdanxiangqing implements Serializable {
    private static final long serialVersionUID = 107511804207102883L;
    /**
     * id
     */
    private Integer id;
    /**
     * 订单编号
     */
    private String dingdannumber;
    /**
     * 商品id
     */
    private Integer shopid;
    /**
     * 尺寸
     */
    private String chicui;
    /**
     * 颜色
     */
    private String color;


}

