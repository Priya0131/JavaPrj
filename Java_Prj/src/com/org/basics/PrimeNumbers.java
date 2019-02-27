package com.org.basics;

import java.util.Scanner;
/*Prime number is a number that is greater than 1 and divided by 1 or itself only
0 and 1 are not prime numbers. 
The 2 is the only even prime number because all the other even numbers can be divided by 2.
2, 3, 5, 7, 11, 13, 17.... 
*/

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Ënter first Number ... " );
		int firstnum = s.nextInt();
		System.out.println("Enter last Number ....");
		int lastnum =  s.nextInt();
		System.out.println("List of primenumber between "+firstnum+" and "+lastnum);
		for (int i = firstnum; i<=lastnum; i++){
			if (isPrime(i)){
				System.out.print(" "+i);
			}

		}

	}
	public static boolean isPrime(int n) {

		if (n<=1) {
			return false;
		}

	for (int i =2; i<=Math.sqrt(n); i++){
		if (n % i == 0){
			return false;
		}
		}
		return true;
	}
}