package com.java.array;

public class ValidSudokuLeetcodeM36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] board = {{"5","3",".",".","7",".",".",".","."}
						   ,{"6",".",".","1","9","5",".",".","."}
						   ,{".","9","8",".",".",".",".","6","."}
					   	   ,{"8",".",".",".","6",".",".",".","3"}
						   ,{"4",".",".","8",".","3",".",".","1"}
						   ,{"7",".",".",".","2",".",".",".","6"}
						   ,{".","6",".",".",".",".","2","8","."}
						   ,{".",".",".","4","1","9",".",".","5"}
						   ,{".",".",".",".","8",".",".","7","9"}};
		boolean isValidSudoku = isValidSudoku(board);
		System.out.println("isValidSudoku:"+isValidSudoku);
	}

	private static boolean isValidSudoku(String[][] board) {
		// TODO Auto-generated method stub
		for(int i =0; i< board.length;i++) {
			for(int j =0; j< board[i].length;j++) {
				System.out.print(board[i][j]);
			}	
			System.out.println();
		}
		return false;
	}
}
