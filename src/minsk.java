import java.util.Scanner;

public class minsk {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("\n************ WELCOME TO MINSK - TEAM D ***************");
			System.out.println("Please select one of the following options:");
			System.out.println("1) Solve quadratic equations");
			System.out.println("2) Solve cubic polynomials");
			System.out.println("3) Primilaty test");
			System.out.println("4) Exit MINSK\n\n");
			int choice = in.nextInt();
			if (choice == 4) {
				in.close();
				System.exit(0);
			} else if (choice == 1) {
				System.out.println("Enter values for quadratic equation");
				System.out.print("value of a: ");
				int a = in.nextInt();
				int absA = a < 0 ? -a : a;				
				System.out.print("value of b: ");
				int b = in.nextInt();
				int absB = b < 0 ? -b : b;
				System.out.print("value of c: ");
				int c = in.nextInt();
				int absC = c < 0 ? -c : c;
				if (a == 0) {
					System.out.println("Not a quadratic equation (a must be DIFFERENT from 0)");
				} else {
					int x = absA + absB + absC;
					Prime m = new Prime();
					try {
						boolean resp = m.isPrime(x);
						if (resp) {
							Quadratic quadratic = new Quadratic();
							RootStorage quadraticRoots = quadratic.findQuadraticRoots(a, b, c);
							System.out.println("The Quadratic Roots are : ");
							System.out.println("Root 1 : " + quadraticRoots.getRoot(1));
							System.out.println("Root 2 : " + quadraticRoots.getRoot(2));							
						} else {
							System.out.println("Not a good quadratic equation: |a|+|b|+|c| must be prime!");
						}
					}
					catch (WrongParameterException e) {
						System.out.println("Not a good quadratic equation: |a|+|b|+|c| must be prime!!");
					}
				}
			} else if (choice == 2) {
				System.out.println("Enter values for the cubic equation");
				System.out.print("value of a: ");
				int a = in.nextInt();
				int absA = a < 0 ? -a : a;				
				System.out.print("value of b: ");
				int b = in.nextInt();
				int absB = b < 0 ? -b : b;
				System.out.print("value of c: ");
				int c = in.nextInt();
				int absC = c < 0 ? -c : c;
				System.out.print("value of d: ");
				int d = in.nextInt();
				int absD = d < 0 ? -d : d;
				if (a == 0) {
					System.out.println("Not a good cubic equation (a must be DIFFERENT from 0)");
				} else {
					int x = absA + absB + absC + absD;
					if (x%2 == 0 ) {
						System.out.println("Not a good cubic equation! For some odd requirement,|a|+|b|+|c|+|d| must be an odd, composite number");
					} else {
						Prime m = new Prime();
						try {
							boolean resp = m.isPrime(x);
							if (!resp) { 
								CubicEquation cubic = new CubicEquation();
								try {
									RootStorage cubicRoots = cubic.findCube(a, b, c, d);
									System.out.println("The Cubic Roots are : ");
									System.out.println("Root 1 : " + cubicRoots.getRoot(1));
									System.out.println("Root 2 : " + cubicRoots.getRoot(2));
									System.out.println("Root 3 : " + cubicRoots.getRoot(3));
								} 
								catch (WrongParameterException e) {
							    	  System.out.format("Your cubic equation has some imaginary roots!\n");
								 }
							} else {
								System.out.println("Not a good cubic equation! For some odd requirement,|a|+|b|+|c|+|d| must be an odd, composite number");
							}
						}
						catch (WrongParameterException e) {
							System.out.println("Not a good cubic equation! For some odd requirement,|a|+|b|+|c|+|d| must be an odd, composite number");
						}
					}
				}
			} else if (choice == 3) {				
				while(true) {
					System.out.println("Enter a number: ");
					int number = in.nextInt();
					Prime primeObj = new Prime();
					 try {
					      if (primeObj.isPrime(number)) {
					    	  System.out.format("The number %d is PRIME! \n",number);
					      } else {
					    	  System.out.format("The number %d is NOT a PRIME! \n",number);
					      }	
					      break;
					 }
					 catch (WrongParameterException e) {
				    	  System.out.format("Your input must be a positive number, please try again.\n");
					 }
				}
			}
		}
	}
}
