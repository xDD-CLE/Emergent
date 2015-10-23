package com.xdd;

import org.junit.runner.notification.RunNotifier;

public class SpecificationDetails {

    private final String description;
    private final Runnable test;

    public SpecificationDetails(String description, Runnable test) {
        this.description = description;
        this.test = test;
    }

    public String getDescription() {
        return description;
    }


    public void runTestWith(Spec spec, RunNotifier notifier) {
    }
}
