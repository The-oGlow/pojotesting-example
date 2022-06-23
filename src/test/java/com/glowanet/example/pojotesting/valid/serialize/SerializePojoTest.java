package com.glowanet.example.pojotesting.valid.serialize;

import com.glowanet.example.pojotesting.serialize.SerializePojo;
import com.glowanet.tools.unit.entity.EntityUnitTester;

/**
 * Example, how to verify, that {@code java.io.Serializable} is implemented correctly.
 */
public class SerializePojoTest extends EntityUnitTester<SerializePojo> {

    public SerializePojoTest() {
        super(SerializePojo.class);
    }

}