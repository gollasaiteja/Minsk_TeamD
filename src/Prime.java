//This class handles all calculations regarding Primality.
public class Prime {
	//Determines if a given positive number is prime or not:
	public boolean isPrime(int x) throws WrongParameterException {
		if(x < 0) {
			throw new WrongParameterException("Attempting to determine primality of a negative number...");
		} else if ( x == 1 ) {
			return false;
		} else if ( x == 2 ) {
			return true;
		} else if ( x%2 == 0 ) {
			return false;
		} else {
			//Main algorithm. Check if a given odd numbers is prime by checking the residue when dividing
			//by all possible odd numbers:
			for( int i=3; i <= x/2; ) {
				if(x % i == 0) {
					return false;
				}
				i += 2;
			}
		}		
		return true;
	}
}