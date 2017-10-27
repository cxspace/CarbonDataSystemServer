package com.cxspace.ssm.dao;

import com.cxspace.ssm.model.Page;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * Created by liujie on 2017/8/16.
 */
public interface BaseDao <T>{

    //添加单个对象
    public int insert(T entity);

    //修改单个对象
    public int update(T entity);

    //删除单个对象
    public int delete(T entity);

    //查询单个对象
    public T select(T entity);

    public List<T> selectAll();

    //通过关键字分页查询数据列表
    public List<T> selectPageList(Page<T> page);

    //通过关键字分页查询，返回总记录数
    public Integer selectPageCount(Page<T> page);

    //通过关键字分页查询数据列表,多条件
    public List<T> selectPageListUseDyc(Page<T> page);

    //通过关键字查询分页数据,返回总记录数，多条件
    public Integer selectPageCountUseDyc(Page<T> page);

    public int insertDynamic(@Param("items")T entity , @Param("tableName")String tableName);

    public List<T> selectPageListDynamic(@Param("pages") Page<T> page , @Param("tableName")String tableName);

    public int selectPageCountDynamic(@Param("tableName")String tableName);

    public int deleteDynamic(@Param("tableName")String tableName , @Param("items") T entity);

    public int updateDynamic(@Param("tableName")String tableName , @Param("items") T entity);

    public T selectDynamic(@Param("tableName")String table,@Param("items")T entity);

}
