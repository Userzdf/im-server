package com.zhoudafeng.im.mapper;

import com.zhoudafeng.im.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseMapper<User>{
    @Override
    Integer save(User user);

    @Override
    List<User> query();

    @Override
    Integer delete(Integer id);

    @Override
    Integer update(User user);

    @Override
    List getDataById(Integer IdKey);
}
