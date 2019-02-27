package com.org.basics;

import java.util.Scanner;

/*Prime number is a number that is greater than 1 and divided by 1 or itself only
0 and 1 are not prime numbers.
The 2 is the only even prime number because all the other even numbers can be divided by 2.
2, 3, 5, 7, 11, 13, 17....
*/
public class PrimeNum {

	public static void main(String[] args) {
		boolean notprime = false;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Number.....");
		int primeno = s.nextInt();
		for (int i = 2; i < primeno / 2; i++) {
			if (primeno % i == 0) {
				System.out.println("given number is not a prime " + primeno);
				notprime = true;
				break;
			}
		}
		if (!notprime) {
			System.out.println("given number is prime " + primeno);
		}
	}
}
