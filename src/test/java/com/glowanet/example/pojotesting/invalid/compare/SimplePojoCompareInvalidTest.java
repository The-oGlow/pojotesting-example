package com.glowanet.example.pojotesting.invalid.compare;

import com.glowanet.example.pojotesting.compare.SimplePojoCompareInvalid;
import com.glowanet.example.pojotesting.invalid.BaseInvalidEntityUnitTester;

import java.util.Map;

import static com.glowanet.util.junit.TestResultHelper.WITH_ERROR;

/**
 * Example, to show what happens, if the {@code #compare()} is not working correct.
 */
public class SimplePojoCompareInvalidTest extends BaseInvalidEntityUnitTester<SimplePojoCompareInvalid> {

    public SimplePojoCompareInvalidTest() {
        super(SimplePojoCompareInvalid.class);
    }

    @Override
    protected Map<String, Number> expectedMethods() {
        return Map.of(METH_EQUALS_02, WITH_ERROR);
    }
}