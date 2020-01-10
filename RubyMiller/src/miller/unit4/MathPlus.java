package miller.unit4;

import java.util.Arrays;
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
		System.out.println("the median of the array is " + median(userDoubles));
		System.out.println("The mode of the array is " + mode(userDoubles));

		System.out.println("Enter an integer");
		int number = sc.nextInt(); //The integer that will be the parameter of the next few methods.
		System.out.print(number + " is ");
		if (prime(number) == true) { //Calling the prime method with the inputed integer, if it's true it's prime, if false, it isn't prime.
			System.out.println("a prime number.");
		}
		else {
			System.out.println("not a prime number.");
		}
		System.out.println("The factorial of " + number + " is " + factorial(number));
		System.out.println(number + " has " + numOfFactors(number) + " factors");
		System.out.print(number + "'s factors are ");
		int[] print = factors(number);
		for (int i = 0; i < numOfFactors(number); i++) {
			System.out.print(print[i] + " ");
		}
	}

	/**
	 * This method finds the minimum number in the inputed array. <br>
	 * @param numbers - the array of numbers that the program finds the minimum of. <br>
	 * @return the smallest integer in the given array.
	 */
	public static int min(int[]numbers) {
		int minNumber = Math.min(numbers[0], numbers[1]); //Finding the minimun of the first 2 numbers in the array.
		for (int i = 0; i < numbers.length; i++) { //The loop will continue until it has ran through all of the numbers in the array.
			minNumber = Math.min(numbers[i], minNumber); //Calculating the minimum of the previous smallest number and i (the next number in the array).
		}
		return minNumber;
	}

	/**
	 * This method finds the maximum number in the inputed array. <br>
	 * @param numbers - the array of numbers that the program finds the maximum of. <br>
	 * @return the largest integer in the given array.
	 */
	public static int max(int[]numbers) {
		int maxNumber = Math.max(numbers[0], numbers[1]); //Finding the maximum of the first 2 numbers in the array.
		for (int i = 0; i < numbers.length; i++) { //The loop stops when all of the numbers in the array have been compared.
			maxNumber = Math.max(numbers[i], maxNumber); //Finding the max between the current max number and the next number in the array.
		}
		return maxNumber;
	}

	/**
	 * This method adds all of the numbers in the array together. <br>
	 * @param numbers - the array of numbers that the program adds together. <br>
	 * @return the sum of all the integers in the given array.
	 */
	public static int sum(int[]numbers) {
		int sumNumbers = 0; //The sum starts at 0, so you can add the other numbers to it.
		for (int i = 0; i < numbers.length; i++) { //The loop ends whan all of the numbers in the array have been added
			sumNumbers = sumNumbers + numbers[i]; //Adding the new number to the previous sum.
		}
		return sumNumbers;
	}

	/**
	 * This method finds the average of the array of integers. <br>
	 * @param numbers - the array of numbers that the program afinds the average of. <br>
	 * @return the average of all the integers in the given array.
	 */
	public static double average(int[]numbers) {
		return (double)sum(numbers) / numbers.length; //Calling the sum method, and dividing it by the amount of numbers.
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
		double maxNumber = Math.max(numbers[0], numbers[1]); //Finding the maximum of the first 2 numbers in the array.
		for (int i = 0; i < numbers.length; i++) { //The loop ends when all of the numbers in the arrya have been compared.
			maxNumber = Math.max(numbers[i], maxNumber); //Finding the maximum of the previous max number to the next number in the array.
		}
		return (int)maxNumber;
	}

	/**
	 * This method adds all of the numbers in the array together. <br>
	 * @param numbers - the array of numbers that the program adds together. <br>
	 * @return the sum of all the numbers (doubles) in the given array.
	 */
	public static double sum(double[]numbers) {
		double sumNumbers = 0; //The sum starts at 0, so you can add the other numbers to it.
		for (int i = 0; i < numbers.length; i++) { //The loop ends whan all of the numbers in the array have been added.
			sumNumbers = sumNumbers + numbers[i];  //Adding the new number to the previous sum.
		}
		return sumNumbers;
	}

	/**
	 * This method finds the average of the array. <br>
	 * @param numbers - the array of numbers that the program finds the average of. <br>
	 * @return the average of all the numbers (doubles) in the given array.
	 */
	public static double average(double[]numbers) {
		return sum(numbers) / numbers.length; //Calling the sum method, and dividing it by the amount of numbers.
	}

	/**
	 * This method finds the median of the array. <br>
	 * @param numbers - the array of numbers that the program finds the median of. <br>
	 * @return the median of all the numbers (doubles) in the given array.
	 */
	public static double median(double[]numbers) {
		Arrays.sort(numbers);
		if (numbers.length % 2 == 0) { //If there is an even amount of numbers in the array.
			return ((numbers[numbers.length / 2 - 1]) + (numbers[(numbers.length / 2)] )) / 2; //Finding the 2 numbers in the middle, and dividing the sum of them by 2.
		}
		else {
		return (numbers[numbers.length / 2]); //If there is an odd amount of numbers in the array, find the middle one
		}
	}

	/**
	 * This method finds the mode of the array. <br>
	 * @param numbers - the array of numbers that the program finds the mode of. <br>
	 * @return the mode of all the numbers (doubles) in the given array.
	 */
	public static double mode(double[]numbers) {
		int counter2 = 0;
		double mode = numbers[0]; //The mode will start as the first number, then change after.
		for (int i = 0; i < numbers.length; i++) { //The loop will stop when it has gone through all of the numbers in the array.
			double value = numbers[i];
			int counter = 1;
			for (int j = 0; j < numbers.length; j++) { //This loop ends when it goes through all the numbers.
				if (numbers[j] == value) { //If the new number is the same as the previous number, 1 adds to the counter.
					counter++;
					if (counter > counter2) { //Whichever number there is more of, becomes the mode.
						mode =  value;
						counter2 = counter;
					}
				}
			}
		}
		return mode;
	}

	/**
	 * This method calculates if the given number is prime or not. <br>
	 * @param number - the number that the program calculates if it's prime or not. <br>
	 * @return true if the number is prime, or false if it's not
	 */
	public static boolean prime(int number) { 
		int counter = 1;                      
		while (counter < Math.sqrt(number)) {
			counter++;
			if (number == 1 || number == 0){ // Since the counter starts at 2, 1 is not included, but 1 is a prime number
				return false;
			}
			else if ((number == 2) || (number % counter != 0)){
				return true;
			}
			else {
				break;
			}
		}
		return false;
	}
	
	/**
	 * This method calculates the factorial of the given number. <br>
	 * @param number - the number that the program calculates the factorial of. <br>
	 * @return the factorial of the given number.
	 */
	public static long factorial(int number) {
		int sum = 1;
		for (int i = 1; i <= number; i++) {
			sum = sum * i;
		}
		return sum;
	}

	/**
	 * This method calculates the amount of factors the given number has. <br>
	 * @param number - the number that the program calculates how many factors it has. <br>
	 * @return the amount of factors the given number has.
	 */
	public static int numOfFactors(int number) {
		int counter = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				counter++;
			}
		}
		return counter;

	}
	
	/**
	 * This method finds all of the given number's factors. <br>
	 * @param number - the number that's factors are found. <br>
	 * @return an array that includes all of the factors the given number has.
	 */
	public static int[] factors(int number) {          
		int[] factors = new int[numOfFactors(number)]; 
		int counter = 0;
		for (int i = 1; i <= number; i++) {
			int factor = number / i;
			if (number % i == 0) {
				factors[counter] = factor;
				counter++;
			}
		}
		return factors;
	}
}





