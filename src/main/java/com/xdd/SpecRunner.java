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
        Description description = Description.createSuiteDescription(testClass);
        try {
            Spec spec = (Spec) testClass.newInstance();
            for (SpecificationDetails specificationDetails : spec.getSpecificationDetails()) {
                description.addChild(Description.createSuiteDescription(specificationDetails.getDescription()));
            }
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return description;
    }

    @Override
    public void run(RunNotifier notifier) {

    }
}
