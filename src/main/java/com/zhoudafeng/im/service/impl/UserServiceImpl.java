package com.zhoudafeng.im.service.impl;

import com.zhoudafeng.im.mapper.UserMapper;
import com.zhoudafeng.im.pojo.User;
import com.zhoudafeng.im.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Override
    public List<User> queryAll() {
        return userMapper.query();
    }
}
