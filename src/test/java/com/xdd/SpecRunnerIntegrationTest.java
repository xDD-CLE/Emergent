package com.xdd;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.Description;
import org.junit.runner.notification.RunNotifier;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class SpecRunnerIntegrationTest {

    public static class TestSpec extends Spec { {

            it("is the first description", () -> {

            });

            it("is the second description", () -> {

            });

        } }

    Description description;

    @Before
    public void extractDescription() {
        SpecRunner specRunner = new SpecRunner(TestSpec.class);
        description = specRunner.getDescription();
    }

    @Test(expected = SpecificationException.class)
    public void itOnlySupportsSpecs() {
        new SpecRunner(Object.class);
    }

    @Test
    public void itsDescriptionHasADisplaynameMatchingTheSpec() {
        assertEquals("com.xdd.SpecRunnerIntegrationTest$TestSpec", description.getDisplayName());
    }

    @Test
    public void itsDescriptionHasTheSameNumberOfChildrenAsTheNumberOfSpecificationDetailsWithinTheSpec() {
        int totalCountOfSpecDetailsWithinTheTestSpec = 2;

        ArrayList<Description> children = description.getChildren();

        assertEquals("The description did not contain all of the spec details within the test spec",
                totalCountOfSpecDetailsWithinTheTestSpec, children.size());

        String nonMatchingDescriptionDetails = "The description details don't match those within the test spec!";
        assertEquals(nonMatchingDescriptionDetails, "it is the first description", children.get(0).getDisplayName());
        assertEquals(nonMatchingDescriptionDetails, "it is the second description", children.get(1).getDisplayName());
    }

}
