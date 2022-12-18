package com.glowanet.example.pojotesting.enums;

public enum ExtendedInvalidEnum {
    A1(91), B02(82), C30(307),
    D_0(60), E_04(45), F_50(540);

    private final Number code;

    ExtendedInvalidEnum(Number code) {
        this.code = code;
    }

    public Number getCode() {
        return code;
    }
}
