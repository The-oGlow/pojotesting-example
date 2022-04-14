package com.glowanet.example.pojotesting.valid.compare;

import com.glowanet.example.pojotesting.compare.SimplePojoCompareImplemented;
import com.glowanet.tools.unit.entity.EntityUnitTester;

/**
 * Example, to verify if your own compare implementation works as expected.
 * Note:
 * In this case, it is expected, that two instance have the identically content, but
 * are not the same ("logical equals")
 *
 * @see #setCheckLogicalEqualsOnly(boolean)
 */
public class SimplePojoCompareImplementedTest extends EntityUnitTester<SimplePojoCompareImplemented> {

    public SimplePojoCompareImplementedTest() {
        super(SimplePojoCompareImplemented.class);
        setCheckLogicalEqualsOnly(true);
    }
}