package com.cxspace.ssm.dao;

import com.cxspace.ssm.model.Comment;

import java.util.List;

/**
 * Created by liujie on 2017/8/20.
 */
public interface CommentDao extends BaseDao<Comment> {

    public List<Comment> selectCommentsByShareId(String share_id);

    public Integer selectCommentsCountByShareId(String id);

}
