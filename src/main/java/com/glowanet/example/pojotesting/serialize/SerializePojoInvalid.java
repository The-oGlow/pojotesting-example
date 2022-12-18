package com.glowanet.example.pojotesting.serialize;

/**
 * A serializable pojo, with an INVALID {@code #serialVersionUID}.
 * Demonstrating the testing for {@link java.io.Serializable} clazzes.
 * <p>
 * See {@code  com.glowanet.example.pojotesting.invalid.serialize.SerializePojoInvalidTest}
 */
public class SerializePojoInvalid extends BaseSerializePojo {

    private static final long serialVersionUID = -1;
}
