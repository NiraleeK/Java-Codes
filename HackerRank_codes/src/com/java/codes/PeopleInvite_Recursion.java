package com.java.codes;

public class PeopleInvite_Recursion {

	public static int callGuest(int n) {
		if(n <= 1) {
			return 1;
		}
		
		int waySingle = callGuest(n-1);
		int waysDouble = (n-1) * callGuest(n-2);
		int totalWays = waySingle + waysDouble;
		return totalWays;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =4;
		System.out.println(callGuest(n));

	}

}
