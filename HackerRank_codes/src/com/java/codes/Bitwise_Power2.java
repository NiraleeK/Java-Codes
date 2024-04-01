package com.java.codes;
import java.util.*;

public class Bitwise_Power2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the number of which you want to find the power");
		int number = sc.nextInt();
		int bit = number-1;
		
		if((number & bit) == 0) {
			System.out.println("The number is power of 2");
			
		}else {
			System.out.println("The number is not power of 2");
		}

	}

}
