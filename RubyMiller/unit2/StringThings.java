package miller.unit2;

import java.util.Scanner;

/**StringThings.java <p>
 * This program consists of 3 tasks about Strings <p>
 * October 8, 2019
 * @author Ruby Miller
 */

public class StringThings {

	/**
	 * Entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		// 1) Inputting the word
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a word that is at least 7 letters long");
		String word = sc.nextLine();
		
		// a) Outputting the word inputed
		System.out.println("The word you entered is " + word + ".");
		
		// b) Outputting the word all upper case
		System.out.println("The word in all uppercase is " + word.toUpperCase() + ".");
		
		// c) Outputting the word all lower case
		System.out.println("The word in all lowercase is " + word.toLowerCase() + ".");
		
		// d) Determining the length of the string
		System.out.println("Your word has " + (word.length()) + " letters.");
		
		// e) Inputting which index to print the letter
		System.out.println("Which index do you want to print?");
		int index = sc.nextInt();
		System.out.println("The letter in index " + index + " is " + (word.charAt(index)));
		System.out.println();
		
		
		// 2) Inputting the 2 words
		System.out.println("Please enter a word");
		String word1 = sc.next();
		System.out.println("Please enter a second word");
		String word2 = sc.next();
		
		// a) Determining if the 2 words are the same
		if (word1.compareToIgnoreCase(word2) == 0)
		{
			System.out.println("The two words are the same.");
		}
		
		// b) Determining which word come first
		else if (word1.compareToIgnoreCase(word2) > 0)
		{
			System.out.println("The second word comes before the first word.");
		}
		else
		{
			System.out.println("The first word comes before the second word.");
		}
		
		
		// 3) Setting a username and password
		System.out.println();
		String username = "abcdefg";
		String password = "12345";
		
		// Inputting username and password, determining if they're right
		System.out.println("Please enter your username");
		String usernameEntered = sc.next();
		System.out.println("Please enter your password");
		String passwordEntered = sc.next();
		
		if (usernameEntered.compareToIgnoreCase(username) == 0)
		{
			if (passwordEntered.compareToIgnoreCase(password) == 0)
			{
				System.out.println("What is your name?");
				String name = sc.next();
				System.out.println("Welcome " + name + "!");
			}
			else
			{
				System.out.println("You entered the wrong username or password.");
			}
		}
		else
		{
			System.out.println("You entered the wrong username or password.");
		}
		
	}

}
