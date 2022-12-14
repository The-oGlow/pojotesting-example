package com.glowanet.example.pojotesting.invalid.tostring;

import com.glowanet.example.pojotesting.invalid.BaseInvalidEntityUnitTester;
import com.glowanet.example.pojotesting.tostring.SimplePojoToStringMissing;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.Map;

/**
 * Example, to show what happens, if {@code #toString()} is not implemented.
 */
public class SimplePojoToStringMissingTest extends BaseInvalidEntityUnitTester<SimplePojoToStringMissing> {

    public SimplePojoToStringMissingTest() {
        super(SimplePojoToStringMissing.class);
    }

    @Override
    protected Map<String, Matcher<?>> expectedMethods() {
        return Map.of(METH_TOSTRING_01, Matchers.equalTo(THREE_ERRORS));
    }
}