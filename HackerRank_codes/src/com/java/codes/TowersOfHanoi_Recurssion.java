package com.java.codes;

public class TowersOfHanoi_Recurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =3;
		towerOfHanoi(n, "s", "H", "D");

	}
	public static void towerOfHanoi(int n , String src, String helper, String destination) {
		
		if(n ==1) {
			System.out.println("Transfeer disk " + n + " from " + src +" to " + destination);
			return;
		}
		//transferring n-1 disk to helper so destination will be helper
		towerOfHanoi(n-1, src, destination, helper);
		System.out.println("Transfeer disk " + n + " from " + src +" to " + destination);
		towerOfHanoi(n-1, helper, src, destination);
		
	}

}
