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
	 * This method allows the user to enter the array, and prints all of the calculations. <br>
	 * @param args - the array of strings that stores arguments passed by the command line.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many integers in the array?");
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
		
		System.out.println();
		System.out.println("How many numbers in the array (with decimals)?");
		int doubleAmount = sc.nextInt(); //the variable amount will be used as the amount of numbers in the array
		double[] userDoubles = new double[doubleAmount]; //Declaring the array
		System.out.println("Enter the array");
		for (int i = 0; i < doubleAmount; i++){ //This loop allows the user to input all of the numbers, and stores them in the array
			userDoubles[i] = sc.nextDouble(); //Storing the inputed numbers
		}
		System.out.println("The smallest number is " + min(userDoubles));
		System.out.println("The largest number is " + max(userDoubles));
		System.out.println("The sum of all the numbers is " + sum(userDoubles));
		System.out.println("The average of all the numbers is " + average(userDoubles));
	}

	/**
	 * This method finds the minimum number in the inputed array. <br>
	 * @param numbers - the array of numbers that the program finds the minimum of. <br>
	 * @return the smallest integer in the given array.
	*/
	public static int min(int[]numbers) {
		int minNumber = Math.min(numbers[0], numbers[1]); //Finding the minimun of the first 2 numbers in the array
		for (int i = 0; i < numbers.length; i++) { //The loop will continue until it has ran through all of the numbers in the array
			minNumber = Math.min(numbers[i], minNumber); //Calculating the minimum of the previous smallest number and i (the next number in the array)
		}
		return minNumber;
	}

	/**
	 * This method finds the maximum number in the inputed array. <br>
	 * @param numbers - the array of numbers that the program finds the maximum of. <br>
	 * @return the largest integer in the given array.
	*/
	public static int max(int[]numbers) {
		int maxNumber = Math.max(numbers[0], numbers[1]);
		for (int i = 0; i < numbers.length; i++) {
			maxNumber = Math.max(numbers[i], maxNumber);
		}
		return maxNumber;
	}
	
	/**
	 * This method adds all of the numbers in the array together. <br>
	 * @param numbers - the array of numbers that the program adds together. <br>
	 * @return the sum of all the integers in the given array.
	*/
	public static int sum(int[]numbers) {
		int sumNumbers = 0;
		for (int i = 0; i < numbers.length; i++) {
			sumNumbers = sumNumbers + numbers[i];
		}
		return sumNumbers;
	}
	
	/**
	 * This method finds the average of the array of integers. <br>
	 * @param numbers - the array of numbers that the program afinds the average of. <br>
	 * @return the average of all the integers in the given array.
	*/
	public static double average(int[]numbers) {
		return (double)sum(numbers) / numbers.length;
	}
	
	/**
	 * This method finds the minimum number in the inputed array. <br>
	 * @param numbers - the array of numbers that the program finds the minimum of. <br>
	 * @return the smallest integer in the given array.
	*/
	public static int min(double[]numbers) {
		double minNumber = Math.min(numbers[0], numbers[1]); //Finding the minimun of the first 2 numbers in the array
		for (int i = 0; i < numbers.length; i++) { //The loop will continue until it has ran through all of the numbers in the array
			minNumber = Math.min(numbers[i], minNumber); //Calculating the minimum of the previous smallest number and i (the next number in the array)
		}
		return (int)minNumber;
	}
	
	/**
	 * This method finds the maximum number in the inputed array. <br>
	 * @param numbers - the array of numbers that the program finds the maximum of. <br>
	 * @return the largest integer in the given array.
	*/
	public static int max(double[]numbers) {
		double maxNumber = Math.max(numbers[0], numbers[1]);
		for (int i = 0; i < numbers.length; i++) {
			maxNumber = Math.max(numbers[i], maxNumber);
		}
		return (int)maxNumber;
	}
	
	/**
	 * This method adds all of the numbers in the array together. <br>
	 * @param numbers - the array of numbers that the program adds together. <br>
	 * @return the sum of all the numbers (doubles) in the given array.
	*/
	public static double sum(double[]numbers) {
		double sumNumbers = 0;
		for (int i = 0; i < numbers.length; i++) {
			sumNumbers = sumNumbers + numbers[i];
		}
		return sumNumbers;
	}
	
	/**
	 * This method finds the average of the array of integers. <br>
	 * @param numbers - the array of numbers that the program afinds the average of. <br>
	 * @return the average of all the numbers (doubles) in the given array.
	*/
	public static double average(double[]numbers) {
		return sum(numbers) / numbers.length;
	}
}

