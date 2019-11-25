package miller.unit2;

/**EvenNumbers.java <p>
 * This program prints the numbers between 1 and 100 using a for loop. <p>
 * November 11, 2019
 * @author Ruby Miller
 */

public class EvenNumbers {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		for (int i = 1; i < 101; i = i + 1) //The loop will repeat 100 times
		{
			
			if (i%2 == 0) //If the counter (i) can be divided by 2, it is an even number
			{
				System.out.println(i);
			}
		}
		
	}

}
