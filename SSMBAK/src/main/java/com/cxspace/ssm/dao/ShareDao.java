package com.cxspace.ssm.dao;

import com.cxspace.ssm.model.Share;

import java.util.List;

/**
 * Created by liujie on 2017/8/19.
 */
public interface ShareDao extends BaseDao<Share> {

    /**
     * 点赞
     *
     */
    public void inc_support(String id);


    public void prohibitShareById(String id);

    public void activeShareById(String id);

    public List<Share> getAll();

    public List<Share> getSharesByKeyWord(String keyword);


}
