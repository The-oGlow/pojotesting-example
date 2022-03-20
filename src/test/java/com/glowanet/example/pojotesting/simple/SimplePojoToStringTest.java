package com.glowanet.example.pojotesting.simple;

import com.glowanet.tools.unit.entity.AbstractEntityUnitTester;

public class SimplePojoToStringTest extends AbstractEntityUnitTester<SimplePojoToString> {

    public SimplePojoToStringTest() {
        super(SimplePojoToString.class);
    }

    @Override
    protected SimplePojoToString createObject2Test() {
        return new SimplePojoToString();
    }
}