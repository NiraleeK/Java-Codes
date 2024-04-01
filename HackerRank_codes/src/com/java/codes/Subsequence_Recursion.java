package com.java.codes;

import java.util.HashSet;

public class Subsequence_Recursion {
	
	public static void subSequences(String str, int index, String newString, HashSet<String> set) {
		if(index == str.length()) {
			if(set.contains(newString)) {
				return;
			}else {
				System.out.println(newString);
				set.add(newString);
				return;
			}
			
		}
		char current = str.charAt(index);
		subSequences(str, index+1, newString +current, set);
		subSequences(str, index+1, newString,set);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaa";
		HashSet<String> set = new HashSet<>();
		subSequences(str, 0,"", set);
	}

}
