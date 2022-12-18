package com.glowanet.example.pojotesting.firstexample;

/**
 * A simple pojo including a test clazz and reach:
 * <ul>
 *     <li>100% method coverage</li>
 *     <li>92% line coverage</li>
 * </ul>
 * Now compare to {@link PojoUntested}.
 * <p>
 * See {@code com.glowanet.example.pojotesting.firstexample.PojoTestedTest}
 */
public class PojoTested {

    public static final int INT31 = 31;

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
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        PojoTested that = (PojoTested) obj;

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
    @Override
    public int hashCode() {
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
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "primJ=" + primJ +
                ", valI=" + valI +
                ", valS='" + valS + '\'' +
                '}';
    }
}
