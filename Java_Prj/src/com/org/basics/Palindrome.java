package com.org.basics;

import java.util.Scanner;

/*A palindrome number is a number that is same after reverse.
For example 545, 151, 34543, 343, 171, 48984 are the palindrome numbers.
It can also be a string like LOL, MADAM etc.*/

public class Palindrome {

	public static void main(String[] args) {
		int temp, sum=0, num, rem;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number to check if palindrome...");
		num = s.nextInt();

		temp = num;
		while (num>0) {
			rem = num%10;
			sum =(sum*10)+rem;
			num = num/10;

		}
		if (temp==sum)
			System.out.println("The number is palindrome " +sum);
		else
			System.out.println("The number is not palindrome "+sum );

	}

}
