package com.glowanet.example.pojotesting.serialize;

/**
 * A serializable pojo, with a missing {@code #serialVersionUID}.
 * Demonstrating the testing for {@link java.io.Serializable} clazzes.
 * <p>
 * See {@code  com.glowanet.example.pojotesting.invalid.serialize.SerializePojoMissingTest}
 */
@SuppressWarnings("java:S2057")
public class SerializePojoMissing extends BaseSerializePojo {

}
