package com.java.codes;
import java.util.*;

public class Bitwise_Toggle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Enter the postion bit that you want to toogle");
		int pos = sc.nextInt();
		
		int bitMask = 1<<pos;
		
		int number = bitMask ^ n;
		System.out.println(number);
		
		
		

	}

}
