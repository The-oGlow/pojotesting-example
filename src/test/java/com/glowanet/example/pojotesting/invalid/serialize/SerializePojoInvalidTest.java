package com.glowanet.example.pojotesting.invalid.serialize;

import com.glowanet.example.pojotesting.invalid.BaseInvalidEntityUnitTester;
import com.glowanet.example.pojotesting.serialize.SerializePojoInvalid;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.Map;

import static com.glowanet.util.junit.TestResultHelper.WITH_ERROR;

/**
 * Example, to show what happens, if a serializable clazz has an invalid serialVersionUID.
 */
public class SerializePojoInvalidTest extends BaseInvalidEntityUnitTester<SerializePojoInvalid> {

    public SerializePojoInvalidTest() {
        super(SerializePojoInvalid.class);
    }

    @Override
    protected Map<String, Matcher<?>> expectedMethods() {
        return Map.of(METH_SERIALIZE_01, Matchers.equalTo(WITH_ERROR));
    }
}