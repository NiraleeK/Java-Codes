package com.java.codes;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Xor_String {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    	 Scanner sc = new Scanner(System.in);
         String t1 = sc.next();
         String t2 = sc.next();
         sc.close();

         long a = Long.parseLong(t1, 2);
         long b = Long.parseLong(t2, 2);
         long c = a ^ b;
         String x = Long.toBinaryString(c);
         System.out.println(x);
    }
}