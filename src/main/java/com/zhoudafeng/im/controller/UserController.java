package com.zhoudafeng.im.controller;

import com.zhoudafeng.im.pojo.vo.EmailRegisterParam;
import com.zhoudafeng.im.pojo.vo.LoginToken;
import com.zhoudafeng.im.service.UserService;
import com.zhoudafeng.im.utils.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/emailRegister")
    @ResponseBody
    public ApiResult<LoginToken> register(@RequestBody EmailRegisterParam emailRegisterParam) {
        return userService.register(emailRegisterParam);
    }
}
