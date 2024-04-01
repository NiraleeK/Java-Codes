package com.java.codes;
import java.util.*;
public class No_of_1_in_BinarNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int count =0;
		
		while(num !=0) {
			if((num & 1) == 1) {
				count ++;
			}
			num >>=1;
		}
		System.out.println(count);

	}

}
