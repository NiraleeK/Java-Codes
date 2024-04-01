package com.java.codes;
import java.util.*;

public class Table_of_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of which you want table:");
		
		int input = scanner.nextInt();
		
		for(int i =1;i<=12;i++) {
			int a = input * i;
			System.out.println( input + "x" +i +"=" + a);
		}

	}

}
