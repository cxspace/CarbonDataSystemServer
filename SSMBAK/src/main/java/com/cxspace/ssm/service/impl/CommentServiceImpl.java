package com.cxspace.ssm.service.impl;

import com.cxspace.ssm.dao.CommentDao;
import com.cxspace.ssm.model.Comment;
import com.cxspace.ssm.model.Page;
import com.cxspace.ssm.service.CommentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by liujie on 2017/8/20.
 */

@Service("commentServiceImpl")

public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    public int insert(Comment entity) throws Exception {
        return commentDao.insert(entity);
    }

    public int update(Comment entity) throws Exception {
        return 0;
    }

    public int delete(Comment entity) throws Exception {
        return 0;
    }

    public Comment select(Comment entity) throws Exception {
        return commentDao.select(entity);
    }

    public List<Comment> selectAll() {
        return commentDao.selectAll();
    }

    public Page<Comment> selectPage(Page<Comment> page) {
        return null;
    }

    public Page<Comment> selectPageUseDyc(Page<Comment> page) {
        return null;
    }

    public int insertDynamic(@Param("items") Comment entity, @Param("tableName") String tableName) {
        return 0;
    }

    public Page<Comment> selectPageListDynamic(@Param("pages") Page<Comment> page, @Param("tableName") String tableName) {
        return null;
    }

    public int selectPageCountDynamic(@Param("tableName") String tableName) {
        return 0;
    }

    public int deleteDynamic(@Param("tablesName") String tableName, @Param("items") Comment entity) {
        return 0;
    }

    public int updateDynamic(@Param("tableName") String tableName, @Param("items") Comment entity) {
        return 0;
    }

    public Comment selectDynamic(@Param("tableName") String table, @Param("items") Comment entity) {
        return null;
    }

    public List<Comment> selectCommentsByShareId(String share_id) {
        return commentDao.selectCommentsByShareId(share_id);
    }

    public Integer selectCommentsCountByShareId(String id) {
        return commentDao.selectCommentsCountByShareId(id);
    }
}
