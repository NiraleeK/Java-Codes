package com.java.codes;
import java.util.*;

public class SpiralOrder_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	      int n = sc.nextInt();
	      int m = sc.nextInt();


	      int matrix[][] = new int[n][m];
	      for(int i=0; i<n; i++) {
	           for(int j=0; j<m; j++) {
	               matrix[i][j] = sc.nextInt();
	           }
	      }
	      
	      System.out.println("The Spiral Matrix is:");

	      int rowStart =0;
	      int columStart = 0;
	      int rowEnd =n-1;
	      int columEnd =m-1;
	      
	      while(rowStart <= rowEnd && columStart <= columEnd) {
	    	  for(int i = columStart; i<=columEnd;i++) {
	    		  System.out.print(matrix[rowStart][i] + "");
	    	  }
	    	  rowStart++;
	    	  
	    	  for(int i=rowStart; i<=rowEnd;i--) {
	    		  System.out.print(matrix[i][columEnd] +" ");

	    	  }
	    	  columEnd--;
	    	  
	    	  for(int col=columEnd; col>=columStart; col--) {
	              System.out.print(matrix[rowEnd][col] + " ");
	          }
	          rowEnd--;
	          
	          for(int row=rowEnd; row>=columStart; row--) {
	              System.out.print(matrix[row][columStart] + " ");
	          }
	          columStart++;


	          System.out.println();

	      }
	      
	}

}
