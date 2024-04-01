package com.java.codes;

public class CheckSortedArray_Recursion {
	
	
	public static boolean sortArray(int[] arr, int index) {
		if(index == arr.length-1) {
			return true;
		}
		if(arr[index] < arr[index +1]) {
			return sortArray(arr, index+1);
		}
		else {
			return false;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,3,5};
		System.out.println(sortArray(arr, 0));

	}

}
