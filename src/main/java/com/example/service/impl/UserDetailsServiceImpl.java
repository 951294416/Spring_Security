package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.domain.LoginUser;
import com.example.domain.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        //查询用户信息
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        User user = userMapper.selectOne(wrapper);
        //如果没有查询到用户则抛出异常
        try {
            if(user==null){
                throw new RuntimeException("账号或者密码错误");
            }
        } catch (RuntimeException e) {
            System.out.println("账号或者密码错误");
            if(user==null){
                throw new RuntimeException("账号或者密码错误");
            }
        }
        //TODO 查询对应的权限信息
        //将数据封装成UserDetails返回
        return new LoginUser(user);
    }
}
