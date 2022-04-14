package com.glowanet.example.pojotesting.invalid.simple;

import com.glowanet.example.pojotesting.invalid.BaseInvalidEnumObjectUnitTester;
import com.glowanet.example.pojotesting.simple.SimpleMissingEnum;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

import java.util.List;
import java.util.Map;

public class SimpleMissingEnumTest extends BaseInvalidEnumObjectUnitTester<SimpleMissingEnum> {

    public SimpleMissingEnumTest() {
        super(SimpleMissingEnum.class);
    }

    @Override
    protected List<String> enumObjectsToIgnoreForCode() {
        return List.of();
    }

    @Override
    protected Map<String, Matcher<?>> expectedMethods() {
        return Map.of("testValidateAllEnumObjects", Matchers.equalTo(12));
    }
}