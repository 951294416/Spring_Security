package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface TypeMapper extends BaseMapper<Type> {

    List<Map<String,Object>> getAllType(@Param("level") String level, @Param("prentid") Object prentid);

    List<Map<String,Object>> getType(@Param("level") String level, @Param("id") Object id);

}
