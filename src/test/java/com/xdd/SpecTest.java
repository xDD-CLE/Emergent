package com.xdd;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class SpecTest {

    @Test
    public void itCollectsTheSpecificationDetails() throws Exception {

        final int numberOfSpecificationDetailsWithinTheTestSpec = 2;
        class TestSpec extends Spec {{
            it("is the first description", () -> {
            });

            it("is the second description", () -> {
            });
        }}

        List<SpecificationDetails> specificationDetails = new TestSpec().getSpecificationDetails();

        assertEquals("The number of specification details did not match the number within the test Spec",
                numberOfSpecificationDetailsWithinTheTestSpec, specificationDetails.size());
    }
}
