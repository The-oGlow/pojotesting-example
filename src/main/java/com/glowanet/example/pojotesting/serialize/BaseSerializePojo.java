package com.glowanet.example.pojotesting.serialize;

import com.glowanet.example.pojotesting.BaseSimplePojo;

import java.io.Serializable;

/**
 * A simple pojo used as common base class for serializable tests only.
 */
public abstract class BaseSerializePojo extends BaseSimplePojo implements Serializable {

    @Override
    public String toString() {
        return super._toString();
    }
}
