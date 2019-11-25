package miller.unit2;

import java.util.Scanner;

/**NeaklaceProblem.java <p>
 * This program takes 2  inputed 1 digit numbers, and adds them together. <br>
 * Then it takes the ones digit of the new number and adds it to the second inputed digit. <br>
 * It continues this inside a do-while loop until the 2 inputed numbers come up again in the same order, it prints all the numbers on thne way.<br>
 * eg. input 1 = 1, input 2 = 8, output = 1 8 9 7 6 3 9 2 1 3 4 7 1 8 <p>
 * November 4, 2019
 * @author Ruby Miller
 */

public class NeaklaceProblem {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		// Declaring variables
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number from 0 to 9");
		int input1 = sc.nextInt();
		System.out.println("Enter another number from 0 to 9");
		int input2 = sc.nextInt();
		int number1 = input1;
		int number2 = input2;
		int number3;
		
		//Outputting the first 2 numbers
		System.out.print(number1 + " " + number2);
		
		//Calculating the next number, and the ones digit of it
		do
		{
			number3 = number1 + number2; //Adds the new 2 numbers
			if (number3 >= 10)
			{
				number3 = number3 % 10; //Finds the ones digit of the number
			}
			System.out.print(" " + number3);
			if (number1 >= 10)
			{
				number1 = number1 % 10;
			}
		
			if (number2 >= 10)
			{
				number2 = number2 % 10;
			}
			
			number1 = number2; //Turns the second number into the new first number
			number2 = number3; //Turns the result (third number) into the new second number
		}
		while ((number1 != input1) || (number2 != input2)); //The loop will end when the 2 numbers come up again, correctly ordered
	}

}
