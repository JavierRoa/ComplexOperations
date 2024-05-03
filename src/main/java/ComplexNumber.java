public class ComplexNumber {
    private double real;
    private double imaginary;

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }
    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(ComplexNumber complexNumber) {
        subtract(complexNumber.getReal(), complexNumber.getImaginary());
    }
    // Constructor
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    // Getters.
    public double getReal() {
        return real;
    }
    public double getImaginary() {
        return imaginary;
    }

}
