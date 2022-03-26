package com.glowanet.example.pojotesting.invalid.serialize;

import com.glowanet.example.pojotesting.valid.serialize.SerializePojoInvalid;
import com.glowanet.tools.unit.entity.AbstractEntityUnitTester;
import com.glowanet.util.junit.TestResultHelper;
import org.junit.Test;

public class SerializePojoTest extends AbstractEntityUnitTester<SerializePojoInvalid> {

    public SerializePojoTest() {
        super(SerializePojoInvalid.class);
    }

    @Override
    protected SerializePojoInvalid createObject2Test() {
        return new SerializePojoInvalid();
    }

    @Override
    @Test
    public void testSerialVersionUIDIsCorrectInEntity() {
        super.testSerialVersionUIDIsCorrectInEntity();
        // this test must fail with an error
        TestResultHelper.verifyCollectorWithReset(this, TestResultHelper.WITH_ERROR);
    }
}