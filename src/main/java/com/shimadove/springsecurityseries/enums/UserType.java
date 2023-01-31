package com.shimadove.springsecurityseries.enums;

public enum UserType {
    ADMIN("Admin"),
    BANK("bank"),
    RETAIL("retail"),
    CORPORATE("corporate");

    private String description;

    UserType(String description) {
        this.description = description;
    }
}
