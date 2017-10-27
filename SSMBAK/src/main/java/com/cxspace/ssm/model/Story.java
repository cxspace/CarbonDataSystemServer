package com.cxspace.ssm.model;

import java.io.Serializable;

/**
 * Created by liujie on 2017/8/16.
 */
public class Story implements Serializable{

    private String id;

    private String iconsrc;

    private String title;

    private String create_time;

    private String imgsrc;

    private String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIconsrc() {
        return iconsrc;
    }

    public void setIconsrc(String iconsrc) {
        this.iconsrc = iconsrc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public Story(String id, String iconsrc, String title, String create_time, String imgsrc, String content) {
        this.id = id;
        this.iconsrc = iconsrc;
        this.title = title;
        this.create_time = create_time;
        this.imgsrc = imgsrc;
        this.content = content;
    }

    public Story() {
    }

    @Override
    public String toString() {
        return "Story{" +
                "id='" + id + '\'' +
                ", iconsrc='" + iconsrc + '\'' +
                ", title='" + title + '\'' +
                ", create_time='" + create_time + '\'' +
                ", imgsrc='" + imgsrc + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
