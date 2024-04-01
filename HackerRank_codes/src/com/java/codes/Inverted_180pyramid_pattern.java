
package com.java.codes;

public class Inverted_180pyramid_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =4;
		for(int i =1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j =1;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
