
public class findSquareRoot {
	public static double SquareRoot(double d)
	{
	 double x;
		boolean isPositiveNumber = true;
	 

		//when b*b-4ac=0
		if(d==0)
		{
	    	System.out.println("Square root of "+d+" = "+0);
		}

	  //when b*b-4ac<0
		else if(d<0)
		{  
	    	d=-d;
	    	isPositiveNumber = false;
		}

		//Proceeding to find out square root of the number
		double squareRoot = d/2;
	    
		do
		{
	    	x=squareRoot;
	    	squareRoot = (x + (d/x))/2;
	    	//System.out.println(squareRoot);
		}
		while((x-squareRoot)!=0);

		//Displays square root in the case of a positive number
		if(isPositiveNumber)
		{
	   	 //System.out.println("Square roots of "+d+" are ");
	    	return squareRoot;
	    	//System.out.println("+"+squareRoot);
	    	//System.out.println("-"+squareRoot);
		}
		//Displays square root in the case of a -ve number
		else
		{
	   	 //System.out.println("Square roots of -"+d+" are ");
	   	 //System.out.println("+"+squareRoot+" i");
	   	 //System.out.println("-"+squareRoot+" i");
	    
	  }
	    return squareRoot;
	}
}
