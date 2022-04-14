package com.glowanet.example.pojotesting.invalid;

import com.glowanet.tools.unit.enumobj.EnumObjectUnitTester;
import com.glowanet.util.junit.TestResultHelper;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;

import java.util.Map;

/**
 * Base class to handle examples. which demonstrates a test failure.
 *
 * @param <T> the pojo, which will be tests
 */
public abstract class BaseInvalidEnumObjectUnitTester<T> extends EnumObjectUnitTester<T> {

    /** Switch, if invalid tests should fail (FALSE) or succeed (TRUE). */
    public static final boolean OVERRIDE_RESULT = true;

    @Rule
    public TestName nameWatcher = new TestName();

    protected static final int THREE_ERRORS = 3;

    protected BaseInvalidEnumObjectUnitTester(Class<T> typeOfo2T) {
        super(typeOfo2T);
    }

    protected abstract Map<String, Matcher<?>> expectedMethods();

    @After
    public void tearDown() {
        if (OVERRIDE_RESULT) {
            Matcher<?> expected = expectedMethods().get(nameWatcher.getMethodName());
            if (expected != null) {
                TestResultHelper.verifyCollectorWithReset(this, expected);
            }
        }
    }
}
