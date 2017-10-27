package com.cxspace.ssm.model;

import java.io.Serializable;

/**
 * Created by liujie on 2017/8/19.
 */
public class ShareAndUser implements Serializable {

    private String user_imgsrc;

    private String user_name;

    private String share_id;

    private String share_time;

    private String share_imgsrc;

    private String share_content;

    private Integer share_suport;

    private Integer share_comment_count;

    public String getUser_imgsrc() {
        return user_imgsrc;
    }

    public void setUser_imgsrc(String user_imgsrc) {
        this.user_imgsrc = user_imgsrc;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getShare_time() {
        return share_time;
    }

    public void setShare_time(String share_time) {
        this.share_time = share_time;
    }

    public String getShare_imgsrc() {
        return share_imgsrc;
    }

    public void setShare_imgsrc(String share_imgsrc) {
        this.share_imgsrc = share_imgsrc;
    }

    public String getShare_content() {
        return share_content;
    }

    public void setShare_content(String share_content) {
        this.share_content = share_content;
    }

    public Integer getShare_suport() {
        return share_suport;
    }

    public void setShare_suport(Integer share_suport) {
        this.share_suport = share_suport;
    }

    public Integer getShare_comment_count() {
        return share_comment_count;
    }

    public void setShare_comment_count(Integer share_comment_count) {
        this.share_comment_count = share_comment_count;
    }

    public String getShare_id() {
        return share_id;
    }

    public void setShare_id(String share_id) {
        this.share_id = share_id;
    }

    public ShareAndUser(String user_imgsrc, String user_name, String share_id, String share_time, String share_imgsrc, String share_content, Integer share_suport, Integer share_comment_count) {
        this.user_imgsrc = user_imgsrc;
        this.user_name = user_name;
        this.share_id = share_id;
        this.share_time = share_time;
        this.share_imgsrc = share_imgsrc;
        this.share_content = share_content;
        this.share_suport = share_suport;
        this.share_comment_count = share_comment_count;
    }

    public ShareAndUser() {
    }

    @Override
    public String toString() {
        return "ShareAndUser{" +
                "user_imgsrc='" + user_imgsrc + '\'' +
                ", user_name='" + user_name + '\'' +
                ", share_id='" + share_id + '\'' +
                ", share_time='" + share_time + '\'' +
                ", share_imgsrc='" + share_imgsrc + '\'' +
                ", share_content='" + share_content + '\'' +
                ", share_suport=" + share_suport +
                ", share_comment_count=" + share_comment_count +
                '}';
    }
}
