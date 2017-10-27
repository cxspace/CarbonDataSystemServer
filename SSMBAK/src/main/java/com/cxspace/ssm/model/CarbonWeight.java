package com.cxspace.ssm.model;

public class CarbonWeight {

    private Integer id;

    private Double weight;

    private Integer year_month_id;

    private Boolean submit_status;

    public CarbonWeight(Integer id, Double weight, Integer year_month_id, Boolean submit_status) {
        this.id = id;
        this.weight = weight;
        this.year_month_id = year_month_id;
        this.submit_status = submit_status;
    }

    public CarbonWeight() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getYear_month_id() {
        return year_month_id;
    }

    public void setYear_month_id(Integer year_month_id) {
        this.year_month_id = year_month_id;
    }

    public Boolean getSubmit_status() {
        return submit_status;
    }

    public void setSubmit_status(Boolean submit_status) {
        this.submit_status = submit_status;
    }

    @Override
    public String toString() {
        return "CarbonWeight{" +
                "id=" + id +
                ", weight=" + weight +
                ", year_month_id=" + year_month_id +
                ", submit_status=" + submit_status +
                '}';
    }
}
