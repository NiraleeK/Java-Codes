package com.java.codes;

public class MaizePath_Recursion {

	
	public static int countPaths(int i, int j, int n, int m) {
		if(i ==n || j==m) {
			return 0;
		}
		if(i == n-1 && j == m-1) {
			return 1;
		}
		//move downwards
		int downPaths = countPaths(i+1, j , n,m);
		//move right
		int rightPaths = countPaths(i,j+1,n,m);
		int totalPaths = downPaths + rightPaths;
		return totalPaths;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n =3 , m=4;
		System.out.println(countPaths(0,0,n,m));

	}

}
