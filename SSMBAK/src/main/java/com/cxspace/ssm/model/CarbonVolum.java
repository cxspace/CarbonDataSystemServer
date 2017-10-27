package com.cxspace.ssm.model;

public class CarbonVolum {

    private Integer year;

    private Integer month;

    private Double weight;

    public CarbonVolum(Integer year, Integer month, Double weight) {
        this.year = year;
        this.month = month;
        this.weight = weight;
    }

    public CarbonVolum() {
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

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "CarbonVolum{" +
                "year=" + year +
                ", month=" + month +
                ", weight=" + weight +
                '}';
    }
}
