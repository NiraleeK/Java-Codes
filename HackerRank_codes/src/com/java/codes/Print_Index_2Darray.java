package com.java.codes;
import java.util.*;

public class Print_Index_2Darray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Please enter the number of rows ");
		int row = sc.nextInt();
		System.out.println("Please enter the number of columns ");
		
		int colm = sc.nextInt();
		int[][] numbers = new int[row][colm];
		
		for(int i=0;i<row;i++) {
			for(int j =0;j<colm;j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the number that index you want to search");
		int x = sc.nextInt();
		for(int i =0;i<row;i++) {
			for(int j=0;j<colm;j++) {
				if(numbers[i][j] == x) {
					System.out.println("Number found at location:" + i +"," + j);
				}
			}
		}

	}

}
