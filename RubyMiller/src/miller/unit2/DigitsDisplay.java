package miller.unit2;

import java.util.Scanner;

/**DigitsDisplay.java <p>
 * This program prints the digits of a positive integer based on the input <p>
 * It uses division and modulus to calculate the digits from the inputed number <p>
 * October 31, 2019
 * @author Ruby Miller
 */

public class DigitsDisplay {
	
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
	int division = 0;
	int modulus = 0;
	int length = String.valueOf(number).length();
	
	// Determining and outputting the digits
	while (length >0)
	{
	division = (int)Math.pow(10, (length - 1));
	modulus = (int)Math.pow(10, length);
	int digit = ((number%modulus)/division);
	System.out.println(digit);
	length = length - 1;
	digit = digit - 1;
	}
	
	}

}
