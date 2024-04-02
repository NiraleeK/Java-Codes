package com.java.codes;

public class PlaceTilesonFloor_Recurssion {

	public static int placeTiles(int n, int m) {
		
		if(n == m) {
			return 2;
		}
		if(n < m) {
			return 1;
		}
		
		//vertically
		int verticalPlacements = placeTiles(n-m,m);
		
		//horizontally
		int horizontalPlacements = placeTiles(n-1,m);
		
		int totalPlacements = verticalPlacements + horizontalPlacements;
		return totalPlacements;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4, m=2;
		System.out.println(placeTiles(n,m));
		

	}

}
