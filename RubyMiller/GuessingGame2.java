package miller.unit2;

import java.util.Scanner;

/**GuessingGame2.java <p>
 * This program generates a pseudorandom number and determines whether the player guessed right <br>
 * It allows the user to guess until they guess correctly <p>
 * October 28, 2019
 * @author Ruby Miller
 */

public class GuessingGame2 {

	/**
	 * Entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		//Generating the pseudorandom number, inputting guess
		int number = (int)(Math.random()*20) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 20");
		int guess = sc.nextInt(); 
		
		//Determining if the guess is correct
		while (guess != number)
		{
		System.out.println("Try again.");
		System.out.println("Please enter a number between 1 and 20");
		guess = sc.nextInt();
		}
		System.out.println("You won!");
		System.out.println("The secret number was " + number + "!");
	}

	}

