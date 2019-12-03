package miller.unit3;

import java.util.Scanner;

/**GuessGame.java <p>
 * In his program, the user will think of a fruit, and the computer will mimic guessing it. <br>
 * The computer will only guess each fruit once, and if it has guessed all of them, it will give up and stop guessing. <br>
 * The 8 fruits are stored in an array, and the computer will generate a random number. This number will be used as the index to get a fruit from the array. <br>
 * Once a fruit is guessed once, the fruit in the array will be replaced with nothing, and the computer can't guess at an index that has nothing in it. <br>
 * It will continue generating random numbers until it gets one that the thing in the array at that index is something other than nothing. <br>
 * The computer counts how many fruits it has guessed, and once it reaches the maximum (8), it has no more guesses, so it gives up. <br>
 * The user inputs yes or no when the computer guesses, and the computer will keep guessing when the user inputs no, but if the user inputs yes, the computer wins.<p>
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
		do {
			guessIndex = (int)(Math.random()*8); //The computer will choose a random number
			if (fruits[guessIndex] != "") { //if the fruit at the randomly guessed index isn't nothing (if it is a fruit), it will guess it
				System.out.println("Is it " + fruits[guessIndex] + "?"); //Guessing the random fruit
				correct = sc.nextLine(); //Getting input from the user (yes or no)
				counter++; //Adds 1 to the counter if a fruit is guessed for the first (and only) time
				fruits[guessIndex] = ""; //It will replace the fruit at the guessed index in the array, with nothing, so it can't guess the same fruit more than once
			}
		} while (correct.equalsIgnoreCase("no") && counter < 8); //The computer will continue to guess until the user says yes

		//Printing if the computer wins, or has guessed all of the fruits (gives up)
		if (counter == 8 && correct.contentEquals("no")) { //When the computer has guessed all of the fruits (when counter is 8), and they were all wrong, it gives up
			System.out.println("I give up!");
		}

		if (correct.equalsIgnoreCase("yes")) {
			System.out.println("I win!!!"); //When the computer guesses right, it wins
		}

	}
}