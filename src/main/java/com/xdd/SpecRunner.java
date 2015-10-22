package com.xdd;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;

public class SpecRunner extends BlockJUnit4ClassRunner {

    public SpecRunner(Class<?> klass) throws InitializationError {
        super(klass);
    }
}
