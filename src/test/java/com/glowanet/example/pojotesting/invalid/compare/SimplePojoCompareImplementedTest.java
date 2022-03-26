package com.glowanet.example.pojotesting.invalid.compare;

import com.glowanet.example.pojotesting.valid.compare.SimplePojoCompareImplemented;
import com.glowanet.tools.unit.entity.AbstractEntityUnitTester;
import com.glowanet.util.junit.TestResultHelper;

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
        setCheckLogicalEqualsOnly(false);
        super.testEqualsLogicalAreTheSame();
        //check the test result
        TestResultHelper.verifyCollectorWithReset(this, TestResultHelper.WITH_ERROR);
    }
}