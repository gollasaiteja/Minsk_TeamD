
	public class CubicEquation { 
		double r;

		public void FindCube(double a, double b, double c, double d, int val) {
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
				
				func = (a * (approx * approx * approx) + b * (approx * approx) + c * approx + d);
				diffFunc = (3 * a * (approx * approx) + 2 * b * approx + c);
				value = approx - func / diffFunc;
				D = value - approx;
				
				while (i < 1000000000 && absolute(D) > 0.000001) {
					i = i + 1;
					func = (a * (approx * approx * approx) + b * (approx * approx) + c * approx + d);
					diffFunc = (3 * a * (approx * approx) + 2 * b * approx + c);
					value = approx - func / diffFunc;
					D = value - approx;
					approx = value;
				} 

				
				if (val != 1){
					
					R = -(a1 + value) / 2;
					DD = (-3 * (value * value) - 2 * a1 * value + a1 * a1 - 4 * b1);
					
					if(DD>0){
					
						DD=absolute(DD);
						if (val == 2) {
							r = R - Math.sqrt(DD)/2;
							System.out.println("Root 2 is:" + r);
						} else {
							 r = R + Math.sqrt(DD)/2; 
							System.out.println("Root 3 is:" + r);
						}
					}
					else
					{
						System.out.println("Imaginary Roots");
					}
				} else
				{
					r = value;
					System.out.println("Root 1 is:" + r);
				}
				
			
		}
		
		public double absolute(double D)
		{
			if(D > 0)
				return D;
			else
				return D * (-1);
		}

		public static void main(String args[]) {
			
			CubicEquation c = new CubicEquation();
			
			c.FindCube(2, -4,-22, 24, 1);
			c.FindCube(2, -4,-22, 24, 2);
			c.FindCube(2, -4,-22, 24, 3);
			
		}
	}
