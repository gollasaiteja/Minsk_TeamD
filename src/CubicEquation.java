
	public class CubicEquation { 
		double r;

		//Finds the roots of a cubic equation using Newton's Raphson approximation method
		public RootStorage findCube(double a, double b, double c, double d) throws WrongParameterException {
			RootStorage cubicRoots = new RootStorage();
	    	cubicRoots.setSize(3);
				
	    		//We always make X0 = 1 
	    		double approx = 1;
	    		
				int i = 0;
				double func;
				double diffFunc;
				double D;
				double value;
				double a1=b/a;
				double b1=c/a;
				double R;
				double DD;
				
				func = a * (approx * approx * approx) + b * (approx * approx) + c * approx + d;
				diffFunc = 3 * a * (approx * approx) + 2 * b * approx + c;
				value = approx - func / diffFunc;
				D = value - approx;
				
				//Main recursive loop. When done, value is the first found root:
				while (i < 1000000000 && absolute(D) > 0.000001) {
					i = i + 1;
					func = a * (approx * approx * approx) + b * (approx * approx) + c * approx + d;
					diffFunc = 3 * a * (approx * approx) + 2 * b * approx + c;
					value = approx - func / diffFunc;
					D = value - approx;
					approx = value;
				} 

				//Store the first root:
				cubicRoots.setRoot(1, value);
				
				//Use the first root to find the other two roots:
				R = -(a1 + value) / 2;
				DD = -3 * (value * value) - 2 * a1 * value + a1 * a1 - 4 * b1;
				
				if(DD>0) {
					DD=absolute(DD);
					//Second and third roots are always complementary:
//					r = R - Math.sqrt(DD)/2;
					r = R - SquareRoot.find(DD)/2;
					cubicRoots.setRoot(2, r);
//					r = R + Math.sqrt(DD)/2; 
					r = R + SquareRoot.find(DD)/2; 
					cubicRoots.setRoot(3, r);
				} else {
					throw new WrongParameterException("This polynomial has imaginary roots!");
				}	
				
				return cubicRoots;
		}
		
		public double absolute(double D) {
			if(D > 0)
				return D;
			else
				return D * (-1);
		}
	}
