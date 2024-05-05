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
    public boolean equals(Object anObject) {
        if (this == anObject) {
            return true;
        }
        if (anObject == null) {
            return false;
        }
        if (anObject instanceof ComplexNumber) {
            ComplexNumber other = (ComplexNumber) anObject;
            if (Math.abs(this.getRe() - other.getRe()) <= 0.000001 && Math.abs((this.getIm() - other.getIm())) <= 0.000001) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode()
    {
        final int prime = 31;
        int result = 1;
        result = (prime * result + Double.hashCode(re));
        result = (prime * result + Double.hashCode(im));
        return result;
    }

}