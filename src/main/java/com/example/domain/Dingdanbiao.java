package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * (Dingdanbiao)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Dingdanbiao implements Serializable {
    private static final long serialVersionUID = 339640249071458191L;
    
    private Integer id;
    /**
     * 订单编号
     */
    private String dingdannumber;
    /**
     * 卖家账号
     */
    private String zhurenuser;
    /**
     * 订单金额
     */
    private Object price;
    /**
     * 订单状态
     */
    private Integer stateid;
    /**
     * 下单时间
     */
    private Date createtime;
    /**
     * 卖家账号
     */
    private String username;
    /**
     * 支付方式
     */
    private Integer zhifuid;
    /**
     * 收获地址id
     */
    private Integer address;


}

