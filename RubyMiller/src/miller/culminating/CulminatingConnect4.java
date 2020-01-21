package culminating;

import java.awt.Color;
import java.util.Scanner;
import hsa_new.Console;

/**
 * This program stored the grid and the values in it in a 2D array, which has 0s (empty), 1s (red), and 2s (yellow). <br>
 * The user will first be asked what colour they want to represent the empty spaces in the grid. <br>
 * The program will print a 6x7 board which will be updated, and printed again every time a game piece is placed. <br>
 * The program will ask the users where they want to play their game pieces, and the spot on the grid they entered will turn their colour. <br>
 * If a player wants to put their game piece in a column that is already full, or a number not in the range of 1-7, the player will be asked to enter somewhere else. <br>
 * The program will be able to detect 4 in a row horizontally, vertically, and diagonally, and will print who won. <br>
 * It can also detect when the board is full, and there are no 4 in a row, it will then print out that it’s a tie. <br>
 * The user will be able to replay once the game is finished using a loop. <p>
 * January 13, 2020
 * @author Ruby Miller
 *
 */

public class CulminatingConnect4 {
	static Console c = new Console(35, 130); //Setting the console size
	
	/**
	 * This method calls all of the other methods and prints questions and statements to the screen for the user to answer/see. <br>
	 * This method prints which player wins, if the board is full and the players tied, and will ask the players if they want to play again. <br>
	 * This method also declares a 2D array that will store the values on the board. <br>
	 * @param args - the array of strings that stores arguments passed by the command line.
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int[][] grid = new int[6][7]; //The array that will store the values 1 (red) and 2 (yellow), acting as the game board
		int player = 1; //The game will start with player 1, representing the red player, player 2 represents the yellow player
		String repeat = "Yes"; //When a game is finished the user will be asked if they want to play again. Another game will always start if repeat = "yes"
		boolean play = true; //when end is true, the game will continue, when it's false the game will be over. It's initialized as true so the game can start
		String colour = "black";
		
		c.println("Connect Four Game Rules:\r\n" + //Printing the game rules out at the beginning of the first game
				"-There are 2 players that take turns placing their game pieces, in the first game, red goes first and yellow goes second\r\n" +
				"-If you choose to play again, yellow player will go first\r\n" +
				"-The game is played on a 6x7 grid, enter the number column on the grid that you want to place your game piece\r\n" + 
				"-The piece will go to the lowest empty space in the column entered\r\n" +
				"-The first player to get 4 of their pieces in a row horizontally, vertically, or diagonally wins!\r\n" + 
				"");
		
		printGrid(grid, colour); //The game will start by printing the grid, which will be empty/black at this point
		do {
			
			do { 
				c.println("What colour do you want the background to be? blue, green, pink, purple, orange, grey, or black?");
				colour = c.readLine();
				} while (!(colour.equalsIgnoreCase("blue") || colour.equalsIgnoreCase("green") || colour.equalsIgnoreCase("pink") || colour.equalsIgnoreCase("purple") || colour.equalsIgnoreCase("orange") || colour.equalsIgnoreCase("grey") || colour.equalsIgnoreCase("black")));
			
			clearBoard(grid); //the board will be cleared before every game
			printGrid(grid, colour);
			do {
				int drop; //drop is a counter that mimics a game piece falling to the lowest empty space in the chosen column
				
				int column = playerTurn(player); //The variable column changes every time a player enters a column
				
				if (correctColumn(column)) { //If the correctColumn method returns true, it the program will enter the if statement
					if (!fullColumn(grid, column)) { //If the column that the player entered is not full, it will enter the if statement
						do {
							drop = 5; //drop is set to 5 every time a game piece has to be dropped onto the board since Index 5 is the lowest row that the game piece can go
							while (grid[drop][column - 1] != 0) { //The program will go through the loop if drop (lowest spot) is not empty
								drop--; //drop will decrease by 1, causing the loop to check if the spot above is empty
							}
							grid[drop][column - 1] = player; //The player's (1 or 2) game piece will be placed
							break; //Once the game piece is placed, the program will exit the loop
						} while (drop >= 0); //This loop will repeat maximum 6 times, since there are only 6 rows
						player = switchPlayer(player); //When one player's game piece is placed it is the other player's turn
						c.clear(); //The console is cleared
						printGrid(grid, colour); //The board is printed again to continue the game
						if (horizontalWin(grid) == 1 || verticalWin(grid) == 1 || diagonalWin(grid) == 1) { //If there are 4 1s in a row horizontally, vertically, or diagonally
							c.println("Red player wins!"); //Red wins if any of the win methods return 1
							play = false; //The game will be over if the red player wins
							break; //The game is over
						}
						if (horizontalWin(grid) == 2 || verticalWin(grid) == 2 || diagonalWin(grid) == 2) { //Yellow wins if there are 4 2s (yellows) in a row horizontally, vertically, or diagonally
							c.println("Yellow player wins!"); //Yellow wins if any of the win methods return 2
							play = false; //The game will be over if the yellow player wins
							break; //The game is over
						}
						if (fullBoard(grid)) { //If the board is full, and neither player has won, it's a tie
							c.println("The board is full, it's a tie!");
							break; //If the board is full, so the game is over
						}
					}
					else { //if the column the player entered is full, they will be asked to enter another column
						c.println("This column is full, enter another column.");
					}
				}
				else { //If the player enters a column that doesn't exist, they will be asked to enter another column
					c.println("That column doesn't exist, enter another column.");
				}
			} while(play = true); //The loop will continue until the game is over
			
			do {
				c.println("Do you want to play again?"); //When a game is over, the user will be asked if they want to play again
				repeat = c.readLine(); //The user should enter yes or no
			} while (!(repeat.equalsIgnoreCase("Yes") || repeat.equalsIgnoreCase("No"))); //If the user doesn't enter yes or no, they will be asked again
		
		} while(repeat.equalsIgnoreCase("Yes")); //The whole loop will repeat until the user doesn't want to play again (enters no)
		c.clear(); //When the user enters no, the console will be cleared
		c.println("Thanks for playing!");
		clearBoard(grid);
		printGrid(grid, "blue");
		Thread.sleep(500);
		printGrid(grid, "green");
		Thread.sleep(500);
		printGrid(grid, "pink");
		Thread.sleep(500);
		printGrid(grid, "purple");
		Thread.sleep(500);
		printGrid(grid, "orange");
		Thread.sleep(500);
		printGrid(grid, "grey");
		Thread.sleep(500);
		printGrid(grid, "black");
		Thread.sleep(500);
		c.clear();
		Thread.sleep(500);
		c.close(); //Closing the console
	}

	/**
	 * This method is given the value 1 or 2 (red/yellow), it will ask the player to where they want to place their game piece. <br>
	 * @param player - either 1 or 2 (1 is red, 2 is yellow), whichever player's turn it is. <br>
	 * @return the column number that the player inputed, which is where the game piece will be placed. 
	 */
	public static int playerTurn(int player) {
		Scanner sc = new Scanner(System.in);
		if (player == 1) { //If the given player is 1, it represents the red player
			c.print("Red");
		}
		else { //If the given player is player 2, representing yellow
			c.print("Yellow");
		}
		c.println(" player, where do you want to place your game piece?"); //Asking the player to enter a column
		c.println("   1        2        3        4         5        6        7");
		int column = c.readInt();
		return column; //The method returns the column the player placed their game piece
	}

	/**
	 * This method will print the grid according to the given array of numbers that represent red and yellow. <br>
	 * It will print the outline/boxes, and coloured circles in the spots previously entered by the players. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces.
	 */
	public static void printGrid(int[][] grid, String colour) {
		for (int i = 0; i < 7; i++) {  //i is the counter for the columns
			for (int j = 0; j < 6; j++) { //j is the counter for the rows
				if (grid[j][i] == 1) { //If the red player's game piece is in the current spot
					c.setColor(new Color(255, 0, 0)); //Red
				}
				else if (grid[j][i] == 2) { //If the yellow player's game piece is in the current spot
					c.setColor(new Color(255, 255, 0)); //Yellow
				}
				else { //If neither of the player's game pieces are in the current spot, it is empty/blank
					if (colour.equalsIgnoreCase("black")) //The first time the grid is printed, it will appear black, and the user can also set it as black
						c.setColor(new Color(0, 0, 0));
					if (colour.equalsIgnoreCase("blue")) //If the user entered that they wanted blue to represent an empty space
						c.setColor(new Color(0, 0, 255)); 
					if (colour.equalsIgnoreCase("green")) //If the user entered that they wanted green to represent an empty space
						c.setColour(new Color(0, 153, 0));
					if (colour.equalsIgnoreCase("pink")) //If the user entered that they wanted pink to represent an empty space
						c.setColor(new Color(255, 0, 102));
					if (colour.equalsIgnoreCase("purple")) //If the user entered that they wanted purple to represent an empty space
						c.setColor(new Color(102, 0, 102));
					if (colour.equalsIgnoreCase("orange")) //If the user entered that they wanted orange to represent an empty space
						c.setColor(new Color(255, 102, 0));
					if (colour.equalsIgnoreCase("grey")) //If the user entered that they wanted grey to represent an empty space
						c.setColor(new Color(153, 153, 153));
				}
				c.fillRect((i * 73), j * 60 + 250, 60, 50); //The sizing and placement for each spot on the grid to be printed
			}
		}
	}

	/**
	 * This method will switch which player's turn it is. <br>
	 * @param player - the player whp's turn it just was. <br>
	 * @return 2 if the given player is 1, and 1 if the given player is 2.
	 */
	public static int switchPlayer(int player) {
		if (player == 1) { //If player 1 (red) just took their turn, it's now player 2's (yellow) turn
			return 2;
		}
		else { //If player 2 (yellow) just took their turn, it's player 1's (red) turn
			return 1;
		}
	}

	/**
	 * This method checks if there are 4 of the same colour/number in a row horizontally, anywhere on the board. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces. <br>
	 * @return 1 if there are 4 reds (1s) in a row, 2 if there are 4 yellows (2s) in a row, and 0 if there are no 4 in a row of either colour.
	 */
	public static int horizontalWin(int[][] grid) {
		for (int i = 0; i < 6; i++) { //i is a counter for rows, it goes through every row on the grid
			for (int j = 0; j < 4; j++) { //j is a counter for columns, and only counts to 4, since there are only  4 options for 4 in a row horizontally on a grid with 7 columns
				if (grid[i][j] == grid[i][j + 1] && grid[i][j + 1] == grid[i][j + 2] && grid[i][j + 2] == grid[i][j + 3] && grid[i][j] != 0) { //If 4 are in a horizontal row are equal
					if (grid[i][j] == 1) { //If one of the 4 in a row is a 1 (red)
						return 1; //Red wins!
					}
					else if (grid[i][j] == 2) { //If one of the 4 in a row is a 2 (yellow)
						return 2; //Yellow wins!
					}
				}
			}
		}
		return 0; //If there are 4 0s (blank) are in a horizontal row or if there are no 4 in a horizontal row
	}

	/**
	 * This method checks if there are 4 of the same colour/number in a row vertically, anywhere on the board. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces. <br>
	 * @return 1 if there are 4 reds (1s) in a row, 2 if there are 4 yellows (2s) in a row, and 0 if there are no 4 in a row of either colour.
	 */
	public static int verticalWin(int[][] grid) {
		for (int i = 0; i < 3; i++){ //i is a counter for rows, it only counts to 3, since there are only 3 options for 4 in a row vertically on a grid with 6 rows
			for (int j = 0; j < 7; j++) { //j is a counter for columns, it goes through every column on the grid
				if (grid[i][j] == grid[i + 1][j] && grid[i + 1][j] == grid[i + 2][j] && grid[i + 2][j] == grid[i + 3][j] && grid[i][j] != 0) { //If 4 in a vertical row are equal
					if (grid[i][j] == 1) { //If one of the 4 in a row is a 1 (red)
						return 1; //Red wins!
					}
					if (grid[i][j] == 2) { //If one of the 4 in a row is a 2
						return 2; //Yellow wins!
					}
				}
			}
		}
		return 0; //If there are 4 0s (blank) are in a vertical row or if there are no 4 in a vertical row
	}

	/**
	 * This method checks if there are 4 of the same colour/number in a row diagonally top left to bottom right or bottom left to top right. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces. <br>
	 * @return 1 if there are 4 reds (1s) in a row, 2 if there are 4 yellows (2s) in a row, and 0 if there are no 4 in a row of either colour.
	 */
	public static int diagonalWin(int[][] grid) {
		//Top left to bottom right diagonal
		for (int i = 0; i < 3; i++) { //i is the counter for rows, it only counts to 3 since there are only 3 possible rows (vertically) for a diagonal 4 in a row
			for (int j = 0; j < 4; j++) { //j is the counter for columns, it only counts to 4 since there are only 4 possible columns (horizontally) for a diagonal 4 in a a row
				if (grid[i][j] == grid[i + 1][j + 1] && grid[i + 1][j + 1] == grid[i + 2][j + 2] && grid[i + 2][j + 2] == grid[i + 3][j + 3]) { //If there are 4 in a row diagonally top left to bottom right
					if (grid[i][j] == 1) { //If one of the 4 in a row is a 1 (red)
						return 1; //Red wins!
					}
					if (grid[i][j] == 2) { //If one of the 4 in a row is a 2 (yellow)
						return 2; //Yellow wins!
					}
				}
			}
		}

		//Bottom left to top right diagonal
		for (int i = 0; i < 3; i++) { //i is the counter for rows, it only counts to 3 since there are only 3 possible rows (vertically) for a diagonal 4 in a row
			for (int j = 6; j > 2; j--) { //j is the counter for columns, it counts down from 6 to 3 since there are only 4 possible columns (horizontally) for a diagonal 4 in a a row, it starts by checking on the left side (index 6)
				if (grid[i][j] == grid[i + 1][j - 1] && grid[i + 1][j - 1] == grid[i + 2][j - 2] && grid[i + 2][j - 2] == grid[i + 3][j - 3]) { //If there are 4 in a row bottom left to top right
					if (grid[i][j] == 1) { //If one of the 4 in a row is a 1 (red)
						return 1; //Red wins!
					}
					if (grid[i][j] == 2) { //If one of the 4 in a row is a 2 (yellow)
						return 2; //Yellow wins!
					}
				}
			}
		}
		return 0; //If there are 4 0s (blank) are in a diagonal row either direction, or if there are no 4 in a diagonal row either direction
	}

	/**
	 * This method checks if the player entered a number in the range (inclusive) of 1-7, since there are only 7 columns. <br>
	 * @param column - the column that the user entered
	 * @return true if the player entered a number in the range of 1-7, false if the player entered a number not in the range of 1-7 (eg 0, 8).
	 */
	public static boolean correctColumn(int column) {
		if (column > 0 && column < 8) { //Since column is the number the player entered, it they entered a number that is a column (in the range of 1-7)
			return true; //They entered a correct column
		}
		else { //If the player entered a number that doesn't represent a column (not in the range of 1-7)
			return false; //They entered an incorrect column
		}
	}

	/**
	 * This method goes through all of the spots in the array, and checks the values in all of them to determine if it is full or not. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces. <br>
	 * @return true if the board is full, and false if the board isn't full yet.
	 */
	public static boolean fullBoard(int[][] grid) {
		boolean full = false;
		for (int i = 0; i < 6; i++) { //i counts columns, it goes through all 7 of the columns
			for (int j = 0; j < 7; j++) { //j counts rows, it goes through all 6 of the rows
				if (grid[i][j] == 0) { //If there is a 0 stored in the spot being checked, the board is for sure not full, so it will exit the loops and return false
					return false;
				}
				else { //If there isn't a 0 in the spot being checked (there is a 1 or 2), the loop will keep going
					full = true; //If there is never a 0 (blank) found on the grid, full will equal true, meaning the board is full
				}
			}
		}
		return full;
	}

	/**
	 * This method goes through all of the spots in the inputed column, and checks the values to determine if it is full or not. <br>
	 * @param grid - the array of numbers that represent the coloured game pieces. <br>
	 * @return true if the column is not full yet, false if the board is full.
	 */
	public static boolean fullColumn(int[][] grid, int column) {
		if (grid[0][column - 1] == 0) { //To be efficient, this only checks if the column the player is trying to enter is full
			return false; //If the highest spot (index 0 for rows) in the column the player entered (-1, since indexes are 1 less) is empty (stores a 0), the column is not full, so the player can place their game piece there
		}
		return true; //If the highest spot in the column the player entered is not empty (stores a 1 or 2), the column is full, so the player will have to try to enter another column
	}

	/**
	 * This method goes through all of the spots in the array and takes all of the 1 and 2 values out of the array <br>
	 * @param grid - the array of numbers that represent the coloured game pieces.
	 */
	public static void clearBoard(int[][] grid) {
		for (int i = 0; i < 6; i++) { //i counts rows, and goes through all of them to clear the entire grid
			for (int j = 0; j < 7; j++) { //j counts columns, and goes through all of them to clean the entire grid
				grid[i][j] = 0; //a 0 (empty spot) will be placed in every spot in the grid
			}
		}
	}
}
