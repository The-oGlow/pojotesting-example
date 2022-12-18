package com.glowanet.example.pojotesting.compare;

/**
 * A pojo, where {@code #hashcode()}, {@code #equals(Object)}  are implemented correctly.
 * Demonstrating the testing for {@code #hashcode()} and {@code #equals(Object)} in clazzes.
 * <p>
 * See {@code com.glowanet.example.pojotesting.valid.compare.SimplePojoCompareImplementedTest}
 */
public class SimplePojoCompareImplemented extends BaseComparePojo {
    @Override
    public int hashCode() {
        return super._hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super._equals(obj);
    }
}
