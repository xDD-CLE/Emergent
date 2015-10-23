package com.xdd;

import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.notification.RunNotifier;

import static java.lang.String.format;

public class SpecRunner extends Runner {

    private final Spec spec;
    private final Description specDescription;

    public SpecRunner(Class testClass) {
        this.spec = validatedSpecFromThe(testClass);
        this.specDescription = Description.createSuiteDescription(spec.getClass());
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
        addSpecificationDetailsToSpecDescription();
        return specDescription;
    }

    private void addSpecificationDetailsToSpecDescription() {
        for (SpecificationDetails specificationDetails : spec.getSpecificationDetails()) {
            specDescription.addChild(Description.createSuiteDescription(specificationDetails.getDescription()));
        }
    }

    @Override
    public void run(RunNotifier notifier) {
        for(SpecificationDetails specificationDetails : spec.getSpecificationDetails()) {
            specificationDetails.runTestWith(spec,notifier);
        }
    }
}
