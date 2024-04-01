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

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     * 
     * sample input:
     * 6
	   -4 3 -9 0 4 1
     */

    public static void plusMinus(List<Integer> arr) {

    int positive = 0;
    int negative = 0;
    int zero = 0;
    int size = arr.size();
    
    for (int num : arr){
        if (num >0){
            positive++;
        }else if (num <0){
            negative++;
        }else{
            zero++;
        }
    }
    
    double count_pos = (double) positive/size;
    double Count_neg = (double) negative/size;
    double count_zero = (double) zero/size;
    
    System.out.println(String.format("%.6f",count_pos));
    System.out.println(String.format("%.6f",Count_neg));
    System.out.println(String.format("%.6f",count_zero));

    }

}

public class Plus_Minus {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}



