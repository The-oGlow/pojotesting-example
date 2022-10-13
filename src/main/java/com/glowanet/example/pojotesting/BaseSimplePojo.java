package com.glowanet.example.pojotesting;

import java.util.List;

/**
 * A simple pojo used as common base class for all tests.
 */
public abstract class BaseSimplePojo {

    public static final String       F_VAL_I         = "valI";
    public static final String       F_VAL_S         = "valS";
    public static final String       F_PRIM_I        = "primJ";
    public static final List<String> ALL_FIELDS      = List.of(F_VAL_I, F_VAL_S, F_PRIM_I);
    public static final int          ALL_FIELDS_SIZE = ALL_FIELDS.size();
    public static final int          INT31           = 31;

    private Integer valI  = 1;
    private String  valS  = "Qwertz";
    private float   primJ = 2.3F; //NOSONAR java:S109

    public Integer getValI() {
        return valI;
    }

    public void setValI(Integer valI) {
        this.valI = valI;
    }

    public String getValS() {
        return valS;
    }

    public void setValS(String valS) {
        this.valS = valS;
    }

    public float getPrimJ() {
        return primJ;
    }

    public void setPrimJ(float primJ) {
        this.primJ = primJ;
    }

    /**
     * Underscored default implementation.
     *
     * @param obj the reference object with which to compare.
     *
     * @return {@code true} if this object is the same as the obj
     * argument; {@code false} otherwise.
     */
    public boolean _equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        BaseSimplePojo that = (BaseSimplePojo) obj;

        if (Float.compare(that.getPrimJ(), getPrimJ()) != 0) {
            return false;
        }
        if (getValI() != null ? !getValI().equals(that.getValI()) : (that.getValI() != null)) {
            return false;
        }
        return getValS() != null ? getValS().equals(that.getValS()) : (that.getValS() == null);
    }

    /**
     * Underscored default implementation.
     *
     * @return a hash code value for this object.
     */
    public int _hashCode() {
        int result = getValI() != null ? getValI().hashCode() : 0;
        result = INT31 * result + (getValS() != null ? getValS().hashCode() : 0);
        result = INT31 * result + (getPrimJ() != 0.0F ? Float.floatToIntBits(getPrimJ()) : 0); //NOSONAR java:S1244
        return result;
    }

    /**
     * Underscored default implementation.
     *
     * @return a string representation of the object.
     */
    protected String _toString() {
        return this.getClass().getSimpleName() + "{" +
                "primJ=" + primJ +
                ", valI=" + valI +
                ", valS='" + valS + '\'' +
                '}';
    }
}
