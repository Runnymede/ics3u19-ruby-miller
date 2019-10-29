package miller.unit2;

import java.util.Scanner;

/**NumberCheck.java <p>
 * This program tests to see if an integer is positive or negative, and if its divisible by 7 <p>
 * October 2, 2019
 * @author Ruby Miller
 */

public class NumberCheck {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {
		
		//Inputting the integer
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input an integer");
		int number = sc.nextInt();
		
		//Determine if the integer is positive or negative
		if (number>=0)
		{
			System.out.println("Your number is positive.");
		}
		else
		{
			System.out.println("Your number is negative.");
		}
		
		//Determine if the number is divisible by 7
		if (number%7 == 0)
		{
			System.out.println("Your number is divisible by 7.");
		}
		else
		{
			System.out.println("Your number is not divisible by 7.");
		}

	}

}
