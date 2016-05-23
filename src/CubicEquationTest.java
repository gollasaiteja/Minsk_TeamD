import static org.junit.Assert.*;

import org.junit.Test;


public class CubicEquationTest {

	@Test
	public void test() {
		CubicEquation cubic = new CubicEquation();
		try {
			RootStorage cubicRoots = cubic.findCube(1, -6, 11, -6);
			System.out.println("The Cubic Roots are : ");
			System.out.println("Root 1 : " + cubicRoots.getRoot(1));
			System.out.println("Root 2 : " + cubicRoots.getRoot(2));
			System.out.println("Root 3 : " + cubicRoots.getRoot(3));
			
			cubicRoots = cubic.findCube(1, -3, -3, -1);
			System.out.println("The Cubic Roots are : ");
			System.out.println("Root 1 : " + cubicRoots.getRoot(1));
			System.out.println("Root 2 : " + cubicRoots.getRoot(2));
			System.out.println("Root 3 : " + cubicRoots.getRoot(3));

			cubicRoots = cubic.findCube(1, -3, -3, -1);
			System.out.println("The Cubic Roots are : ");
			System.out.println("Root 1 : " + cubicRoots.getRoot(1));
			System.out.println("Root 2 : " + cubicRoots.getRoot(2));
			System.out.println("Root 3 : " + cubicRoots.getRoot(3));
		} 
		catch (WrongParameterException e) {
	    	  System.out.format("Your cubic equations has some imaginary roots!\n");
		}
	}
}
