package a3;

/**
 * This class provides a method for computing the number of iterations for which
 * z(n + 1) = z(n) * z(n) + c remains bounded where z(0) = 0 + 0i.
 *
 */
public class MandelbrotUtil {

	private MandelbrotUtil() {
		// A private constructor prevents users from creating a
		// MandelbrotUtil object.
	}

	/**
	 * Simple test method.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		Complex c = new Complex(0.0, 5.0);
		System.out.println(mandelbrotIterations(c, 100));
	}

	public static int mandelbrotIterations(Complex c, int max) {
		/**
		 * Returns the number of iterations for which z(n+1) = z(n) * z(n) + c
		 * remains bounded where z(0) = 0 + 0i. z(n+1) is bounded if its 
		 * magnitude is less than or equal to 2. Returns 1 if the magnitude of c
		 * is greater than 2. Returns max is the magnitude of z(n+1) is less 
		 * than or equal to 2 after max iterations.
		 * 
		 * If z(n+1) remains bounded after max iterations then c is assumed to be 
		 * in the Mandelbrot set.
		 * 
		 * @param c a complex number
		 * @param max the maximum number of iterations to attempt
		 * @return the number of iterations for which z(n + 1) = z(n) * z(n) + c 
		 * 	remains bounded where z(0) = 0.0 + 0.0i.
		 */
		if(max < 1) {
			throw new IllegalArgumentException("max is less than 1");
		}
		if(c.mag() > 2) {
			return 1;
		}
		int iterationCount = 0;
		Complex z = new Complex(0, 0);
		for(int i = 0; i < max; i++) {
			z = z.multiply(z);
			z = z.add(c);
			iterationCount++;
			if(z.mag() > 2) {
				return iterationCount;
			}
		}
		return max;
	}
}
