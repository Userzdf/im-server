package com.zhoudafeng.im.mapper;

import com.zhoudafeng.im.pojo.vo.LoginToken;
import com.zhoudafeng.im.utils.ApiResult;

import java.util.List;

/***
 * 定义CRUD接口,让所有mapper继承基本mapper
 * 免去每个mapper层都产生大量重复代码,符合面向对象设计
 * @param <T>
 */
public interface BaseMapper<T> {
    /**
     * 保存接口
     * @param object
     * @return
     */
    ApiResult<T> save(T object);

    /**
     * 查询接口，返回一个泛型类list
     *
     * @return
     */
    List<T> query();

    /**
     * 删除接口
     * @param IdKey
     * @return
     */
    Integer delete(Integer IdKey);

    /**
     * 修改接口
     * @param object
     * @return
     */
    Integer update(T object);

    /**
     * 根据唯一键查询数据
     * @param IdKey
     * @return
     */
    List getDataById(Integer IdKey);


    /**
     * 分页查询
     * @param pageSize
     * @param pageNumber
     * @return
     */
    List<T> pagingQuery(Integer pageSize,Integer pageNumber);

    /**
     * 查询数据总数
     * @return total
     * @Param null
     */
    Integer total();

    /**
     * 带参数查询数据总数
     * @param object
     * @return
     */
    Integer total(T object);
}
