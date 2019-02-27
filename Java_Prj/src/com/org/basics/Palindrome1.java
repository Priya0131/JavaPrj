package com.org.basics;

import java.util.Scanner;

/*A palindrome number is a number that is same after reverse.
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
It can also be a string like LOL, MADAM etc.*/

public class Palindrome1 {

	public static void main(String[] args) {
		String org, rev="";
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter String/Number to verify Palindrome ");
		org = s.nextLine();
		int length = org.length();
		for (int i = length-1; i>=0; i--){
			rev = rev + org.charAt(i);
		}
		if (org.equals(rev))
			System.out.println("The number is Palindrome " +org);
		else
			System.out.println("The number is not Palindrome " +org);

	}
	}

