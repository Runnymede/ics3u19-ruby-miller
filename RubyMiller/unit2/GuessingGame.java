package miller.unit2;

import java.util.Scanner;

/**GuessingGame.java <p>
 * This program generates a pseudorandom number and determines whether the player guessed right <p>
 * October 15, 2019
 * @author Ruby Miller
 */

public class GuessingGame {

	/**
	 * Entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		//Generating the pseudorandom number
		int number = (int)(Math.random()*20) + 1;
		
		//Inputting the guess
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number between 1 and 20");
		int guess = sc.nextInt();
		
		System.out.println("The secret number is " + number + ". You guessed " + guess + ".");
		
		//Determining if the guess is correct
		if (guess == number)
		{
			System.out.println("You won!");
		}
		else
		{
			System.out.println("Better luck next time.");
		}
		
	}

}
