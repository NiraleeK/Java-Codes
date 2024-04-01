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

class Pang {

    /*
     * Complete the 'pangrams' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String pangrams(String s) {
		String pangram = "Pangram";
		String notPangram = "not Pangram";
		Set<Character> abc = new HashSet<>();
		for(Character ch : s.toCharArray()) {
			Character lower = Character.toLowerCase(ch);
			if(Character.isLetter(lower)) {
				abc.add(lower);
			}
		}
		for(char a = 'a';a<= 'z';a++) 
		{
			if(!abc.contains(a)) {
				return notPangram;
			}
		}
		return pangram;

    }

}

public class Pangrams {
    public static void main(String[] args) throws IOException {
    	Scanner scanner1 = new Scanner(System.in);
    	System.out.println("Enter a String:");
    	String s = scanner1.nextLine();
    	
    	String result = Pang.pangrams(s);

    	System.out.println("Result: " + result);

    	scanner1.close();
    }
}
