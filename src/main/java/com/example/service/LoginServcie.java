package com.example.service;

import com.example.domain.ResponseResult;
import com.example.domain.User;

public interface LoginServcie {
    ResponseResult login(User user);

    ResponseResult logout();
}
