package com.org.basics;

import java.util.Scanner;
//Factorial of n is the product of all positive descending integers.4! = 4*3*2*1 = 24

public class FactorialLoop {

	public static void main(String[] args) {
		while (true) {
			int i, fact = 1;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter Number for Factorial ");
			int num = s.nextInt();
			if (num == 0) {
				System.out.println("Exit..");
				break;
			}

			for (i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println("Factorial " + fact);

		}
	}
}
