package com.glowanet.example.pojotesting;

import java.util.List;

public abstract class AbstractSimplePojo {

    public static final String       F_VAL_I         = "valI";
    public static final String       F_VAL_S         = "valS";
    public static final String       F_PRIM_I        = "primJ";
    public static final List<String> ALL_FIELDS      = List.of(F_VAL_I, F_VAL_S, F_PRIM_I);
    public static final int          ALL_FIELDS_SIZE = ALL_FIELDS.size();

    private Integer valI  = 1;
    private String  valS  = "Qwertz";
    private float   primJ = 2.3f;


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

    public boolean _equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AbstractSimplePojo that = (AbstractSimplePojo) o;

        if (Float.compare(that.getPrimJ(), getPrimJ()) != 0) return false;
        if (getValI() != null ? !getValI().equals(that.getValI()) : that.getValI() != null) return false;
        return getValS() != null ? getValS().equals(that.getValS()) : that.getValS() == null;
    }

    public int _hashCode() {
        int result = getValI() != null ? getValI().hashCode() : 0;
        result = 31 * result + (getValS() != null ? getValS().hashCode() : 0);
        result = 31 * result + (getPrimJ() != +0.0f ? Float.floatToIntBits(getPrimJ()) : 0);
        return result;
    }

    protected String _toString() {
        return "AbstractSimplePojo{" +
                "primJ=" + primJ +
                ", valI=" + valI +
                ", valS='" + valS + '\'' +
                '}';
    }
}
