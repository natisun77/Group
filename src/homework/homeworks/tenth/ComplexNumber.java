package homework.homeworks.tenth;

public final class ComplexNumber {

    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public int hashCode() {
        return (31 + Double.hashCode(re)) * 31 + Double.hashCode(im);
    }

    @Override
    public boolean equals(Object another) {
        if (this == another) {
            return true;
        }
        if (another == null || another.getClass() != ComplexNumber.class) {
            return false;
        }
        ComplexNumber complexNumber = (ComplexNumber) another;
        if (Double.compare(re, complexNumber.getRe()) != 0 || Double.compare(im, complexNumber.getIm()) != 0) {
            return false;
        }
        return true;
    }

}
