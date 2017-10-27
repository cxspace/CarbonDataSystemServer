package com.cxspace.ssm.model;

public class BackStatus {

    private String isSuccess;

    public BackStatus(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    public BackStatus() {
    }

    public String getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(String isSuccess) {
        this.isSuccess = isSuccess;
    }

    @Override
    public String toString() {
        return "BackStatus{" +
                "isSuccess='" + isSuccess + '\'' +
                '}';
    }
}
