package com.glowanet.example.pojotesting.enums;

public enum ExtendedEnum {
    A1(1), B02(2), C30(30),
    D_0(0), E_04(4), F_50(50);

    private final Number code;

    ExtendedEnum(Number code) {
        this.code = code;
    }

    public Number getCode() {
        return code;
    }
}
