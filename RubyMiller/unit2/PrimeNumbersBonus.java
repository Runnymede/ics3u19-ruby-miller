package miller.unit2;

import java.util.Scanner;

/**PrimeNumbersbonus.java <p>
 * This program calculates and outputs is the inputed number is a prime number (is only divisible by 1 and itself <p>
 * November 4, 2019
 * @author Ruby Miller
 */

public class PrimeNumbersBonus {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {
		

		// Declaring variables, getting input (n) from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive integer.");
		int n1 = sc.nextInt(); // Acts as the counter
		System.out.println("Please enter a posisive integer higher than the first one.");
		int n2 = sc.nextInt(); // Acts as the limit of the loop
		int modulus;
		int nSquareRoot = (int)Math.sqrt(n2);
		
		// Calculating if n (the inputed number) is a prime number
		while (n1 < nSquareRoot) // The loop will stop when the first number (counter) is 1 below the second number (the limit)
		{
			
			
				modulus = n2 % n1;
				if (modulus != 0) // n % counter finds the remainder of n/counter, so if its not zero, its not divisible by the counter
				{
					System.out.println(n1);
				}	
				else
				{
					break; // Exits the loop if modulus is zero, meaning it is not a prime number
				}
				n1 = n1 + 1;
		}
		if (nSquareRoot == 1) // Since the counter starts at 2, 1 is not included, but 1 is a prime number
		{
			System.out.println("1");
		}
		
		// Outputting if the inputed number is a prime number or not
		}
}
