package miller.unit2;

/**Numbers1To100.java <p>
 * This program counts down from 10 to 1, then prints "Blast Off!" <br>
 * It delays 1 for 1 second before printing each number. <p>
 * November 11, 2019
 * @author Ruby Miller
 */

public class BlastOff {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 * @throws InterruptedException 
	 */

	public static void main(String[] args) throws InterruptedException {

		for (int i = 10; i > 0; i = i-1) //The loop will repeat 10 times
		{
			System.out.println(i);
			Thread.sleep(1000); //Delays the println for 1000 milliseconds (1 second)
		}
		System.out.println("Blast Off!");
		
	}

}
