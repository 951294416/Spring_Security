package com.example;

import com.example.mapper.TypeMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.*;

@SpringBootTest
class SpringSecurityApplicationTests {

    @Autowired
    private TypeMapper typeMapper;
    @Test
    void contextLoads() {

    }
    @Test
    void jihe() {
        List<Map<String,Object>> list = new ArrayList<Map<String, Object>>();
        Map<String,Object> map1 = new HashMap<String, Object>();
        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();
        List<String> list3 = new ArrayList<String>();
        List<String> list4 = new ArrayList<String>();
        list1.add("hello word 1");
        list2.add("hello word 2");
        list3.add("hello word 3");
        list4.add("hello word 4");

        map1.put("a",list1);
        map1.put("b",list2);
        list.add(map1);

        Map<String,Object> map2 = new HashMap<String, Object>();
        map2.put("c",list3);
        map2.put("d",list4);
        list.add(map2);
        //第一种方式：
        for (Map<String,Object> map:list) {
            for (String s:map.keySet()) {
                System.out.print("key:"+s+"\t");
                System.out.println("value:"+map.get(s));
            }
        }
        System.out.println("==========第一种方式结束===========");
        //第二种方式：
        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> map = list.get(i);
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                System.out.print("key:"+str+"\t");
                System.out.println("value:"+map.get(str));
            }
        }
        System.out.println("========第二种方式结束=============");
        //第三种方式：
        for (Map<String, Object> map : list) {
            for (Map.Entry<String, Object> m : map.entrySet()) {
                System.out.print("key:"+m.getKey() + "    ");
                System.out.println("value:"+m.getValue());
            }
        }
        System.out.println("========第三种方式结束=============");
    }
    @Test
    void for1(){
        List<Map<String, Object>> list = typeMapper.getAllType("0", "0");
        for (Map<String,Object> map:list){
            List<Map<String,Object>> list1 = typeMapper.getAllType("1", map.get("id"));
            map.put("list1",list1);
        }
    }
}


