package com.cxspace.ssm.model;

public class YearMonth {

    private Integer id;

    private Integer year;

    private Integer month;

    public YearMonth(Integer id, Integer year, Integer month) {
        this.id = id;
        this.year = year;
        this.month = month;
    }

    public YearMonth() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "YearMonth{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                '}';
    }
}
