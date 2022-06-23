package com.glowanet.example.pojotesting.invalid.compare;

import com.glowanet.example.pojotesting.compare.SimplePojoCompareInvalid;
import com.glowanet.example.pojotesting.invalid.BaseInvalidEntityUnitTester;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

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
    protected Map<String, Matcher<?>> expectedMethods() {
        return Map.of(METH_EQUALS_02, Matchers.equalTo(WITH_ERROR));
    }
}