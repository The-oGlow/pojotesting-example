package com.glowanet.example.pojotesting.valid.tostring;

import com.glowanet.example.pojotesting.tostring.SimplePojoToStringMissing;
import com.glowanet.tools.unit.entity.EntityUnitTester;

import java.util.List;

/**
 * Example, how to ignore fields from expecting to be mentioned in {@code #tostring()}.
 * <p>
 * Note:
 * In this case all fields of the pojo are ignored to have success.
 *
 * @see #fieldsToIgnoreForToString()
 */
public class SimplePojoToStringIgnoreFieldsTest extends EntityUnitTester<SimplePojoToStringMissing> {

    public SimplePojoToStringIgnoreFieldsTest() {
        super(SimplePojoToStringMissing.class);
    }

    @Override
    protected List<String> fieldsToIgnoreForToString() {
        return SimplePojoToStringMissing.ALL_FIELDS;
    }
}