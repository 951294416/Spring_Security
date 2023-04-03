package com.example.controller;

import com.example.domain.ResponseResult;
import com.example.mapper.TypeMapper;
import com.example.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    /*商品分类表*/
    @RequestMapping("/type")
    public ResponseResult type(){
        return goodsService.getType();
    }
    /*商品展示*/


}
