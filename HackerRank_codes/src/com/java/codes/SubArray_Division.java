package com.java.codes;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class SubArray {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
		int sizee = s.size();
		int sum = 0;
		int count =0;
		
		for(int i =0;i<sizee-m+1;i++) {
			sum =0 ;
			for(int j =0;j<m;j++) {
				sum += s.get(i+j);
				}
			if(sum == d) {
				count ++;
			}
		
		}
		
		
    	return count;

    }

}

public class SubArray_Division {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter the number of integers in the list: ");
    	int n = scanner.nextInt();
    	scanner.nextLine(); // Consume newline

    	System.out.println("Enter the list of integers separated by spaces:");
    	List<Integer> s = Arrays.stream(scanner.nextLine().split(" "))
    	                        .map(Integer::parseInt)
    	                        .collect(Collectors.toList());

    	System.out.print("Enter the day and month (separated by space): ");
    	String[] firstMultipleInput = scanner.nextLine().split(" ");
    	int d = Integer.parseInt(firstMultipleInput[0]);
    	int m = Integer.parseInt(firstMultipleInput[1]);

    	int result = SubArray.birthday(s, d, m);
    	System.out.println("Result: " + result);

    	scanner.close();
    }
}

