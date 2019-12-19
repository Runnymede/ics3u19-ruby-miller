package miller.unit4;

import java.util.Scanner;

/**PrintSignature.java <p>
 * This program allows the user to input an array of numbers, and will use different methods to do different calculations. <br>
 * The min method returns the smallest number in the array. <br>
 * The max method returns the largest number in the array. <br>
 * The sum method returns the sum of all of the numbers in the array. <br>
 * The average method returns the average number, of all the numbers in the array as a double. <br>
 * All of the calculations are printed in the main method. <p>
 * December 19, 2019
 * @author Ruby Miller
 */

public class MathPlus {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	/**
	 * This method allows the user to enter the array, and prints all of the calculations
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers in the array?");
		int amount = sc.nextInt(); //the variable amount will be used as the amount of numbers in the array
		int[] userNumbers = new int[amount]; //Declaring the array
		System.out.println("Enter the array");
		for (int i = 0; i < amount; i++){ //This loop allows the user to input all of the numbers, and stores them in the array
			userNumbers[i] = sc.nextInt(); //Storing the inputed numbers
		}
		System.out.println("The smallest number is " + min(userNumbers));
		System.out.println("The largest number is " + max(userNumbers));
		System.out.println("The sum of all the numbers is " + sum(userNumbers));
		System.out.println("The average of all the numbers is " + average(userNumbers));
	}

	/**
	 * This method returns the minimum number in the inputed array
	*/
	public static int min(int[]numbers) {
		int minNumber = Math.min(numbers[0], numbers[1]); //Finding the minimun of the first 2 numbers in the array
		for (int i = 0; i < numbers.length; i++) { //The loop will continue until it has ran through all of the numbers in the array
			minNumber = Math.min(numbers[i], minNumber); //Calculating the minimum of the previous smallest number and i (the next number in the array)
		}
		return minNumber;
	}

	public static int max(int[]numbers) {
		int maxNumber = Math.max(numbers[0], numbers[1]);
		for (int i = 0; i < numbers.length; i++) {
			maxNumber = Math.max(numbers[i], maxNumber);
		}
		return maxNumber;
	}

	public static int sum(int[]numbers) {
		int sumNumbers = 0;
		for (int i = 0; i < numbers.length; i++) {
			sumNumbers = sumNumbers + numbers[i];
		}
		return sumNumbers;
	}

	public static double average(int[]numbers) {
		return (double)sum(numbers) / numbers.length;
	}
}

