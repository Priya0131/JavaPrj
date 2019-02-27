package com.org.basics;

import java.util.Scanner;

//Factorial of n is the product of all positive descending integers.4! = 4*3*2*1 = 24  

public class FactRecursion {
	static int factorial(int n){
		if (n==0)
			return 1;
		else
			return (n*factorial(n-1));
		
	}

	public static void main(String[] args) {
		
		int fact=1;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number for factorial ");
		int num = s.nextInt();
		fact = factorial(num);
		System.out.println("Factorial of given number "+fact);

	}

}
