package com.zhoudafeng.im.service.impl;

import com.zhoudafeng.im.mapper.UserMapper;
import com.zhoudafeng.im.pojo.vo.EmailRegisterParam;
import com.zhoudafeng.im.service.UserService;
import com.zhoudafeng.im.utils.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public ApiResult register(EmailRegisterParam emailRegisterParam) {
        return userMapper.save(emailRegisterParam);
    }
}
