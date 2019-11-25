package miller.unit3;

import java.util.Scanner;

/**PowersTableBonus.java <p>
 * This program 
 * November 22, 2019
 * @author Ruby Miller
 */

public class NamesArray {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {
		//Declaring variables and getting user input
		Scanner sc = new Scanner(System.in);
		System.out.println("How many names do you want on the list?");
		int amount = sc.nextInt() + 1; //Add 1, because the index starts at 0, and the variable amount is used as a reference for the index
		System.out.println("Input the " + amount + " names one at a time");
		String [] names = new String[amount]; //Tyis array will hold all of the names entered. It will hold the inputed amount of names
		
		//Getting the names as input into an array
		for (int i = 0; i < amount; i++)
		{
			names[i] = sc.nextLine(); //Each name will be stored in a different index of the array, one after another starting at index 0
		}
		
		//Outputting the names in the order they were inputed
		for (int x = 0; x < amount; x++)
		{
			System.out.println(names[x]); //It will first print the fist name that was entered at index i (which is 0)
		}								  //Then t will continue to print all the names from the array until the counter is equal to the variable amount (which is really amount + 1) 
		System.out.println();
		
		//Outputting the names in the reverse order
		System.out.println("Reverse Order:");
		for (int y = amount; y > 0; y--)
		{
			System.out.println(names[y-1]); //It will first print the last name that was entered, then continue until the counter is 0
		}
		
	}

}
