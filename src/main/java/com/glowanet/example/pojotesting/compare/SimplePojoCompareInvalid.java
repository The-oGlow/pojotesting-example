package com.glowanet.example.pojotesting.compare;

/**
 * A pojo, where {@code #hashcode()}, {@code #equals(Object)} are implemented INCORRECT.
 * Demonstrating the testing for {@code #hashcode()} and {@code #equals(Object)} in clazzes.
 * <p>
 * See {@code com.glowanet.example.pojotesting.invalid.compare.SimplePojoCompareInvalidTest}
 */
public class SimplePojoCompareInvalid extends BaseComparePojo {

    @Override
    public boolean equals(Object obj) {
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
