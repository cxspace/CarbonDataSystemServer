package com.cxspace.ssm.model;

import java.io.Serializable;

/**
 * Created by liujie on 2017/8/19.
 */
public class Share implements Serializable {

    private String id;

    private String user_id;

    private String create_time;

    private String imgsrc;

    private String content;

    private Integer support;

    private Integer status;

    private Integer comment_count;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getImgsrc() {
        return imgsrc;
    }

    public void setImgsrc(String imgsrc) {
        this.imgsrc = imgsrc;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getSupport() {
        return support;
    }

    public void setSupport(Integer support) {
        this.support = support;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public Share(String id, String user_id, String create_time, String imgsrc, String content, Integer support, Integer status, Integer comment_count) {
        this.id = id;
        this.user_id = user_id;
        this.create_time = create_time;
        this.imgsrc = imgsrc;
        this.content = content;
        this.support = support;
        this.status = status;
        this.comment_count = comment_count;
    }

    public Share() {
    }

    @Override
    public String toString() {
        return "Share{" +
                "id='" + id + '\'' +
                ", user_id='" + user_id + '\'' +
                ", create_time='" + create_time + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", content='" + content + '\'' +
                ", support=" + support +
                ", status=" + status +
                ", comment_count=" + comment_count +
                '}';
    }
}
