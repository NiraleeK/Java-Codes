package com.java.codes;

public class PrintStringReverse_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "abcd";
		printReverse(str , str.length()-1);
		

	}
	
	public static void printReverse(String str, int index) {
		if(index == 0) {
			System.out.print(str.charAt(index));
			return;
		}
		
		System.out.print(str.charAt(index));
		printReverse(str, index-1);
	}

}
