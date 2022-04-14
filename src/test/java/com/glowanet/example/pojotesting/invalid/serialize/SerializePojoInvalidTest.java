package com.glowanet.example.pojotesting.invalid.serialize;

import com.glowanet.example.pojotesting.invalid.BaseInvalidEntityUnitTester;
import com.glowanet.example.pojotesting.serialize.SerializePojoInvalid;

import java.util.Map;

import static com.glowanet.util.junit.TestResultHelper.WITH_ERROR;

/**
 * Example, to show what happens, if a serializable class has an invalid serialVersionUID.
 */
public class SerializePojoInvalidTest extends BaseInvalidEntityUnitTester<SerializePojoInvalid> {

    public SerializePojoInvalidTest() {
        super(SerializePojoInvalid.class);
    }

    @Override
    protected Map<String, Number> expectedMethods() {
        return Map.of(METH_SERIALIZE_01, WITH_ERROR);
    }
}