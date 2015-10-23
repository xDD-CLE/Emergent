package com.xdd;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

import static java.lang.String.format;

public class SpecRunner extends Runner {

    private final Spec spec;

    public SpecRunner(Class testClass) {
        spec = validatedSpecFromThe(testClass);
    }

    private Spec validatedSpecFromThe(Class testClass) {
        try {
            return (Spec) testClass.newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassCastException e) {
            throw new SpecificationException(format("%s is not in proper Spec format!", testClass.getName()));
        }
    }

    @Override
    public Description getDescription() {
        Description description = Description.createSuiteDescription(spec.getClass());
        for (SpecificationDetails specificationDetails : spec.getSpecificationDetails()) {
            description.addChild(Description.createSuiteDescription(specificationDetails.getDescription()));
        }
        return description;
    }

    @Override
    public void run(RunNotifier notifier) {

    }
}
