package com.cxspace.ssm.service.impl;

import com.cxspace.ssm.dao.StoryDao;
import com.cxspace.ssm.model.Page;
import com.cxspace.ssm.model.Story;
import com.cxspace.ssm.service.StoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liujie on 2017/8/16.
 */

@Service("storyServiceImpl")

public class StoryServiceImpl implements StoryService{

    @Autowired
    private StoryDao storyDao;

    public int insert(Story entity) throws Exception {
        return storyDao.insert(entity);
    }

    public int update(Story entity) throws Exception {
        return storyDao.update(entity);
    }

    public int delete(Story entity) throws Exception {
        return storyDao.delete(entity);
    }

    public Story select(Story entity) throws Exception {
        return storyDao.select(entity);
    }

    public List<Story> selectAll() {
        return storyDao.selectAll();
    }

    public Page<Story> selectPage(Page<Story> page) {
        return null;
    }

    public Page<Story> selectPageUseDyc(Page<Story> page) {
        return null;
    }

    public int insertDynamic(@Param("items") Story entity, @Param("tableName") String tableName) {
        return 0;
    }

    public Page<Story> selectPageListDynamic(@Param("pages") Page<Story> page, @Param("tableName") String tableName) {
        return null;
    }

    public int selectPageCountDynamic(@Param("tableName") String tableName) {
        return 0;
    }

    public int deleteDynamic(@Param("tablesName") String tableName, @Param("items") Story entity) {
        return 0;
    }

    public int updateDynamic(@Param("tableName") String tableName, @Param("items") Story entity) {
        return 0;
    }

    public Story selectDynamic(@Param("tableName") String table, @Param("items") Story entity) {
        return null;
    }
}
