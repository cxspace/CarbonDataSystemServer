package com.cxspace.ssm.service.impl;

import com.cxspace.ssm.dao.ShareDao;
import com.cxspace.ssm.model.Page;
import com.cxspace.ssm.model.Share;
import com.cxspace.ssm.service.ShareService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liujie on 2017/8/19.
 */

@Service("shareServiceImpl")

public class ShareServiceImpl implements ShareService{

    @Autowired
    private ShareDao shareDao;

    public void prohibitShareById(String id) {
        shareDao.prohibitShareById(id);
    }

    public void activeShareById(String id) {
        shareDao.activeShareById(id);
    }

    public List<Share> getAll() {
        return shareDao.getAll();
    }

    public void inc_support(String id) {
        shareDao.inc_support(id);
    }

    public int insert(Share entity) throws Exception {
        return shareDao.insert(entity);
    }

    public int update(Share entity) throws Exception {
        return 0;
    }

    public int delete(Share entity) throws Exception {
        return shareDao.delete(entity);
    }

    public Share select(Share entity) throws Exception {
        return shareDao.select(entity);
    }

    public List<Share> selectAll() {
        return shareDao.selectAll();
    }

    public Page<Share> selectPage(Page<Share> page) {
        return null;
    }

    public Page<Share> selectPageUseDyc(Page<Share> page) {
        return null;
    }

    public int insertDynamic(@Param("items") Share entity, @Param("tableName") String tableName) {
        return 0;
    }

    public Page<Share> selectPageListDynamic(@Param("pages") Page<Share> page, @Param("tableName") String tableName) {
        return null;
    }

    public int selectPageCountDynamic(@Param("tableName") String tableName) {
        return 0;
    }

    public int deleteDynamic(@Param("tablesName") String tableName, @Param("items") Share entity) {
        return 0;
    }

    public int updateDynamic(@Param("tableName") String tableName, @Param("items") Share entity) {
        return 0;
    }

    public Share selectDynamic(@Param("tableName") String table, @Param("items") Share entity) {
        return null;
    }

    public List<Share> getSharesByKeyWord(String keyword) {
        return shareDao.getSharesByKeyWord(keyword);
    }
}
