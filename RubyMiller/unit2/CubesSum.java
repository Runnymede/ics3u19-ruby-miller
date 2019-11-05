package miller.unit2;

import java.util.Scanner;

/**CubesSum.java <p>
 * The first part of this program calculates the sum of the cubes of an inputed positive integer<p>
 * The second part of this program finds positive integers that are equal to the sum of the cubes of their digits <p>
 * November 1, 2019
 * @author Ruby Miller
 */

public class CubesSum {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		// Declaring variables, calculating length
		int number = 10000;
		String numberString  = Integer.toString(number); // Converting the inputed integer to a string to find its length
		int length = numberString.length(); // Its length is the amount of times the loop will go around, see line 32
		int modulus = 10;
		int division = 1;
		int digit;
		int cubedDigit;
		int cubedDigitSum = 0;

		// Calculating the digits
		while (number >9)
		{
			length = numberString.length();
			modulus = 10;
			division = 1;
			cubedDigitSum = 0;
			while (length >0)
			{
				digit = ((number%modulus)/division); // Calculating the digit, starting from the ones, then tens, etc.
				cubedDigit = digit * digit * digit; // Finding the digit cubed=
				cubedDigitSum = cubedDigitSum + cubedDigit; // Adding on to the sum each time the loop goes
				modulus = modulus * 10; // Each digit is gets *10 bigger
				division = division * 10;
				length = length - 1; // Acts as a counter
			}
			length = numberString.length();
			if (cubedDigitSum == number)
			{
				System.out.println(number);
			}

			number = number - 1;
		}

	}
}