package com.java.codes;

public class Bit_Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int pos =1;
		
		int oper = 1; //update bit to 1 else update bit to 0
		
		int bitMask = 1 << pos;
		
		if((bitMask & n) == 0) {
			System.out.println("The bit at position 2 is zero");
		}else {
			System.out.println("The bit at position 2 is one");
		}
		
		//setting a new bit
		int newnumber = bitMask | n;
		System.out.println(newnumber);
		
		//clearing a bit
		int notBitmask = ~(bitMask);
		int newNum = notBitmask & n;
		System.out.println(newNum);
		
		//updating a bt
		
		int number = bitMask | n;
		System.out.println(number);
		

	}

}
