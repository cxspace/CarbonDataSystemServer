package com.cxspace.ssm.model;

public class Params {

    private Double param1;

    private Double param2;

    private Double param3;

    private Double param4;

    private Double param5;

    public Params(Double param1, Double param2, Double param3, Double param4, Double param5) {
        this.param1 = param1;
        this.param2 = param2;
        this.param3 = param3;
        this.param4 = param4;
        this.param5 = param5;
    }

    public Params() {
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

    public Double getParam4() {
        return param4;
    }

    public void setParam4(Double param4) {
        this.param4 = param4;
    }

    public Double getParam5() {
        return param5;
    }

    public void setParam5(Double param5) {
        this.param5 = param5;
    }

    @Override
    public String toString() {
        return "Params{" +
                "param1=" + param1 +
                ", param2=" + param2 +
                ", param3=" + param3 +
                ", param4=" + param4 +
                ", param5=" + param5 +
                '}';
    }
}



