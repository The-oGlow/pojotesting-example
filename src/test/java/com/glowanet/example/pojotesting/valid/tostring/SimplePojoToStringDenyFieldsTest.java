package com.glowanet.example.pojotesting.valid.tostring;

import com.glowanet.example.pojotesting.tostring.SimplePojoToString;
import com.glowanet.tools.unit.entity.EntityUnitTester;

import java.util.List;

/**
 * Example, how to ensure that fields are NOT mentioned in {@code #tostring()}.
 * E.g., the password-field.
 *
 * @see #fieldsToIgnoreForToString()
 */
public class SimplePojoToStringDenyFieldsTest extends EntityUnitTester<SimplePojoToString> {

    public SimplePojoToStringDenyFieldsTest() {
        super(SimplePojoToString.class);
    }

    @Override
    protected List<String> fieldsDeniedForToString() {
        return List.of("password", "pwd");
    }
}