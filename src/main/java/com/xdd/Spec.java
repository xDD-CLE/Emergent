package com.xdd;

import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpecRunner.class)
public class Spec {

    private final List<SpecificationDetails> specificationDetails = new ArrayList<>();

    protected void it(String description, Runnable test) {
        specificationDetails.add(new SpecificationDetails(description, test));
    }

    public List<SpecificationDetails> getSpecificationDetails() {
        return specificationDetails;
    }
}

