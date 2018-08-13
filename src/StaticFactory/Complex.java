package StaticFactory;

public final class Complex {

    private double real = 0;
    private double imaginary = 0;

    private Complex(double newReal, double newImaginary) {
        this.real = newReal;
        this.imaginary = newImaginary;
    }

    public static Complex newComplexPolar(double newAngle, double newFactor) {
        return new Complex(newFactor * Math.cos(newAngle), newFactor * Math.sin(newAngle));
    }

    public static Complex newComplexCartesian(double newReal, double newImaginary) {
        return new Complex(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return this.real + " + " + this.imaginary + "j";
    }

    public Complex add(Complex inputComplexObject) {
        
        double newReal = this.real + inputComplexObject.real;
        double newImaginary = this.imaginary + inputComplexObject.imaginary;
        return new Complex(newReal, newImaginary);
        
    }

}