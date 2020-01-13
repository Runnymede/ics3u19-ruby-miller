package miller.culminating;

import 
java.util.Scanner;

public class CulminatingConnect4 {
	
	/**
	 * This method calls all of the other methods and prints questions and statments to the screen for the user to answer/see. <br>
	 * This method prints which player wins, if the board is full and the players tied, and will ask the players if they want to play again. <br>
	 * This method also declares a 2D array that will store the values on the board. <br>
	 * @param args - the array of strings that stores arguments passed by the command line.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	}

	/**
	 * This method is given the value 1 or 2 (red/yellow), it will ask the player to where they want to place their game piece. <br>
	 * @param player - either 1 or 2 (1 is red, 2 is yellow), whichever player's turn it is. <br>
	 * @return the column number that the player inputed, which is where the game piece will be placed. 
	 */
	public static int playerTurn(int player) {
		Scanner sc = new Scanner(System.in);
		if (player == 1)
			System.out.print("Red");
		System.out.print("Yellow");
		System.out.println(" player, where do you want to place your game piece?");
		return sc.nextInt();
	}
	
	/**
	 * This method will print the grid according to the given array of numbers that represent red and yellow. <br>
	 * It will print the outline/boxes, and coloured circles in the spots previously entered by the players. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces.
	 */
	public static void printGrid(int[] grid) {
		
	}
	
	/**
	 * This method checks if there are 4 of the same colour/number in a row horizontally, anywhere on the board. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces. <br>
	 * @return 1 if there are 4 reds (1s) in a row, 2 if there are 4 yellows (2s) in a row, and 0 if there are no 4 in a row of either colour.
	 */
	public static int horizontalWin(int[] grid) {
		
	}
	
	/**
	 * This method checks if there are 4 of the same colour/number in a row vertically, anywhere on the board. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces. <br>
	 * @return 1 if there are 4 reds (1s) in a row, 2 if there are 4 yellows (2s) in a row, and 0 if there are no 4 in a row of either colour.
	 */
	public static int verticalWin(int[] grid) {
		
	}
	
	/**
	 * This method checks if there are 4 of the same colour/number in a row diagonally top left to bottom right or bottom left to top right. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces. <br>
	 * @return 1 if there are 4 reds (1s) in a row, 2 if there are 4 yellows (2s) in a row, and 0 if there are no 4 in a row of either colour.
	 */
	public static int diagonalWin(int[] grid) {
		
	}
	
	/**
	 * This method checks if the player entered a number in the range (inclusive) of 1-7, since there are only 7 columns. <br>
	 * @return true if the player entered a number in the range of 1-7, false if the player entered a number not in the range of 1-7 (eg 0, 8). <br>
	 */
	public static boolean correctColumn(int column) {
		if (column > 0 && column < 8)
			return true;
		return false;
	}
	
	/**
	 * This method goes through all of the spots in the array, and checks the values in all of them to determine if it is full or not. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces. <br>
	 * @return true if the board is not full yet, false if the board is full.
	 */
	public static boolean fullBoard(int[] grid) {
		
	}
	
	/**
	 * This method goes through all of the spots in the inputed column, and checks the values to determine if it is full or not. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces. <br>
	 * @return true if the column is not full yet, false if the board is full.
	 */
	public static boolean fullColumn(int[] grid, int column) {
		
	}
	
	/**
	 * This method goes through all of the spots in the array and takes all of the 1 and 2 values out of the array <br>
	 * @param grid - the array of numbers that represent the coloured game pieces.
	 */
	public static void clearBoard(int[] grid) {
		
	}
	
}
