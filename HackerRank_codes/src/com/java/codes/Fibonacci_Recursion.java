package com.java.codes;

public class Fibonacci_Recursion {
	
	public static void fibbonacci(int a, int b, int n) {
		if(n==0) {
			return;
		}
		int c = a+b;
		System.out.print(c + " ");
		fibbonacci(b,c,n-1);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =0;
		int b=1;
		int n =7;
		System.out.print(a + " ");
		System.out.print(b + " ");
		fibbonacci(a,b,n-2);

	}

}
