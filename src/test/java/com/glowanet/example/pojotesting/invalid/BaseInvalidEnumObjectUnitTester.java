package com.glowanet.example.pojotesting.invalid;

import com.glowanet.tools.unit.enums.EnumUnitTester;
import com.glowanet.util.junit.TestResultHelper;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.equalTo;

/**
 * Base clazz to handle examples. which demonstrates a test failure.
 *
 * @param <T> the enum, which will be tests
 */
public abstract class BaseInvalidEnumObjectUnitTester<T> extends EnumUnitTester<T> {

    /** Switch, if invalid tests should fail (FALSE) or succeed (TRUE). */
    public static final boolean OVERRIDE_RESULT = true;

    @Rule
    public TestName nameWatcher = new TestName();

    protected static final int THREE_ERRORS = 3;

    protected BaseInvalidEnumObjectUnitTester(Class<T> typeOfo2T) {
        super(typeOfo2T);
    }

    protected abstract Map<String, Matcher<?>> expectedMethods();

    protected Map<String, Matcher<?>> prepareParameterMap(String methodName, String[] enumValues) {
        Map<String, Matcher<?>> map = new HashMap<>();
        int idx = 0;
        for (var anEnum : enumValues) {
            String key = String.format("%s[%s:%s]", methodName, idx, anEnum);
            map.put(key, equalTo(12));
            idx++;
        }
        return map;
    }

    @After
    public void tearDown() {
        if (OVERRIDE_RESULT) {
            Matcher<?> expected = expectedMethods().get(nameWatcher.getMethodName());
            if (expected != null) {
                TestResultHelper.verifyCollectorWithReset(this, expected);
            } else {
                throw new IllegalArgumentException(String.format("Method '%s' not defined for 'expectedMethods()", nameWatcher.getMethodName()));
            }
        }
    }
}
