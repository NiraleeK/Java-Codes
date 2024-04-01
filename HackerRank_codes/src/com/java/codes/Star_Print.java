package com.java.codes;

import java.util.ArrayList;
import java.util.List;

public class Star_Print {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n =5;
		printStars(n);

	}
	
	public static void printStars(int n) {
		int i, j;
		 
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i<n; i++)
        {
 
            //  inner loop to handle number of columns
            //  values changing acc. to outer loop    
            for(j=0; j<=i; j++)
            {
                // printing stars
                System.out.print("* ");
            }
 
            // ending line after each row
            System.out.println();
	}

}
}
