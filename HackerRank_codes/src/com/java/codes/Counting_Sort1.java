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

class Counting {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    	List<Integer> finalList =  new ArrayList<Integer>(Collections.nCopies(100, 0));
        for(int i=0;i<arr.size();i++){
                int tmp = arr.get(i);
                finalList.set(tmp, finalList.get(tmp)+1);
        }
        return finalList;

    }

}

public class Counting_Sort1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);

    	System.out.print("Enter the number of integers: ");
    	int n = scanner.nextInt();
    	scanner.nextLine(); // Consume newline

    	System.out.println("Enter the integers separated by spaces:");
    	String[] integerStrings = scanner.nextLine().split(" ");
    	List<Integer> arr = new ArrayList<>();
    	for (String numStr : integerStrings) {
    	    arr.add(Integer.parseInt(numStr));
    	}

    	List<Integer> result = Counting.countingSort(arr);

    	for (int num : result) {
    	    System.out.print(num + " ");
    	}
    	System.out.println(); // Move to the next line

    	scanner.close();
    }
}
