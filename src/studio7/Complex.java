package studio7;

public class Complex {

	private double real;
	private double imaginary;
	
	public Complex(double initReal, double initImaginary) {
		real = initReal;
		imaginary = initImaginary;
	}
	
	public double getReal() {
		return real;
	}
	
	public double getImaginary() {
		return imaginary;
	}
	
	public Complex add(Complex number1, Complex number2)
	{
		double newReal = number1.getReal() + number2.getReal();
		double newImaginary = number1.getImaginary() + number2.getImaginary();
		return new Complex(newReal,newImaginary);
	}
	
	public Complex multiply(Complex number1, Complex number2)
	{
		double newReal = number1.getReal()*number2.getReal()-number1.getImaginary()*number2.getImaginary();
		double newImaginary = number1.getReal()*number2.getImaginary() + number1.getImaginary()*number2.getReal();
		return new Complex(newReal,newImaginary);
	}
	
	public String toString()
	{
		return real + " + " + imaginary + "i";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex number1 = new Complex(1,2);
		Complex number2 = new Complex(3,5);
		System.out.println(number1);
		System.out.println(number1.add(number1,number2));
		System.out.println(number1.multiply(number1,number2));
	}

}
