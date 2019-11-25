package miller.unit2;

import java.util.Scanner;

/**PrimeNumbersBonus.java <p>
 * This program finds all of the prime numbers in between the 2 inputed numbers <p>
 * November 4, 2019
 * @author Ruby Miller
 */

public class PrimeNumbersBonus {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		// Declaring variables and getting input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a positive integer.");
		int lowNumber = sc.nextInt(); // Acts as the actual number
		System.out.println("Please enter a posisive integer higher than the first one.");
		int highNumber = sc.nextInt(); // Acts as the limit
		System.out.println("The prime numbers in between " + lowNumber + " and " + highNumber + " are:");
		double modulus;
		boolean primeNumber = false;

		//Finding the prime numbers in between the 2 imputed numbers
		while (lowNumber <= highNumber) //The loop will repeat until the low number is equal to the high number
		{
			for (int i = 2; i < lowNumber; i++)
		{	
				modulus = lowNumber % i;
				if (modulus == 0) // n2 % n1 finds the remainder of n2/n1, so if its zero, its divisible by the the first number, so its not a prime number
				{
					primeNumber = false;
					break; //Exits the loop if the number is not a prime number
				}
				else //When the number isn't divisible by i
				{
					primeNumber = true;
				}
			}
			if (primeNumber != false) //When the number is a prime number, it will print it
			{
				System.out.println(lowNumber);
			}
			lowNumber = lowNumber + 1; //The low number will get 1 larger each repeat, until it is equal to the high number
		}

	}
}
