package com.glowanet.example.pojotesting.valid.simple;

import com.glowanet.example.pojotesting.simple.SimpleEnum;
import com.glowanet.tools.unit.enumobj.EnumObjectUnitTester;

import java.util.List;

public class SimpleEnumTest extends EnumObjectUnitTester<SimpleEnum> {

    public SimpleEnumTest() {
        super(SimpleEnum.class);
    }

    @Override
    protected List<String> enumObjectsToIgnoreForCode() {
        return List.of();
    }
}