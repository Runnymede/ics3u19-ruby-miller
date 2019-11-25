package miller.unit3;

/**DiceRolls.java <p>
 * This program mimics rolling 2 dice 10000 times. Each time the total of the 2 dice is added. <br>
 * The amount of each roll is calculated using an accumulator array. <br>
 * Each index in the array is for a different total roll accumulator. <br>
 * eg. the total roll accumulator for 7 is stored in the fifth index of the array, since the lowest index is 0, and the lowest total is 2. <br>
 * The total rolls and amount each total was rolled is then outputted in a table. <p>
 * November 24, 2019
 * @author Ruby Miller
 */

public class DiceRolls {

	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Declaring variables
		int dice1;
		int dice2;
		int diceTotal;
		int [] counters = new int[11]; //This will keep track of how many times each total from 2-12 was reached

		//Rolling the dice and counting how many of each total was rolled
		for (int i = 0; i < 10000; i++) //The loop will continue 10000 times, meaning it mimics rolling 2 dice 10000 times
		{
			dice1 = (int)(Math.random()*6)+1; //Generating pseudorandom numbers for the 2 dice
			dice2 = (int)(Math.random()*6)+1; //The 2 numbers will be different each time the loop repeats
			diceTotal = dice1 + dice2;

			for (int x = 2; x <= 12; x++) //This loop will count the amount of times each total was rolled
			{
				if (diceTotal == x) //Since x starts at 2, if the total is 2, it will add 1 to the counter
				{
					counters[x-2] = counters[x-2] + 1; //The index starts at 0, while x (the total) starts at 2, so 1 will be added to the counter at the index of the total-2
				}
			}

		}
		System.out.printf("%-20s %-10s", "Dice Total", "Amount of Rolls\n"); //Formating the first line
		for (int y = 0; y <= 10; y++) //This loop prints all of the data formatted in a table under the first line
		{
			System.out.printf("%-20s %-10s\n", (y + 2), counters[y]); //It will print y + 2, since y starts at 0 (the first index), while the lowest total is 2
		}

	}

}
