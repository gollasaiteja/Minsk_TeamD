import java.util.Scanner;
public class Quadratic {
		public QuadraticRoots findQuadraticRoots(int a, int b, int c) {
			QuadraticRoots quadraticRoots = null;
		 	double firstRoot,secondRoot;
		 	int discr,total,abs_a,abs_b,abs_c;
		 	abs_a=(a<0)?-a:a;
		 	abs_b=(b<0)?-b:b;
		 	abs_c=(c<0)?-c:c;
	    	quadraticRoots = new QuadraticRoots();
	    	if (a==0){
	    		quadraticRoots.setQuadratic(false);
	    	}
	    	else
	    	{
	    		discr = (b*b)-(4*a*c);
	    		if (discr>0){
	    			Double sqr=findSquareRoot.SquareRoot(discr);
	    			firstRoot=(-b +sqr)/(2*a);
	    			secondRoot=(-b - sqr)/(2*a);
	    			quadraticRoots.setFirstRoot(firstRoot);
	    			quadraticRoots.setSecondRoot(secondRoot);
	    		}
	    		else
	    		{
	    			if (discr==0)
	    			{
	    				firstRoot = secondRoot = -b/(2*a);
		    			quadraticRoots.setFirstRoot(firstRoot);
		    			quadraticRoots.setSecondRoot(secondRoot);
	    			}
	    			else
	    			{
	    				quadraticRoots.setImaginary(true);
	    			}
	    		}
	    	}
			return quadraticRoots;
		}
	   }


