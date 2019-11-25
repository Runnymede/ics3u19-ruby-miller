package miller.unit2;

import java.util.Scanner;

/**PrimeNumbers.java <p>
 * This program calculates and outputs is the inputed number is a prime number (is only divisible by 1 and itself <p>
 * November 4, 2019
 * @author Ruby Miller
 */

public class PrimeNumbers {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		// Declaring variables, getting input (n) from user
		int counter = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive integer");
		int n = sc.nextInt();
		String primeNumber = " ";
		int modulus;
		double nSquareRoot = Math.sqrt(n);
		
		// Calculating if n (the inputed number) is a prime number
		while (counter < nSquareRoot) // The loop will stop when the counter equals the inputed number (n), see line 42
		{
			modulus = n % counter;
			if (modulus != 0) // n % counter finds the remainder of n/counter, so if its not zero, its not divisible by the counter
			{
				primeNumber = " is a prime number!";
			}
			else
			{
				primeNumber = " is not a prime number.";
				break; // Exits the loop if modulus is zero, meaning it is not a prime number
			}
			counter = counter + 1;
		}
		if (n == 1 || n == 0) // Since the counter starts at 2, 1 is not included, but 1 is a prime number
		{
			primeNumber = " is not a prime number!";
		}
		else if (n == 2)
		{
			primeNumber = " is a prime number"
;		}
		
		// Outputting if the inputed number is a prime number or not
		System.out.println(n + primeNumber);
		}
		
	}