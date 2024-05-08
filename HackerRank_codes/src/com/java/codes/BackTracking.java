package com.java.codes;

public class BackTracking {
	
	public static void permutation(String str, String perm, int index) {
		
		if(str.length()==0) {
			System.out.println(perm);
			return;
		}
		for(int i=0; i< str.length();i++) {
			char currentchar = str.charAt(i);
			String newString = str.substring(0,i) + str.substring(i+1); 
			
			permutation(newString, perm + currentchar, index+1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "ABC";
		permutation(str, "", 0);
	}

}
