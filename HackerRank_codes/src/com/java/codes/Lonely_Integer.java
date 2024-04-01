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

class lonely {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
    // Write your code here
    	int lonely =0;
        for(int i=0;i<a.size();i++){
            lonely ^= a.get(i);
        }
        return lonely;
    }

}

public class Lonely_Integer {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        List<Integer> a = new ArrayList<>();
        System.out.println("Enter the elements of the array separated by spaces:");
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextInt());
        }

        int result = lonely.lonelyinteger(a);
        
        System.out.println("The lonely integer is: " + result);

        scanner.close();
    }
}
