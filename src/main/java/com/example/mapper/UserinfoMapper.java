package com.example.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.domain.Userinfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserinfoMapper extends BaseMapper<Userinfo> {
    int insertUserinfo(@Param("userinfo") Userinfo userinfo , @Param("username") String username);
}
