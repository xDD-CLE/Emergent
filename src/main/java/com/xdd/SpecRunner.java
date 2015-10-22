package com.xdd;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

public class SpecRunner extends Runner {

    private Class testClass;

    public SpecRunner(Class testClass) {
        this.testClass = testClass;
    }

    @Override
    public Description getDescription() {
        return Description.createSuiteDescription(testClass);
    }

    @Override
    public void run(RunNotifier notifier) {

    }
}
