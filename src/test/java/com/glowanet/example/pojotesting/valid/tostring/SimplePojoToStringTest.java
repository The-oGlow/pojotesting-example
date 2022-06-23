package com.glowanet.example.pojotesting.valid.tostring;

import com.glowanet.example.pojotesting.tostring.SimplePojoToString;
import com.glowanet.tools.unit.entity.EntityUnitTester;

/**
 * Example, how to test a pojo the easiest way.
 * <p>
 * Testing {@code SimplePojoToString} will succeed.
 */
public class SimplePojoToStringTest extends EntityUnitTester<SimplePojoToString> {

    public SimplePojoToStringTest() {
        super(SimplePojoToString.class);
    }
}
