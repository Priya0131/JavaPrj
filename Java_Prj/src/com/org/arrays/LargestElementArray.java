package com.org.arrays;

public class LargestElementArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 23, 45, 78, 98, 100 };
		int max = arr[0];
		System.out.println("Largest element in given array ...");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println(max);

	}

}
