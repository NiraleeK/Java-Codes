package com.java.codes;

import java.util.Scanner;

public class Factorial_Nummber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		printFactorial(number);

	}
	
	public static void printFactorial(int n) {
		int factorial =1;
		for(int i =n;i>=1;i--) {
			factorial = factorial*i;
			
		}
		System.out.println(factorial);
		return;
	}

}
