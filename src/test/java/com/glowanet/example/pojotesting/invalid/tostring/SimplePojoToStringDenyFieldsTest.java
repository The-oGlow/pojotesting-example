package com.glowanet.example.pojotesting.invalid.tostring;

import com.glowanet.example.pojotesting.valid.compare.SimplePojoToString;
import com.glowanet.tools.unit.entity.AbstractEntityUnitTester;
import com.glowanet.util.junit.TestResultHelper;

import java.util.List;

public class SimplePojoToStringDenyFieldsTest extends AbstractEntityUnitTester<SimplePojoToString> {

    public SimplePojoToStringDenyFieldsTest() {
        super(SimplePojoToString.class);
    }

    @Override
    protected SimplePojoToString createObject2Test() {
        return new SimplePojoToString();
    }


    @Override
    protected List<String> fieldsDeniedForToString() {
        return List.of("primJ");
    }


    @Override
    public void testToString() {
        super.testToString();
        //check the test result
        TestResultHelper.verifyCollectorWithReset(this, TestResultHelper.WITH_ERROR);
    }
}