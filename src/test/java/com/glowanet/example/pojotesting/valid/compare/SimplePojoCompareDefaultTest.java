package com.glowanet.example.pojotesting.valid.compare;

import com.glowanet.example.pojotesting.compare.SimplePojoCompareDefault;
import com.glowanet.tools.unit.entity.EntityUnitTester;

/**
 * Example, to verify if the default compare implementation by the sdk works fine.
 */
public class SimplePojoCompareDefaultTest extends EntityUnitTester<SimplePojoCompareDefault> {

    public SimplePojoCompareDefaultTest() {
        super(SimplePojoCompareDefault.class);
    }
}