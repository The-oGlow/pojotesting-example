package com.glowanet.example.pojotesting.serialize;

import com.glowanet.tools.unit.entity.AbstractEntityUnitTester;

public class SerializePojoTest extends AbstractEntityUnitTester<SerializePojo> {

    public SerializePojoTest() {
        super(SerializePojo.class);
    }

    @Override
    protected SerializePojo createObject2Test() {
        return new SerializePojo();
    }
}