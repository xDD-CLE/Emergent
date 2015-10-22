package com.xdd;

public class SpecificationDetails {

    private String description;

    public SpecificationDetails(String description, Runnable test) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
