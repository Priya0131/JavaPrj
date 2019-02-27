package com.org.arrays;

public class Smallestarray {

	public static void main(String[] args) {
		int[] arr = new int[] { 3, 100, 34, 56, 200, 300 };
		int min = arr[0];
		System.out.println("Smallest array element ...");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];

			}

		}
		System.out.println(min);
	}

}
