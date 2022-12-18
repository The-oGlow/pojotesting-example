package com.glowanet.example.pojotesting.firstexample;

import com.glowanet.tools.unit.entity.EntityUnitTester;

/**
 * The simplest test class for a pojo. That's all
 */
public class PojoTestedTest extends EntityUnitTester<PojoTested> {

    public PojoTestedTest() {
        super(PojoTested.class);
    }
}