package com.java.codes;

public class Recurssion_xn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stack height = n
		
		int x =2;
		int n=5;
		int ans = calPower(x,n);
		System.out.println(ans); 	
		

	}
	//stack height = n
	public static int powerx(int x, int n) {
		
		if(n==0 ) {return 1;}
		if(x==0) {return 0;}
		int xpoenm1 = powerx(x,n-1);
		int xpown = x * xpoenm1;
		
		return xpown;
	}
	
	//stack height = logn
	public static int calPower (int x , int n) {
		if(n==0 ) {return 1;}
		if(x==0) {return 0;}
		if(n % 2 ==0) {
			return calPower(x , n/2) * calPower(x , n/2);
		}else {
			return calPower(x , n/2) * calPower(x , n/2) * x ;
		}
	}

}
