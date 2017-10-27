package com.cxspace.ssm.service;

/**
 * Created by liujie on 2017/8/16.
 */

import com.cxspace.ssm.model.Page;
import org.apache.ibatis.annotations.Param;
import java.util.List;

public interface BaseService<T> {

    //添加单个对象
    public int insert(T entity) throws Exception;

    //修改单个对象
    public int update(T entity) throws Exception;

    //删除单个对象
    public int delete(T entity) throws Exception;

    //查询单个对象
    public T select(T entity) throws Exception;

    //查询所有对象
    public List<T> selectAll();

    //通过关键字分页查询
    public Page<T> selectPage(Page<T> page);

    //通过多条件分页查询
    public Page<T> selectPageUseDyc(Page<T> page);

    public int insertDynamic(@Param("items")T entity, @Param("tableName")String tableName);

    public Page<T> selectPageListDynamic(@Param("pages")Page<T> page, @Param("tableName")String tableName);

    public int selectPageCountDynamic(@Param("tableName")String tableName);

    public int deleteDynamic(@Param("tablesName")String tableName , @Param("items") T entity);

    public int updateDynamic(@Param("tableName")String tableName , @Param("items") T entity);

    public T selectDynamic(@Param("tableName")String table,@Param("items")T entity);

}
