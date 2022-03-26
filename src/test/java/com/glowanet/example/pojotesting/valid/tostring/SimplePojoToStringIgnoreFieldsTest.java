package com.glowanet.example.pojotesting.valid.tostring;

import com.glowanet.example.pojotesting.valid.compare.SimplePojoToStringMissing;
import com.glowanet.tools.unit.entity.AbstractEntityUnitTester;

import java.util.List;

public class SimplePojoToStringIgnoreFieldsTest extends AbstractEntityUnitTester<SimplePojoToStringMissing> {

    public SimplePojoToStringIgnoreFieldsTest() {
        super(SimplePojoToStringMissing.class);
    }

    @Override
    protected SimplePojoToStringMissing createObject2Test() {
        return new SimplePojoToStringMissing();
    }

    @Override
    protected List<String> fieldsToIgnoreForToString() {
        return SimplePojoToStringMissing.ALL_FIELDS;
    }

}