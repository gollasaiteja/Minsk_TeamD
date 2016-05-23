/**
 * This type of exception is thrown every time one of our calculation function is given a 
 * wrong parameter as input. Examples of wrong parameters:
 * Calling isPrime(x) when x is negative.
 * Calling squareRoot(x) when x is negative. 
 * Attempting to solve equations that have imaginary roots. 
 */
class WrongParameterException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public WrongParameterException(String message) {
		super(message);
	}
}