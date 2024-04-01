package com.java.codes;
import java.util.*;

public class Cumulative_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of Strings");
		int size = scanner.nextInt();
		String[] str = new String[size];
		int count =0;
		
		for(int i=0;i< str.length;i++) {
			str[i] = scanner.next();
			count += str[i].length();
		}
		
		System.out.println(count);

	}

}
