package com.glowanet.example.pojotesting.valid.compare;

import com.glowanet.tools.unit.entity.AbstractEntityUnitTester;

public class SimplePojoCompareImplementedTest extends AbstractEntityUnitTester<SimplePojoCompareImplemented> {

    public SimplePojoCompareImplementedTest() {
        super(SimplePojoCompareImplemented.class);

    }

    @Override
    protected SimplePojoCompareImplemented createObject2Test() {
        return new SimplePojoCompareImplemented();
    }

    @Override
    public void testEqualsLogicalAreTheSame() {
        setCheckLogicalEqualsOnly(true);
        super.testEqualsLogicalAreTheSame();
    }
}