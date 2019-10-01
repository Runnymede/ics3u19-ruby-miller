package miller.unit1;

import java.util.Scanner;

/**Quadratic.java
 * This program uses the quadratic equation to find the value of x
 * September 30, 2019
 * @author Ruby Miller
 */

public class Quadratic {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter the value of a");
		Double a = sc.nextDouble();
		System.out.println("Please enter the value of b");
		Double b = sc.nextDouble();
		System.out.println("Please enter the value of c");
		Double c = sc.nextDouble();
		
		Double x1 = (-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		Double x2 = (-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
		
		System.out.println("The values of x are " + x1 + " and " + x2);
		
	}

}
