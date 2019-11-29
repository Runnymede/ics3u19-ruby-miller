package miller.unit3;

import java.util.Scanner;

/**GuessGame.java <p>
 * This program
 * November 29, 2019
 * @author Ruby Miller
 */

public class GuessGameBonus {

	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Declaring variables
		String [] fruits = {"an orange", "an apple", "a strawbery", "a blueberry", "a grape", "a banana", "a pinapple", "a raspberry"};
		String correct = "no";
		int guessIndex;
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		String guess;

		//Starting the game
		System.out.println("Hi, lets play a guessing game! Think of a fruit, and I will guess, you answer yes or no.");
		System.out.println();

		//Computer guessing, and user answering (yes/no)
		do
		{
			guessIndex = (int)(Math.random()*8); //The computer will choose a random number
			if (fruits[guessIndex] != "") {
			System.out.println("Is it " + fruits[guessIndex] + "?");
			correct = sc.nextLine(); //Getting input from the user (yes or no)
			counter++;
			fruits[guessIndex] = "";
			}
			
			
			
		} while (correct.equalsIgnoreCase("no") && counter < 9); //The computer will continue to guess until the user says yes
		
		if (correct.equalsIgnoreCase("yes"))
			System.out.println("I win!!!"); //When the computer guesses right, it will print this line
		
		if (counter == 9)
			
	}
}