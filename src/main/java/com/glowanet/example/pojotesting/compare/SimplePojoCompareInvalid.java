package com.glowanet.example.pojotesting.compare;

/**
 * A pojo, where {@code #hashcode()}, {@code #equals(Object)} are implemented INCORRECT.
 */
public class SimplePojoCompareInvalid extends BaseComparePojo {

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
