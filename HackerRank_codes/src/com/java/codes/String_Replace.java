package com.java.codes;
import java.util.*;

public class String_Replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
	
		String str = sc.next();
		
		String result = "";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'e') {
				result += 'i';
				}else {
					result = result + str.charAt(i);
				}
		}
		
		System.out.println(result);
	}

}
