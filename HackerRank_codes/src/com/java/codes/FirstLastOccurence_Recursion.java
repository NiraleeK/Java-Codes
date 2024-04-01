package com.java.codes;

public class FirstLastOccurence_Recursion {
	
	public static int first = -1;
	public static int last =-1;
	
	
	public static void firstLastOccurence (String str, int index, char element) {
		
		if(str.length() == index ) {
			System.out.println(first);
			System.out.println(last);
			return;
		}
		
		
		if(str.charAt(index) == element) {
			if(first == -1) {
				first = index;
			}else {
				last = index;
			}
		}
		firstLastOccurence (str, index+1, element);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abaacdaefaahh";
		firstLastOccurence(str,0,'a');
	}

}
