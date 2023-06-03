package com.glowanet.example.pojotesting.valid.enums;

import com.glowanet.example.pojotesting.enums.ExtendedEnum;
import com.glowanet.tools.unit.entity.enums.EnumUnitTester;

import java.util.List;

public class ExtendedEnumTest extends EnumUnitTester<ExtendedEnum> {

    public ExtendedEnumTest() {
        super(ExtendedEnum.class);
    }

    @Override
    protected List<String> enumObjectsToIgnoreForCode() {
        return List.of();
    }
}