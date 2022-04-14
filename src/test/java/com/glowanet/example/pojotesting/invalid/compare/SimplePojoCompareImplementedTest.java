package com.glowanet.example.pojotesting.invalid.compare;

import com.glowanet.example.pojotesting.compare.SimplePojoCompareImplemented;
import com.glowanet.example.pojotesting.invalid.BaseInvalidEntityUnitTester;

import java.util.Map;

import static com.glowanet.util.junit.TestResultHelper.WITH_ERROR;

/**
 * Example, to show what happens, if the {@code #compare()} checks for logical equal-ness, but object equal-ness is expected.
 */
public class SimplePojoCompareImplementedTest extends BaseInvalidEntityUnitTester<SimplePojoCompareImplemented> {

    public SimplePojoCompareImplementedTest() {
        super(SimplePojoCompareImplemented.class);
        setCheckLogicalEqualsOnly(false);
    }

    @Override
    protected Map<String, Number> expectedMethods() {
        return Map.of(METH_EQUALS_01, WITH_ERROR);
    }
}