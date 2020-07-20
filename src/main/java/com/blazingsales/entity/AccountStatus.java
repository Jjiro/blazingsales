package com.blazingsales.entity;

public enum AccountStatus {
    ACTIVE("ACTIVE"),
    INACTIVE("INACTIVE"),
    BLOCKED("BLOCKED");


    public final String displayAccountStatus;

    AccountStatus(String displayAccountStatus) {
        this.displayAccountStatus = displayAccountStatus;
    }

    public String getDisplayAccountStatus() {
        return displayAccountStatus;
    }



}
