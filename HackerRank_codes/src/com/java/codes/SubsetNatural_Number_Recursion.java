package com.java.codes;

import java.util.ArrayList;

public class SubsetNatural_Number_Recursion {
	
	public static void findSubsets(int n, ArrayList<Integer> subsets) {
		
		if(n==0) {
			printSubset(subsets);
			return;
		}
		subsets.add(n);
		findSubsets(n-1, subsets);
		
		subsets.remove(subsets.size()-1);
		findSubsets(n-1, subsets);
		
	}

	private static void printSubset(ArrayList<Integer> subsets) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<subsets.size();i++) {
			System.out.print(subsets.get(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		ArrayList<Integer> subsets = new ArrayList<>();
		
		findSubsets(n, subsets);  

	}

}
