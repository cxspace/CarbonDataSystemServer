package com.cxspace.ssm.service;

import com.cxspace.ssm.model.Comment;

import java.util.List;

/**
 * Created by liujie on 2017/8/20.
 */
public interface CommentService extends BaseService<Comment> {

    /**
     * 根据分享的id查询评论列表
     *
     * @param share_id 分享id
     * @return
     */

    public List<Comment> selectCommentsByShareId(String share_id);


    public Integer selectCommentsCountByShareId(String id);


}
