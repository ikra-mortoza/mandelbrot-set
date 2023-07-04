package a3;

public final class Complex {
	/**
	 * A class that represents complex numbers. In the 
	 * complex number (a + bi) the real value a is called
	 * the real part of the complex number and the real 
	 * value b is called the imaginary part of the complex
	 * number. This class provides methods to perform 
	 * addition and multiplication of complex numbers.
	 */
	
	private double real;
	private double imaginary;

	public Complex() {
		/**
		  * Initializes this complex number to (0 + 0i).
		  */
		this.real = 0;
		this.imaginary = 0;
	}
	
	public Complex(double re, double im) {
		/**
		  * Initializes this complex number so that it has the 
		  * given real and imaginary components.
		  * 
		  * @param re the real part of the complex number
		  * @param im the imaginary part of the complex number
		  */
		this.real = re;
		this.imaginary = im;
	}
	
	public Complex(Complex other) {
		/**
		  * Initializes this complex number so that it has the 
		  * same real and imaginary parts as another complex number.
		  * 
		  * @param other the complex number to copy 
		  */
		this.real = other.re();
		this.imaginary = other.im();
	}
	
	public Complex add(Complex c) {
		return new Complex(this.re() + c.re(), this.im() + c.im());
	}
	
	public Complex multiply(Complex c) {
		/**
		  * Multiplies this complex number with another complex
		  * number to obtain a new complex number. Neither this complex
		  * number nor c is changed by this method.
		  * 
		  * This is not an industrial strength implementation of complex
		  * number multiplication. In particular, issues related to the 
		  * differences between -0.0 and 0.0 and infinite real or imaginary
		  * parts are not taken into account.
		  * 
		  * @param c the complex number to multiply by 
		  * @return a new complex number equal to this complex number multiplied by c
		  */

		return new Complex((this.re() * c.re() - this.im() * c.im()), this.im() * c.re() + this.re() * c.im());
	}
	

	public double im() {
		return this.imaginary;
	}
	
	public void im(double val) {
		this.imaginary = val;
	}
	
	public static Complex real(double re) {
		return new Complex(re, 0);
	}
	
	public static Complex imag(double im) {
		return new Complex(0, im);
	}
	
	public double mag() {
		return Math.hypot(this.re(), this.im());
	}
	
	public double re() {
		return this.real;
	}
	
	public void re(double val) {
		this.real = val;
	}
	
	public String toString() {
		if(this.im() < 0) {
			return this.re() + " - " + Math.abs(this.im()) + "i";
		}
		else {
			return this.re() + " + " + Math.abs(this.im()) + "i";
		}
	}
	
}
