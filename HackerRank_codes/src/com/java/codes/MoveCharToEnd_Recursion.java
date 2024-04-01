package com.java.codes;

public class MoveCharToEnd_Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "axbcxxd";
		moveAllX(str,0,0,"");

	}
	
	public static void moveAllX(String str, int index, int count, String newString) {
		
		
		if(index == str.length()) {
			for(int i=0;i<count;i++) {
				newString +='x';
			}
			System.out.print(newString);
			return;
		}
		char current = str.charAt(index);
		if(str.charAt(index) == 'x') {
			count ++;
			moveAllX(str, index+1, count, newString);
		}else {
			newString += current;
			moveAllX(str, index+1, count, newString);
		}
		
	}

}
