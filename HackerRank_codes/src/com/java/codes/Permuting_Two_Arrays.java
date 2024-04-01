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

class Permuting {

    /*
     * Complete the 'twoArrays' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     *  3. INTEGER_ARRAY B
     */

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
	
    	Collections.sort(A);
    	Collections.sort(B);
    	for(int i=0;i<A.size();i++) {
    		if(A.get(i) + B.get(A.size()-1-i) < k) {
    			return "NO";
    		}
    	}
    	
    	return "YES";
    

    }

}

public class Permuting_Two_Arrays {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter the number of test cases: ");
    	int q = scanner.nextInt();
    	scanner.nextLine(); // Consume newline

    	for (int qItr = 0; qItr < q; qItr++) {
    	    System.out.print("Enter the size of arrays A and B (separated by space): ");
    	    String[] firstMultipleInput = scanner.nextLine().split(" ");

    	    int n = Integer.parseInt(firstMultipleInput[0]);
    	    int k = Integer.parseInt(firstMultipleInput[1]);

    	    System.out.print("Enter elements of array A separated by spaces: ");
    	    List<Integer> A = Arrays.stream(scanner.nextLine().split(" "))
    	                            .map(Integer::parseInt)
    	                            .collect(Collectors.toList());

    	    System.out.print("Enter elements of array B separated by spaces: ");
    	    List<Integer> B = Arrays.stream(scanner.nextLine().split(" "))
    	                            .map(Integer::parseInt)
    	                            .collect(Collectors.toList());

    	    String result = Permuting.twoArrays(k, A, B);
    	    System.out.println("Result for Test Case " + (qItr + 1) + ": " + result);
    	}

    	scanner.close();
    	}
}
