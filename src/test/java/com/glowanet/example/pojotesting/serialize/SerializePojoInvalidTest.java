package com.glowanet.example.pojotesting.serialize;

import com.glowanet.tools.unit.entity.AbstractEntityUnitTester;
import com.glowanet.util.junit.TestResultHelper;
import org.junit.Test;

public class SerializePojoInvalidTest extends AbstractEntityUnitTester<SerializePojoInvalid> {

    public SerializePojoInvalidTest() {
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
        TestResultHelper.verifyCollector(this, TestResultHelper.WITH_ERROR);
    }
}