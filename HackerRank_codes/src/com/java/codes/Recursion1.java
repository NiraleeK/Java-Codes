package com.java.codes;

public class Recursion1 {
	
	public static void printSum(int i, int n, int sum) {
		if(i==n) {
			sum = sum +i;
			System.out.println(sum);
			return;
		}
		sum += i;
		printSum(i+1, n, sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSum(1,5,0);
		

	}

}
