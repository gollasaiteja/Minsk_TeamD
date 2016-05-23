
public class SquareRoot {
	public static double find(double d) throws WrongParameterException {
		double x;
		//The root of zero is zero!
		if(d==0) {
			return 0.0;
		} else if(d<0) {
			throw new WrongParameterException("Attampting to calculate square root of a negative number!");
		}

		//Proceeding to find out square root of the number using Newton Raphson formula.
		double squareRoot = d/2;
		do {
	    	x=squareRoot;
	    	squareRoot = (x + (d/x))/2;
		}
		while((x-squareRoot)!=0);

	    return squareRoot;
	}
}
