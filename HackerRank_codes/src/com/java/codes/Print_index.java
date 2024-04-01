package com.java.codes;

import java.util.Scanner;

public class Print_index {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the size of the array");
		int size = scanner.nextInt();
		int number[] = new int[size];
		
		for(int i=0;i<size;i++) {
			number[i] = scanner.nextInt();
		}
		System.out.println("Please enter the number that you want to find the index of:");
		int findNumber = scanner.nextInt();
		for(int i=0;i<number.length;i++) {
			if(number[i] == findNumber) {
				System.out.println(i);
			}
		}
	}

}
