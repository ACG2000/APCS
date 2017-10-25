package GoalSheet4;

import java.io.IOException;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		char board[][] = new char[3][3];
		boolean win = false;
		boolean ledgitCoord =  true;
		int turns = 0;
		int coordX = 0;
		int coordY = 0;
		
		init(board);
		
		while (turns < 9 || !win) {
			display(board);
			
			System.out.println("X's Turn: ");
			while (!ledgitCoord) {
				System.out.println("X: ");
				coordX = scanner.nextInt();
				System.out.println("Y: ");
				coordY = scanner.nextInt();
				if(board[coordX][coordY] == '*') {
					ledgitCoord = true;
				}
			}
			addCoord('x', coordX,  coordY, board);
			display(board);
			if(checkWin('X', board)) {
				win = true;
				System.out.println("Congratulations 'X',  you Win!");
				break;
			}
			
			System.out.println("O's Turn: ");
			while (!ledgitCoord) {
				System.out.println("X: ");
				coordX = scanner.nextInt();
				System.out.println("Y: ");
				coordY = scanner.nextInt();
				if(board[coordX][coordY] == '*') {
					ledgitCoord = true;
				}
			}
			addCoord('o', coordX,  coordY, board);
			if(checkWin('O', board)) {
				win = true;
				System.out.println("Congratulations 'O',  you Win!");
				break;
			}
			
		}
		
	}
	
	public static void init(char board[][]) {
		for(int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				board[i][j] = '*';
			}
		}
	}
	public static char[][] addCoord(char player,  int coordX, int coordY, char board[][]) {
		if(player == 'x') {
			board[coordX][coordY] = 'X';
		}
		else if(player == 'o') {
			board[coordX][coordY] = 'O';
		}
		return board;
	}
	public static void display(char board[][]) {
		for(int i = 0; i < board.length; i++) {		
			for (int j = 0; j < board.length; j++) {
				System.out.print("|" + board[i][j]);
			}
			System.out.println("|");
		}
	}
	public static boolean checkWin(char player, char board[][]) {
		boolean win = false;
		
		if(board[0][0] == player && board[0][1] == player && board[0][2] == player) win = true;
		if(board[1][0] == player && board[1][1] == player && board[1][2] == player) win = true;
		if(board[2][0] == player && board[2][1] == player && board[2][2] == player) win = true;
		if(board[0][0] == player && board[1][0] == player && board[2][0] == player) win = true;
		if(board[0][1] == player && board[1][1] == player && board[2][1] == player) win = true;
		if(board[0][2] == player && board[1][2] == player && board[2][2] == player) win = true;
		if(board[0][0] == player && board[1][1] == player && board[2][2] == player) win = true;
		if(board[2][0] == player && board[1][1] == player && board[0][2] == player) win = true;
		return win;
	}

}
