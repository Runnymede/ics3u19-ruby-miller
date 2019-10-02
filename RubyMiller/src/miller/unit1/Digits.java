package miller.unit1;

import java.util.Scanner;

/**Digits.java
 * This program outputs the digits of a number between 0 and 999
 * September 30, 2019
 * @author Ruby Miller
 */

public class Digits {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {
		
		//Inputting an integer between 0 and 999
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 999\n");
		int number=sc.nextInt();
		
		//Determining the digits
		Double hundreds = Math.floor(number/100);
		Double tens = Math.floor((number%100)/10);
		Double ones = Math.floor((number%100)%10);
		
		//Outputting the digits
		System.out.format("%-8s %-10s", "Hundreds: ", hundreds);
		System.out.println();
		System.out.format("%-4s %7s", "Tens: ", tens);
		System.out.println();
		System.out.format("%-4s %7s", "Ones: ", ones);
	}

}
