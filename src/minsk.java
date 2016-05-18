import java.util.Scanner;

public class minsk {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while (true) {
			System.out.println("1:Find quadratic roots 2:Cubic roots 3:Prime 4:exit");
			int choice = in.nextInt();
			if (choice == 4) {
				System.exit(0);
			} else if (choice == 1) {
				System.out.println("Enter values for quadratic equation");
				System.out.print("value of a: ");
				int a = in.nextInt();
				System.out.print("value of b: ");
				int b = in.nextInt();
				System.out.print("value of c: ");
				int c = in.nextInt();
				if (a == 0) {
					System.out.println("Not a quadratic equation");
				} else {
					int x = a + b + c;
					if (x != 0 && x != 1) {
						Prime m = new Prime();
						boolean isPrime = m.findPrime(x);
						if (isPrime) {
							Quadratic quadratic = new Quadratic();
							QuadraticRoots quadraticRoots = quadratic.findQuadraticRoots(a, b, c);
							System.out.println("The Quadratic Roots are : ");
							System.out.println("Root 1 : " + quadraticRoots.getFirstRoot());
							System.out.println("Root 2 : " + quadraticRoots.getSecondRoot());
						} else {
							System.out.println("Not a Prime Number");
						}
					} else {
						System.out.println(" Neither Prime nor Composite ");
					}
				}
			} else if (choice == 2) {

			} else if (choice == 3) {
				System.out.println("Enter a number");
				int number = in.nextInt();
				Prime primeObj = new Prime();
				System.out.println(primeObj.findPrime(number));
			}
		}
	}
}
