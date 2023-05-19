package com.zhoudafeng.im.mapper;

import com.zhoudafeng.im.pojo.User;
import com.zhoudafeng.im.pojo.vo.EmailRegisterParam;
import com.zhoudafeng.im.pojo.vo.LoginToken;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<EmailRegisterParam>{
}
