package com.glowanet.example.pojotesting.invalid.simple;

import com.glowanet.example.pojotesting.invalid.BaseInvalidEntityUnitTester;
import com.glowanet.example.pojotesting.simple.SimpleMissingPojo;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.Map;

public class SimpleMissingPojoTest extends BaseInvalidEntityUnitTester<SimpleMissingPojo> {

    public SimpleMissingPojoTest() {
        super(SimpleMissingPojo.class);
    }

    @Override
    protected Map<String, Matcher<?>> expectedMethods() {
        return Map.of(METH_TOSTRING_01, Matchers.equalTo(THREE_ERRORS));
    }
}