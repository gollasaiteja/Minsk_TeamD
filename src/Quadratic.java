public class Quadratic {
	public RootStorage findQuadraticRoots(int a, int b, int c) throws WrongParameterException {
		RootStorage quadraticRoots = new RootStorage();
    	quadraticRoots.setSize(2);
    	
		double firstRoot,secondRoot;
	 	int discr;

	 	discr = (b*b)-(4*a*c);
    		if (discr>0) {
    			Double sqr= SquareRoot.find(discr);
    			firstRoot=(-b +sqr)/(2*a);
    			secondRoot=(-b - sqr)/(2*a);
    			quadraticRoots.setRoot(1,firstRoot);
    			quadraticRoots.setRoot(2,secondRoot);
    		}
    		else {
    			if (discr==0) {
    				firstRoot = secondRoot = -b/(2*a);
	    			quadraticRoots.setRoot(1,firstRoot);
	    			quadraticRoots.setRoot(2,secondRoot);
    			} else {
    				throw new WrongParameterException("The roots of this equation are imaginary!");
    			}
    		}
		return quadraticRoots;
	}
}


