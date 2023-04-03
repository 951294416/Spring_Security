package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * 商品评论表(Pinglun)实体类
 *
 * @author makejava
 * @since 2022-11-07 11:19:35
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Pinglun implements Serializable {
    private static final long serialVersionUID = -47333106071185432L;
    /**
     * id（账号）
     */
    private Integer id;
    /**
     * 商品id
     */
    private Integer shopid;
    /**
     * 卖家账号
     */
    private String zhurenuser;
    /**
     * 评论的内容
     */
    private String context;
    /**
     * 卖家账号
     */
    private String zijiuser;


}

