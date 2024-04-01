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



/*Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. 
Then print the respective minimum and maximum values as a single line of two space-separated long integers.*/

class Min {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     * 
     * input : 7 69 2 221 8974
     * output : 299 9271
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    	
    	long minSum = Long.MAX_VALUE;
    	long maxSum = Long.MIN_VALUE;
    	
    	for(int i =0;i<arr.size();i++) {
    		long sum =0;
    		for(int j=0;j<arr.size();j++) {
    			if(j!=i) {
    				sum += arr.get(j);
    			}
    		}
    		System.out.println(i + " " + sum);
    		minSum = Math.min(minSum, sum);
    		maxSum = Math.max(maxSum, sum);
    		
    	}
    	
    	System.out.println(minSum +" " + maxSum);
    }

}

public class Min_Max_Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Min.miniMaxSum(arr);

        bufferedReader.close();
    }
}
