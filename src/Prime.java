public class Prime {
	

	
	
	public boolean findPrime(int x)
	{
		if(x<0)
			x=-x;
	 
		for( int i=2; i<= x/2; i++ )
		{
			if(x % i == 0)
			{
				return false;
			}
		}
			return true;
	}

}