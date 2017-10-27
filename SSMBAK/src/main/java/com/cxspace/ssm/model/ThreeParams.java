package com.cxspace.ssm.model;

public class ThreeParams {

    private Double param1;

    private Double param2;

    private Double param3;

    public ThreeParams(Double param1, Double param2, Double param3) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
    }

    public ThreeParams() {
    }

    public Double getParam1() {
        return param1;
    }

    public void setParam1(Double param1) {
        this.param1 = param1;
    }

    public Double getParam2() {
        return param2;
    }

    public void setParam2(Double param2) {
        this.param2 = param2;
    }

    public Double getParam3() {
        return param3;
    }

    public void setParam3(Double param3) {
        this.param3 = param3;
    }

    @Override
    public String toString() {
        return "ThreeParams{" +
                "param1=" + param1 +
                ", param2=" + param2 +
                ", param3=" + param3 +
                '}';
    }
}
