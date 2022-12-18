package com.glowanet.example.pojotesting.tostring;

/**
 * A pojo, where {@code #toString()} is implemented correctly.
 * Demonstrating the testing for {@code #toString()} in clazzes.
 * <p>
 * See {@code com.glowanet.example.pojotesting.valid.tostring.SimplePojoToStringTest}
 */
public class SimplePojoToString extends BaseToStringPojo {
    @Override
    public String toString() {
        return super._toString();
    }
}
