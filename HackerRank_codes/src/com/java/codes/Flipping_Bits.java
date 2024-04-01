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

class flipping {

    /*
     * Complete the 'flippingBits' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */

    public static long flippingBits(long n) {
    // Write your code here

    	long flipped = n ^ 0xFFFFFFFFL;
  
	return flipped;
    }

}

public class Flipping_Bits {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < q; i++) {
            System.out.print("Enter the number: ");
            long n = scanner.nextLong();
            long result = flipping.flippingBits(n);
            System.out.println("Flipped bits result: " + result);
        }

        scanner.close();
    }
}
