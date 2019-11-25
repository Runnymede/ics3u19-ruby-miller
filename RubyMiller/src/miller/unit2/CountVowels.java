package miller.unit2;

import java.util.Scanner;

/**CountVowels.java <p>
 * This program finds the amount of vowels in an inputed string. <br>
 * It uses a for loop, where x represents the index the character is at. <br>
 * If the character at the index x is a lower case or upper case vowel, it adds 1 to the counter, the amount of vowels is printed after the loop. <p>
 * November 12, 2019
 * @author Ruby Miller
 */

public class CountVowels {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {
		
		//Declaring variables and inputting the string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter text");
		String text = sc.nextLine();
		int length = text.length();
		char letter;
		int counter = 0;
		
		//Finding the characters, and which ones are vowels
		for (int x = 0; x < length; x++) //The variable x starts at 0, since the first index of a string is 0, the second index is 1, etc.
		{
			letter = text.charAt(x); //Finds the character at index x, which gets 1 higher each time the loop is repeated
			boolean equals = (letter=='a'||letter=='A'||letter=='e'||letter=='E'||letter=='i'||letter=='I'||letter == 'o'||letter=='O'||letter == 'u'||letter=='U');
			if (equals == true) //It enters the if statement if equals is true.
			{					//Equals is true if the character is any upper case or lower case vowel
				counter++; //Each time a letter is a vowel, 1 will be added to the counter
			}
		}
		
		//Outputting the amount of vowels in the inputed string
		System.out.println("There are " + counter + " vowels in " + text + ".");
		
	}

}
