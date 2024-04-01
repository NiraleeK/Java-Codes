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

class converstion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    	s = "07:05:45PM";
    	String[] parts = s.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        int seconds = Integer.parseInt(parts[2].substring(0,2));
        String amPm = parts[2].substring(2);
        
        if (hour == 12 && amPm.equalsIgnoreCase("AM")) {
                hour = 0;
            } else if (amPm.equalsIgnoreCase("PM") && hour != 12) {
                hour += 12;
            }
            
            return String.format("%02d:%02d:%02d", hour,minutes,seconds);
    }

}

public class Time_Conversion {
    public static void main(String[] args) throws IOException {
    	 Scanner scanner = new Scanner(System.in);
         
         System.out.println("Enter the time in 12-hour format (e.g., 07:05:45PM):");
         String s = scanner.nextLine();

         String result = converstion.timeConversion(s);

         System.out.println("Time in 24-hour format: " + result);

         scanner.close();
    }
}
