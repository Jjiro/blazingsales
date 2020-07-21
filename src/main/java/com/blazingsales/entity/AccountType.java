package com.blazingsales.entity;

public enum AccountType {

    STANDARD("STANDARD"),
    PREMIUM("PREMIUM");


    public final String displayAccountType;

    AccountType(String displayAccountType) {
        this.displayAccountType = displayAccountType;
    }

    public String getDisplayAccountType() {
        return displayAccountType;
    }

}
