package com.glowanet.example.pojotesting.valid.tostring;

import com.glowanet.example.pojotesting.valid.compare.SimplePojoToString;
import com.glowanet.tools.unit.entity.AbstractEntityUnitTester;

import java.util.List;

public class SimplePojoToStringDenyFieldsTest extends AbstractEntityUnitTester<SimplePojoToString> {

    public SimplePojoToStringDenyFieldsTest() {
        super(SimplePojoToString.class);
    }

    @Override
    protected SimplePojoToString createObject2Test() {
        return new SimplePojoToString();
    }


    @Override
    protected List<String> fieldsDeniedForToString() {
        return List.of("password", "pwd");
    }

}