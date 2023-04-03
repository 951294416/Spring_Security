package com.example.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import java.io.Serializable;

/**
 * (Type)实体类
 *
 * @author makejava
 * @since 2022-11-24 16:25:50
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Type implements Serializable {
    private static final long serialVersionUID = -68987026308182003L;
    /**
     * id
     */
    private Integer id;
    /**
     * 类型名称
     */
    private String name;
    /**
     * 对应层级
     */
    private Integer level;
    /**
     * 自对应，对应level的id
     */
    private Integer prentid;
    /**
     * 类型成立时间
     */
    private Date creattime;


}

