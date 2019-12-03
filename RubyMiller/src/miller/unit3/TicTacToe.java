package miller.unit3;

import java.util.Scanner;

/**TicTacToe.java <p>
 * This program simulates a tic tac toe game on a 3 by 3 board. There are 2 players that take turns, one is X and the other is O. <br>
 * It first asks player 1 what row and column they want to enter their X. It checks if there is already something in those coordinates, if not it enters the X there. <br>
 * After the X is entered, it prints the 3 by 3 grid with the X in the spot. <br>
 * The program then checks using for loops, if there are 3 in a row horizontally, vertically, and both diagonal ways. <br>
 * If there are 3 Xs in a row anywhere, the variable win is 1, if there are 3 Os in a row anywhere, the variable win is 2. <br>
 * If nobody has won yet, and the board isn't full, the loop will repeat again, but this time for O. <br>
 * There is a larger loop that repeats every 2 times the inner loop repeats, one repeat in the larger loop goes through X and O once. <br>
 * The outer loop will continue until somebody wins or the board is full. <br>
 * Once somebody wins or the board is full, the loop will end and the winner will be printed (if win is 0, it's a tie, if it's 1, X wins, and if it's 2, O wins. <p>
 * November 26, 2019
 * @author Ruby Miller
 */

public class TicTacToe {

	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Declaring variables
		Scanner sc = new Scanner(System.in);
		char [][] grid = new char[3][3]; //This array will hold 9 variables, 3 rows and 3 columns
		int row; //This is the row where the X or O will be placed, it will change every time the loop repeats
		int column; //This is the column where the X or O will be placed, it changes every time the loop repeats
		int counter = 0; //This counts how many X and Os were inputed, the loop will stop once all 9 places are filled
		int d = 0;
		int e = 0;
		char xOrO = 'x'; //This variable will switch from X to O over and over
		int player = 1; //This variable will switch back and forth from 1 and 2
		int win = 0; //1 = X wins, 2 = O wins, 0 = tie
		System.out.println("Player 1 is X, and player 2 is O.");
		System.out.println();

		//Inputting placements of Xs and Os
		while (win == 0 && counter < 9){ //This loop will continue until somebody wins, or if the board is full
			xOrO = 'X';
			player = 1;
			d = 0;

			for (d = 0; d < 2 && counter < 9 && win == 0; d++){ //This loop continues until the board is full or somebody wins, it also only repeats twice each time
				e = 0; //This sets the counter to 0 every time the for loop repeats
				while (e < 1) { //This loop will only repeat if the user entered coordinates that already hold an X or O
					System.out.println("Player " + player + ", which row do you want to place your " + xOrO + "?");
					row = sc.nextInt() - 1; //This will store the number the user enters (eg. The user wants the fist row, but the index will actually be 0)
					System.out.println("Which column?");
					column = sc.nextInt() - 1; //This is the same as the row, but for a column
					if (grid[row][column] == ('X') || grid[row][column] == ('O')) { //Determining if there is an X or O in the spot the user entered
						System.out.println("There is already something in that spot, enter your coordinates again"); //If there is, e will stay 0, so the user will be asked for different coordinates
					}
					else { //If there is no X or O in the spot the user entered,
						grid[row][column] = xOrO; //If there is no X or O in the spot the user entered,
						e++; //This will end the loop if the spot where the user is inputing is empty
					}
				}

				//Printing the board in a 3 by 3 grid
				System.out.printf("%-2s %-2s %-2s", grid[0][0], grid[0][1], grid[0][2]);
				System.out.println();
				System.out.printf("%-2s %-2s %-2s", grid[1][0], grid[1][1], grid[1][2]);
				System.out.println();
				System.out.printf("%-2s %-2s %-2s", grid[2][0], grid[2][1], grid[2][2]);
				System.out.println();

				//Calculating if there are three in a row horizontally
				for (int i = 0; i < 3; i++) { //This loop is counting the rows
					for (int j = 0; j < 3; j++) { //This loop is counting the columns
						if ((grid[i][0] == grid[i][1]) && (grid[i][1] == grid[i][2])) { //This tests if 3 in all of the rows are the same as each other
							if (grid[i][0] == 'X') { //If all 3 are Xs
								win = 1; //Win = 1, meaning X wins
							}
							else if (grid[i][0] == 'O') { //If all 3 are Os
								win = 2;  //Win = 2, meaning O wins
							}
						}
					}
				}

				//Calculating if there are three in a row vertically
				for (int k = 0; k < 3; k++){ //This loop counts rows
					for (int l = 0; l < 3; l++) { //This loop counts columns
						if ((grid[0][l] == grid[1][l]) && (grid[1][l] == grid[2][l])) { //This tests if 3 in all of the columns are the same as each other
							if (grid[0][l] == 'X') {
								win = 1;
							}
							if (grid[0][l] == 'O') {
								win = 2;
							}
						}
					}
				}

				//Calculating if there are 3 in a row diagonally top left to bottom right
				if ((grid[0][0] == grid[1][1]) && (grid[1][1] == grid[2][2])) { //This tests if the top left, middle, and bottom right are the same as each other
					if (grid[0][0] == 'X'){
						win = 1;
					}
					if (grid[0][0] == 'O'){
						win = 2;
					}
				}
				
				//Calculating if there are 3 in a row diagonally bottom left to top right
				if ((grid[2][0] == grid[1][1]) && (grid[1][1] == grid[0][2])) { //This tests if the bottom left, middle, and top right are the same as each other
					if (grid[2][0] == 'X') {
						win = 1;
					}
					if (grid[2][0] == 'O') {
						win  = 2;
					}
				}
				
				//Outputting who won (only if someone won at this point)
				if (win == 1) { //If 3 in a row anywhere are Xs, X wins
					System.out.println("Player 1 (X) wins!");
				}
				else if (win == 2) { //If 3 in a row anywhere are Os, O wins
					System.out.println("Player 2 (O) wins!");
				}

				xOrO = 'O'; //This changes which letter will be placed next, it sets it to O
				player = 2; //This changes it from player 1's turn to player 2's turn
				counter = counter + 1; //This adds 1 to the counter. the counter counts the amount of spaces filled (9 is the highest)
			}
			
		}

		//Outputting if it was a tie when the board is full
		if (win == 0) //If nobody won and the loop is finished, meaning the board is full, it is a tie
			System.out.println("It was a tie.");
	}
}