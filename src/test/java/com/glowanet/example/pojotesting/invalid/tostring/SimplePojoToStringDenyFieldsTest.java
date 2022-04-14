package com.glowanet.example.pojotesting.invalid.tostring;

import com.glowanet.example.pojotesting.invalid.BaseInvalidEntityUnitTester;
import com.glowanet.example.pojotesting.tostring.SimplePojoToString;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

import static com.glowanet.util.junit.TestResultHelper.WITH_ERROR;

/**
 * Example, to show what happens, if the {@code #toString()} contains a not allowed field.
 */
public class SimplePojoToStringDenyFieldsTest extends BaseInvalidEntityUnitTester<SimplePojoToString> {

    public SimplePojoToStringDenyFieldsTest() {
        super(SimplePojoToString.class);
    }

    @Override
    protected Map<String, Matcher<?>> expectedMethods() {
        return Map.of(METH_TOSTRING_01, Matchers.equalTo(WITH_ERROR));
    }

    @Override
    protected List<String> fieldsDeniedForToString() {
        return List.of(SimplePojoToString.F_PRIM_I);
    }
}
