package com.org.arrays;

public class OddEvenArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Print odd numbers in array ...");
		for (int i = 0; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("Print even numbers in array....");
		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}
	}

}
