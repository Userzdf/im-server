package com.zhoudafeng.im.service;


import com.zhoudafeng.im.pojo.vo.EmailRegisterParam;
import com.zhoudafeng.im.utils.ApiResult;

public interface UserService {
    ApiResult register(EmailRegisterParam emailRegisterParam);
}
