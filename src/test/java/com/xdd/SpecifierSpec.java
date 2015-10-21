package com.xdd;


import static com.xdd.Spec.it;
import static org.junit.Assert.*;

public class SpecifierSpec { {

    //TODO: I wonder if passing in (this) could give me a hook to run within the spec. But is there a cleaner way?
    it("Allows me to describe my tests simply", () -> {

        assertTrue("This should work",true);
    });


} }
