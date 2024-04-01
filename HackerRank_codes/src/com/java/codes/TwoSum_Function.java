package com.java.codes;

import java.util.Scanner;

public class TwoSum_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 int sum = twoNumberSum(a,b);
		 System.out.println(sum);
		 
		

	}
	
	public static int twoNumberSum(int a, int b) {
		int sum = a+b;
		
		return sum;
	}

}
