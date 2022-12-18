package com.glowanet.example.pojotesting.invalid;

import com.glowanet.tools.unit.entity.EntityUnitTester;
import com.glowanet.util.junit.TestResultHelper;
import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Rule;
import org.junit.rules.TestName;

import java.util.Map;

/**
 * Base clazz to handle examples. which demonstrates a test failure.
 *
 * @param <T> the pojo, which will be tests
 */
public abstract class BaseInvalidEntityUnitTester<T> extends EntityUnitTester<T> {

    /** Switch, if invalid tests should fail (FALSE) or succeed (TRUE). */
    public static final boolean OVERRIDE_RESULT   = true;
    public static final String  METH_TOSTRING_01  = "testToString";
    public static final String  METH_SERIALIZE_01 = "testSerialVersionUIDIsCorrectInEntity";
    public static final String  METH_EQUALS_01    = "testEqualsLogicalAreTheSame";
    public static final String  METH_EQUALS_02    = "testEqualsWithItself";

    @Rule
    public TestName nameWatcher = new TestName();

    protected static final int THREE_ERRORS = 3;

    protected BaseInvalidEntityUnitTester(Class<T> typeOfo2T) {
        super(typeOfo2T);
    }

    /**
     * Define a map with methods which have to be checked with a different matcher.
     *
     * @return map of methods with their expected result.
     */
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
