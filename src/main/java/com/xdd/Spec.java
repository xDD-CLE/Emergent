package com.xdd;

import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

@RunWith(SpecRunner.class)
public class Spec {

    private final List<SpecificationDetails> specificationDetails = new ArrayList<>();

    protected void it(String description, Runnable test) {
        specificationDetails.add(new SpecificationDetails(format("it %s",description), test));
    }

    protected List<SpecificationDetails> getSpecificationDetails() {
        return specificationDetails;
    }
}

