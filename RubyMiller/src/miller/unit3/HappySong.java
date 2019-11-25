package miller.unit3;

/**HappySong.java <p>
 * This program prints the "If You're Happy and You Know it" song with 10 different verses. <br>
 * It stores the action phrases (eg. "clap your hands") in an array, each phrase is stored in a different index. <br>
 * It uses a loop to print "if you're happy and you know it" twice, ending with the action phrase, which changes every verse when the variable i in the for loop increases by 1 (the next index). <p>
 * November 23, 2019
 * @author Ruby Miller
 */

public class HappySong {

	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Declaring variables
		String [] actions = {"clap your hands,", "stomp your feet,", "shout hurray,", "pull your ear,", "make a smile,", "raise your hand,", "turn around,", "tap your foot,", "nod your head,"};
		String start = "If you're happy and you know it ";
		String thirdLine = start + " and you really want to show it,";

		//Printing the verses
		for (int i = 0; i <9; i++) //The loop will end when all of the verses are printed
		{
			System.out.println(start + actions[i]); //I will increase by 1 each time, so it will print the next verse's action
			System.out.println(start + actions[i]);
			System.out.println(thirdLine);
			System.out.println(start + actions[i]);
			System.out.println();
		}

		System.out.println(start + actions[0]); //Printing the first verse at the end to finish the song
		System.out.println(start + actions[0]);
		System.out.println(thirdLine);
		System.out.println(start + actions[0]);
	}

}