package com.cxspace.ssm.model;

import java.io.Serializable;

/**
 * Created by liujie on 2017/8/20.
 */
public class Comment implements Serializable {

    private String id;

    private String share_id;

    private String user_id;

    private String create_time;

    private Integer status;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShare_id() {
        return share_id;
    }

    public void setShare_id(String share_id) {
        this.share_id = share_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Comment(String id, String share_id, String user_id, String create_time, Integer status, String content) {
        this.id = id;
        this.share_id = share_id;
        this.user_id = user_id;
        this.create_time = create_time;
        this.status = status;
        this.content = content;
    }

    public Comment() {
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", share_id='" + share_id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", create_time='" + create_time + '\'' +
                ", status=" + status +
                ", content='" + content + '\'' +
                '}';
    }
}
