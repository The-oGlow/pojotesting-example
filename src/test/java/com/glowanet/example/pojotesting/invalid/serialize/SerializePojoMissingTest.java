package com.glowanet.example.pojotesting.invalid.serialize;

import com.glowanet.example.pojotesting.invalid.BaseInvalidEntityUnitTester;
import com.glowanet.example.pojotesting.serialize.SerializePojoMissing;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.Map;

import static com.glowanet.util.junit.TestResultHelper.WITH_ERROR;

/**
 * Example, to show what happens, if a serializable class has no serialVersionUID.
 */
public class SerializePojoMissingTest extends BaseInvalidEntityUnitTester<SerializePojoMissing> {

    public SerializePojoMissingTest() {
        super(SerializePojoMissing.class);
    }

    @Override
    protected Map<String, Matcher<?>> expectedMethods() {
        return Map.of(METH_SERIALIZE_01, Matchers.equalTo(WITH_ERROR));
    }
}