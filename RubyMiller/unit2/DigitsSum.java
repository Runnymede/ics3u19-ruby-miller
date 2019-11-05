package miller.unit2;

import java.util.Scanner;

/**DigitsSum.java <p>
 * This program asks the user for a positive integer, finds the digits, then finds the sum of the digits <p>
 * November 1, 2019
 * @author Ruby Miller
 */

public class DigitsSum {

	/**
	 * Entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		// Inputting a positive integer
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a positive integer");
		int number = sc.nextInt();
		
		// Declaring variables
		int division = 1;
		int modulus = 10;
		int length = String.valueOf(number).length();
		int digitSum = 0;
		
		// Determining and outputting the digits
		System.out.print("The digits are: ");
		while (length >0) // Loop will end when all the digits are done. Each time the loop goes around, 1 is subtracted from the length
		{
		modulus = (int)Math.pow(10, length); // 10 times 10 length amount of times will get the number you have to modulus by for the largest digit
		division = (int)Math.pow(10, (length - 1)); // 10 times 10 length-1 amount of times finds the number you have to divide by 
		int digit = ((number%modulus)/division);	// example from above: length = 3, 10 times 10 3 times gives 1000, which is the number to modulus by for a number with 3 digits
		System.out.print(digit + ", ");
		digitSum = digitSum + digit;
		length = length - 1;
		digit = digit - 1;
		}
		System.out.println("the sum of the digits of your number is " + digitSum + ".");
		
	}

}
