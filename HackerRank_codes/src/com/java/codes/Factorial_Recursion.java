package com.java.codes;

public class Factorial_Recursion {
	
	public static int calcFactorial(int n) {
		if(n==1 || n==0) {
			return 1;
		}
		int fact_nm1 = calcFactorial(n-1);
		int fac_n = n* fact_nm1;
		return fac_n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int ans =calcFactorial(n);
		System.out.println(ans);
		
	}

}
