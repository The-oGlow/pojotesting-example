package com.glowanet.example.pojotesting.invalid.enums;

import com.glowanet.example.pojotesting.enums.ExtendedInvalidEnum;
import com.glowanet.example.pojotesting.invalid.BaseInvalidEnumObjectUnitTester;
import com.glowanet.tools.unit.entity.enums.NameCheckTypeEnum;
import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RunWith(Parameterized.class)
public class ExtendedInvalidEnumTest extends BaseInvalidEnumObjectUnitTester<ExtendedInvalidEnum> {

    @Parameterized.Parameters(name = "{index}:{0}")
    public static Object[] data() {
        return NameCheckTypeEnum.values();
    }

    @Parameterized.Parameter
    public NameCheckTypeEnum checkTypeEnum;

    public ExtendedInvalidEnumTest() {
        super(ExtendedInvalidEnum.class);
    }

    @Before
    public void setUp() {
        setNameCheckType(checkTypeEnum);
    }

    @Override
    protected List<String> enumObjectsToIgnoreForCode() {
        return List.of();
    }

    @Override
    protected Map<String, Matcher<?>> expectedMethods() {
        String[] enumValues = Arrays.stream(NameCheckTypeEnum.values()).map(NameCheckTypeEnum::name).toArray(String[]::new);
        return prepareParameterMap("testValidateAllEnumObjects", enumValues);
    }
}