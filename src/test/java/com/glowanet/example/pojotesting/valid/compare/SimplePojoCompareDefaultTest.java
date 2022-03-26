package com.glowanet.example.pojotesting.valid.compare;

import com.glowanet.tools.unit.entity.AbstractEntityUnitTester;

public class SimplePojoCompareDefaultTest extends AbstractEntityUnitTester<SimplePojoCompareDefault> {

    public SimplePojoCompareDefaultTest() {
        super(SimplePojoCompareDefault.class);
    }

    @Override
    protected SimplePojoCompareDefault createObject2Test() {
        return new SimplePojoCompareDefault();
    }
}