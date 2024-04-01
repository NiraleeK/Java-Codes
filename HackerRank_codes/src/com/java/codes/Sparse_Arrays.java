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

class sparse {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. STRING_ARRAY strings
     *  2. STRING_ARRAY queries
     *  
     *  input:		Output:
     *  4			2
	 *	aba			1
	  	baba		0
		aba
		xzxb
		3
		aba
		xzxb
		ab
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    	List<Integer> result = new ArrayList<>();
        for(int i=0;i<queries.size();i++){
            int count =0;
            for(int j=0;j<strings.size();j++){
                if(queries.get(i).equalsIgnoreCase(strings.get(j))){
                    count++;
                }
            }
            result.add(count);
        }
            
        return result;
    }

}

public class Sparse_Arrays {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int stringsCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        List<String> strings = IntStream.range(0, stringsCount)
                .mapToObj(i -> {
                    System.out.print("Enter string " + (i + 1) + ": ");
                    return scanner.nextLine();
                })
                .collect(Collectors.toList());

        System.out.print("Enter the number of queries: ");
        int queriesCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        List<String> queries = IntStream.range(0, queriesCount)
                .mapToObj(i -> {
                    System.out.print("Enter query " + (i + 1) + ": ");
                    return scanner.nextLine();
                })
                .collect(Collectors.toList());

        List<Integer> res = sparse.matchingStrings(strings, queries);

        System.out.println("Results:");
        res.forEach(System.out::println);

        scanner.close();
        }
}
