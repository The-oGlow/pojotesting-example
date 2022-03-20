package com.glowanet.example.pojotesting.simple;

import com.glowanet.tools.unit.entity.AbstractEntityUnitTester;
import com.glowanet.util.junit.TestResultHelper;
import org.junit.Test;

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
        return List.of("password", "pwd");
    }

    @Override
    @Test
    public void testToString() {
        // catching the test and verify the result
        super.testToString();
        TestResultHelper.verifyCollector(this, TestResultHelper.NO_ERROR);
    }
}