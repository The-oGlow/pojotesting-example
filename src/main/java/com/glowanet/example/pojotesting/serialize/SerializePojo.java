package com.glowanet.example.pojotesting.serialize;

/**
 * A serializable pojo, with correct {@code #serialVersionUID}.
 * Demonstrating the testing for {@link java.io.Serializable} clazzes.
 * <p>
 * See {@code com.glowanet.example.pojotesting.valid.serialize.SerializePojoTest}
 */
public class SerializePojo extends BaseSerializePojo {

    private static final long serialVersionUID = -1234567890;
}
