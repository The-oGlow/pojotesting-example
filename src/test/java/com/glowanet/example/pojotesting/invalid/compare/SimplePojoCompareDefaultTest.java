package com.glowanet.example.pojotesting.invalid.compare;

import com.glowanet.example.pojotesting.compare.SimplePojoCompareDefault;
import com.glowanet.example.pojotesting.invalid.BaseInvalidEntityUnitTester;

import java.util.Map;

import static com.glowanet.util.junit.TestResultHelper.WITH_ERROR;

/**
 * Example, to show what happens, if the {@code #compare()} checks for object equal-ness, but logical equal-ness is expected.
 */
public class SimplePojoCompareDefaultTest extends BaseInvalidEntityUnitTester<SimplePojoCompareDefault> {

    public SimplePojoCompareDefaultTest() {
        super(SimplePojoCompareDefault.class);
        setCheckLogicalEqualsOnly(true);
    }

    @Override
    protected Map<String, Number> expectedMethods() {
        return Map.of(METH_EQUALS_01, WITH_ERROR);
    }
}