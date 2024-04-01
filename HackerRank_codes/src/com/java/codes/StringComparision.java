package com.java.codes;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Starry";
		String s2 = "Starry1";
		int nmber = 123;
		String str = Integer.toString(nmber);
		System.out.println(str);
		
		if(s1.compareTo(s2) == 0) {
			System.out.println("The Strings are equal");
		
		}else {
			System.out.println("The Strings are not equal");
		}
	}

}
