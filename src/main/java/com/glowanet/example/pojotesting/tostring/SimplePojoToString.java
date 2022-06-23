package com.glowanet.example.pojotesting.tostring;

/**
 * A pojo, where {@code #toString()} is implemented correctly.
 */
public class SimplePojoToString extends BaseToStringPojo {
    @Override
    public String toString() {
        return super._toString();
    }
}
