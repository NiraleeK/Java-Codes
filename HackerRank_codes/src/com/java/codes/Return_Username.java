package com.java.codes;
import java.util.*;

public class Return_Username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the email address");
		
		String email = scanner.next();
		String username = "";
		
		
		for(int i=0;i<email.length();i++) {
			if(email.charAt(i) == '@') {
				break;
				
			}else {
				username = username + email.charAt(i);
			}
		}
		
		System.out.println(username);
		
	}

}
