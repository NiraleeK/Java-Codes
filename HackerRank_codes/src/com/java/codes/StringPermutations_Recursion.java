package com.java.codes;

public class StringPermutations_Recursion {
	
	public static void printPerm(String str, String permutation) {
		if(str.length()==0) {
			System.out.println(permutation);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			char currentChar = str.charAt(i);
			String newStr = str.substring(0,i) + str.substring(i+1);
			printPerm(newStr, permutation + currentChar);
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		printPerm(str,"");

	}

}
