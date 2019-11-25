package miller.unit3;

import java.util.Scanner;

/**GuessGame.java <p>
 * This program 
 * November 25, 2019
 * @author Ruby Miller
 */

public class GuessGame {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaring variables
		String [] fruits = {"an orange", "an apple", "a strawbery", "a blueberry", "a grape", "a banana", "a pinapple", "a raspberry"};
		String correct;
		int guessIndex;
		Scanner sc = new Scanner(System.in);
		String guess;
		
		//Starting the game
		System.out.println("Hi, lets play a guessing game! Think of a fruit, and I will guess, you answer yes or no.");
		
		//Computer guessing, and user answering (yes/no)
		do
		{
			guessIndex = (int)(Math.random()*8); //The computer will choose a random number
			guess = fruits[guessIndex]; //The random number will be the index of the array that it will then guess
			System.out.println("Is it " + guess + "?");
			correct = sc.nextLine(); //Getting input from the user (yes or no)
		} while (correct.equalsIgnoreCase("no")); //The computer will continue to guess until the user says yes
		
		System.out.println("I win!!!"); //When the computer guesses right, it will print this line
		}

}


