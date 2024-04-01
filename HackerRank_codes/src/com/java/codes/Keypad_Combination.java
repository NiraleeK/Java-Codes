package com.java.codes;

public class Keypad_Combination {

	public static String[] keypad = {"." , "abc", "def", "ghi", "jkl","mno","pqrs", "tu", "vwx","yz"};
	
	public static void printCombinations(String str, int index, String combination) {
		if(index == str.length()) {
			System.out.println(combination);
			return;
		}
		char currentchar = str.charAt(index);
		
		String mapping = keypad[currentchar - '0'];
		
		for(int i=0;i<mapping.length();i++) {
			printCombinations(str, index+1, combination + mapping.charAt(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "4";
		printCombinations(str, 0,"");

	}

}
