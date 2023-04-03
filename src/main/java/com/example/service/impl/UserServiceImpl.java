package com.example.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.domain.LoginUser;
import com.example.domain.ResponseResult;
import com.example.domain.User;
import com.example.domain.Userinfo;
import com.example.mapper.UserinfoMapper;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import com.example.utils.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserinfoMapper userinfoMapper;
    /*这是一个用户注册方法*/
    @Override
    public ResponseResult userRegistered(User user,String email) {
        /*获取当前的时间和日期*/
        user.setCreatetime(new Date());
        /*将密码以机密后的形式存入数据库*/
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        /*添加用户信息*/
        userMapper.insert(user);
        userinfoMapper.insert(new Userinfo(user.getUsername(),email));
        return new ResponseResult(200,"注册成功",null);
    }
    /*用于忘记密码第一步，查询是否有该用户的存在*/
    @Override
    public ResponseResult forgetPassword(User user) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",user.getUsername());
        User user1 = userMapper.selectOne(wrapper);
        if (user1==null)
            return new ResponseResult(400,"未查询到账户为该账号的用户信息");
        else
            return new ResponseResult(200,"查询到了",user1);
    }
    /*忘记密码第二部，对该用户所对应的邮箱发送验证码进行验证*/
    @Override
    public ResponseResult email(String email) {
        Email email1 = new Email();
        String emil = null;
        try {
            emil = email1.emil(email);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseResult(200,"邮箱发送成功",emil);
    }
    /*用户若是刚注册的账号首次进入系统，需要对该账号的信息进行完善*/
    @Override
    public ResponseResult perfectInfo(Userinfo userinfo) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        LoginUser loginUser = (LoginUser) authentication.getPrincipal();
        String username = loginUser.getUsername();
        System.out.println("userinfo---------------------------"+userinfo);
        userinfoMapper.insertUserinfo(userinfo,username);
        return new ResponseResult(200,"完善用户信息成功",userinfo);
    }
}
