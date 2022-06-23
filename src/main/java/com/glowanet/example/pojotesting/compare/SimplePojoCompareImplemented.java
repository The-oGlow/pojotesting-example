package com.glowanet.example.pojotesting.compare;

/**
 * A pojo, where {@code #hashcode()}, {@code #equals(Object)}  are implemented correctly.
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
