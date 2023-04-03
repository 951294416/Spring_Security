package com.example.service;

import com.example.domain.ResponseResult;
import com.example.domain.User;
import com.example.domain.Userinfo;

public interface UserService {
    /*用户注册方法*/
    ResponseResult userRegistered(User user,String email);
    /*验证账号密码是否存在*/
    ResponseResult forgetPassword(User user);
    /*用作完成邮箱验证*/
    ResponseResult email(String email);

    ResponseResult perfectInfo(Userinfo userinfo);
}
