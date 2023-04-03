package com.example.controller;//package com.example.controller;

import com.example.domain.ResponseResult;
import com.example.domain.User;
import com.example.domain.Userinfo;
import com.example.service.LoginServcie;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserService userService;
    @Autowired
    private LoginServcie loginServcie;

    /**
     * 用户注册接口
     */
    @RequestMapping("/registered")
    public ResponseResult userRegistered(@RequestParam("username") String username,
                                         @RequestParam("password") String password,
                                         @RequestParam("email") String email){
        /*调用service层方法添加注册用户的信息*/
        return userService.userRegistered(new User(username,password),email);
    }
    /**
     * 用户登录接口
     */
    @RequestMapping("/login")
    public ResponseResult loginUser(@RequestParam("username") String username,
                                    @RequestParam("password") String password){
        /*调用service登录方法完成登录*/
        return loginServcie.login(new User(username,password));
    }
    /**
     * 发送邮件
     */
    @RequestMapping("/forgetPassword")
    public ResponseResult forgetPassword(@RequestParam("username") String username){
        /*忘记密码第一步，查询是否存在的当前账号信息*/
        return userService.forgetPassword(new User(username));
    }
    /**
     * 若用户名校验成功，则进入忘记密码第二步，进行邮箱验证
     */
    @RequestMapping("/email")
    public ResponseResult email(@RequestParam("email") String email){
        /*第二步，发送邮箱验证码到该账户绑定邮箱*/
        return userService.email(email);
    }
    /**
     * 用户在第一次登录成功后需要先进行个人详细信息的完善
     */
    @RequestMapping("/perfectInfo")
    public ResponseResult perfectInfo(@RequestParam("usernick") String usernick,
                                      @RequestParam("name") String name,
                                      @RequestParam("shenfenzheng") String shenfenzheng,
                                      @RequestParam("address") String address,
                                      @RequestParam("phone") String phone,
                                      @RequestParam("sexid") Integer sexid,
                                      @RequestParam("image") String image,
                                      @RequestParam("jianjie") String jianjie){
        Userinfo userinfo = new Userinfo(usernick, name, shenfenzheng, address, phone, sexid, image, jianjie);
        return userService.perfectInfo(userinfo);
    }


}