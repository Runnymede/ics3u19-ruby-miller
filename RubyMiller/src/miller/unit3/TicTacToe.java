package miller.unit3;

import java.util.Scanner;

/**TicTacToe.java <p>
 * This program 
 * November 26, 2019
 * @author Ruby Miller
 */

public class TicTacToe {

	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaring variables and getting input from the user
		Scanner sc = new Scanner(System.in);
		char [][] grid = new char[3][3];
		int row;
		int column;
		int counter = 0;
		int d = 0;
		int e = 0;
		char xOrO = 'x';
		int player = 1;
		int win = 0; //1 = X wins, 2 = O wins, 3 = tie
		System.out.println("Player 1 is X, and player 2 is O.");
		System.out.println();

		//Inputting placements of Xs and Os
		while (win == 0){
			xOrO = 'X';
			player = 1;
			d = 0;

			for (d = 0; d < 2 && counter < 9; d++){
				e = 0;
				while (e < 1) {
					System.out.println("Player " + player + ", which row do you want to place your " + xOrO + "?");
					row = sc.nextInt() - 1;
					System.out.println("Which column?");
					column = sc.nextInt() - 1;
					if (grid[row][column] == ('X') || grid[row][column] == ('O')) {
						System.out.println("There is already something in that spot, enter your coordinates again");
					}
					else {
						grid[row][column] = xOrO;
						e++;
					}
				}

				System.out.printf("%-2s %-2s %-2s", grid[0][0], grid[0][1], grid[0][2]);
				System.out.println();
				System.out.printf("%-2s %-2s %-2s", grid[1][0], grid[1][1], grid[1][2]);
				System.out.println();
				System.out.printf("%-2s %-2s %-2s", grid[2][0], grid[2][1], grid[2][2]);
				System.out.println();

				//Calculating if there are three in a row horizontally
				for (int i = 0; i < 3; i++) {
					for (int j = 0; j < 3; j++) {
						if ((grid[i][0] == grid[i][1]) && (grid[i][1] == grid[i][2])) {
							if (grid[i][0] == 'X') {
								win = 1;
							}
							else if (grid[i][0] == 'O') {
								win = 2;
							}
						}
					}
				}
				//Calculating if there are three in a row vertically
				for (int k = 0; k < 3; k++){
					for (int l = 0; l < 3; l++) {
						if ((grid[0][l] == grid[1][l]) && (grid[1][l] == grid[2][l])) {
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
				if ((grid[0][0] == grid[1][1])) {
					if (grid[1][1] == grid[2][2]) {
						if (grid[0][0] == 'X'){
							win = 1;
						}
						if (grid[0][0] == 'O'){
							win = 2;
						}
					}
				}
				//Calculating if there are 3 in a row diagonally bottom left to top right
				if ((grid[2][0] == grid[1][1]) && (grid[1][1] == grid[0][2])) {
					if (grid[2][0] == 'X') {
						win = 1;
					}
					if (grid[2][0] == 'O') {
						win  = 2;
					}
				}
				//Outputting who won (only if someone won at this point)
				if (win == 1) {
					System.out.println("Player 1 (X) wins!");
				}
				else if (win == 2) {
					System.out.println("Player 2 (O) wins!");
				}

				xOrO = 'O';
				player = 2;
				counter = counter + 1;
				}
			}
		
		//Outputting if it was a tie when the board is full
		if (win == 0)
			System.out.println("It was a tie.");
	}
}







