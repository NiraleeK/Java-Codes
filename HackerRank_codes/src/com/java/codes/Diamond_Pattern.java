package com.java.codes;

public class Diamond_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i =1;i<=n;i++) {
			int space = n-i;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j =1;j<= 2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =n;i>=1;i--) {
			int space = n-i;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j =1;j<= 2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
