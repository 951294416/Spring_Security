package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.domain.ResponseResult;
import com.example.domain.Type;
import com.example.mapper.TypeMapper;
import com.example.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private TypeMapper typeMapper;

    public ResponseResult getType(){
        List<Map<String, Object>> list = typeMapper.getAllType("0", "0");
            for (Map<String,Object> map:list){
                List<Map<String,Object>> list1 = typeMapper.getAllType("1", map.get("id"));
                map.put("list1",list1);
                for (Map<String,Object> map1:list1){
                    List<Map<String,Object>> list2 = typeMapper.getAllType("2", map1.get("id"));
                    map1.put("list2",list2);
                }
        }
//        List<Map<String,Object>> map = new ArrayList<>();
//        QueryWrapper<Type> wrapper = new QueryWrapper<>();
//        wrapper.eq("level",0);
//        wrapper.eq("prentid",0);
//        List<Map<String, Object>> list = typeMapper.selectMaps(wrapper);
//        for (int i = 0; i < list.size(); i++) {
//            QueryWrapper<Type> wrapper1 = new QueryWrapper<>();
//            Map<String, Object> maps = list.get(i);
//            wrapper1.eq("level", 1);
//            wrapper1.eq("prentid", maps.get("prentid"));
//            List<Map<String, Object>> lists = typeMapper.selectMaps(wrapper1);
//            System.out.println(lists);
//            for (int n = 0; n < list.size(); n++) {
//                Map<String, Object> mapss = lists.get(n);
//                wrapper.eq("level", 2);
//                wrapper.eq("prenti24d", mapss.get("prentid"));
//                List<Map<String, Object>> listss = typeMapper.selectMaps(wrapper);
//                for (int k = 0; k < listss.size(); k++) {
//                    Map<String, Object> mapsss = lists.get(k);
//                    System.out.println(mapsss);
//            }
//        }
//        }
        return new ResponseResult(200, "获取成功",list);
    }
}
