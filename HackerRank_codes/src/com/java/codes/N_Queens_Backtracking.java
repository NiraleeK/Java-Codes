package com.java.codes;

import java.util.ArrayList;
import java.util.List;

public class N_Queens_Backtracking {
	
	public boolean isSafe(int row, int col, char[][] board) {
		//horizontal check
		for(int j=0; j<board.length;j++) {
			if(board[row][j] == 'Q') {
				return false;
			}
		}
		
		//vertical check
		for(int i=0;i<board.length;i++) {
			if(board[i][col] == 'Q') {
				return false;
			}
		}
		//upper left check
		
		for(int c =col, r = row; c>=0 && r>=0; c--, r--) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		
		//upper right
		
		for(int c = col, r = row; c<board.length && r>=0; r--,c++) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		
		//lower left
		
		for(int c = col, r = row; c>=0 && r<board.length; r++,c--) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		//lower right
		
		for(int c =col, r = row; c<board.length && r<board.length; r++,c++) {
			if(board[r][c] == 'Q') {
				return false;
			}
		}
		return true;
	}
	
	public void helper(char[][] board, List<List<String>> allboard, int col) {
		if(col == board.length) {
			saveBoard(board, allboard);
			return;
		}
		for(int row=0; row<board.length; row++) {
			if(isSafe(row,col,board)) {
				board[row][col] = 'Q';
				helper(board, allboard, col+1);
				board[row][col] = '-';
			}
		}
		
	}
	
	
	private void saveBoard(char[][] board, List<List<String>> allboard) {
		// TODO Auto-generated method stub
		String row = "";
		List<String> newboard = new ArrayList<>();
		
		for(int i=0; i <board.length;i++) {
			row = "";
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j] =='Q') {
					row +='Q';
				}
				else {
					row += '.';
				}
				
			}
			newboard.add(row);
		}
		allboard.add(newboard);
	}

	public List<List<String>> solvenQueens(int n){
		
		List<List<String>> allboard = new ArrayList<>();
		char[][] board = new char[n][n];
		helper(board,allboard , 0);
		return allboard;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		N_Queens_Backtracking solver = new N_Queens_Backtracking();
	    int n = 4; // Set the number of queens
	    List<List<String>> solutions = solver.solvenQueens(n);
	    
	    // Print the solutions
	    for (List<String> solution : solutions) {
	        for (String row : solution) {
	            System.out.println(row);
	        }
	        System.out.println();
	    }
	}
}

	



