package com.cxspace.ssm.model;

/**
 * Created by liujie on 2017/9/18.
 */
public class Search {


    private String keyword;

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public Search(String keyword) {
        this.keyword = keyword;
    }

    public Search() {
    }

    @Override
    public String toString() {
        return "Search{" +
                "keyword='" + keyword + '\'' +
                '}';
    }
}
