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

class Diagonal {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
	
    	int n = arr.size();
    	int diagonalsum1 = 0;
    	int diagonalsum2 =0;
    	
    	for(int i =0; i<n;i++) {
    		diagonalsum1 += arr.get(i).get(i);
    		diagonalsum2 += arr.get(i).get(n-i-1);
    	}
    	
    	
    	return Math.abs(diagonalsum1-diagonalsum2);
    

    }

}

public class Diagonal_Difference {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the size of the matrix
        System.out.print("Enter the size of the square matrix: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character after integer input

        // Prompt the user to enter the matrix elements
        System.out.println("Enter the matrix elements (each row on a new line):");
        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter elements for row " + (i + 1) + ": ");
            String[] rowElements = scanner.nextLine().split(" ");
            List<Integer> row = new ArrayList<>();
            for (String element : rowElements) {
                row.add(Integer.parseInt(element));
            }
            arr.add(row);
        }

        // Calculate the diagonal difference
        int result = Diagonal.diagonalDifference(arr);

        // Output the result
        System.out.println("The diagonal difference is: " + result);

        scanner.close();
    }
}
