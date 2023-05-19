package com.zhoudafeng.im.mapper;

import java.util.List;

/***
 * 定义CRUD接口
 * @param <T>
 */
public interface BaseMapper<T> {
    /**
     * 保存接口
     * @param t
     * @return
     */
    Integer save(T t);

    /**
     * 查询接口，返回一个泛型类list
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
     * @param t
     * @return
     */
    Integer update(T t);

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
     * @param t
     * @return
     */
    Integer total(T t);
}
