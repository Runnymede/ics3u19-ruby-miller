package miller.unit2;

/**DiceRolls.java <p>
 * This program generates 2 random numbers and calculates the total of them added together. It prints all 3 things in a table, as columns. <br>
 * It does this 5 times (10 dice in total) using a for loop. <p>
 * November 12, 2019
 * @author Ruby Miller
 */

public class DiceRolls {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Printing the top line of the table
		System.out.printf("%-9s %-9s %-9s", "Dice 1", "Dice 2", "Total");
		
		for(int i = 0; i < 5; i++) //The loop will repeat 5 times
		{
		System.out.println();
		//Generating and printing 2 random numbers, representing 2 dice
		int dice1 = (int)(Math.random()*6) + 1; //6 faces of a dice, and it starts at 1, therefore (1-6)
		int dice2 = (int)(Math.random()*6) + 1;
		
		//Calculating the total of the dice roll
		int totalRoll = dice1 + dice2;
		
		//Printing the 2 dice rolls and the total of the rolls
		System.out.printf("%-10s", dice1);
		System.out.printf("%-10s", dice2);
		System.out.printf("%-10s", totalRoll);
		}
	}

}
