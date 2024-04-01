package com.java.codes;
import java.util.*;

public class Odd_Even_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int a = scanner.nextInt();
		
		if(a%2 ==0) {
			System.out.println("The number is EVEN");
		}else {
			System.out.println("The number is ODD");
		}
	}

}
