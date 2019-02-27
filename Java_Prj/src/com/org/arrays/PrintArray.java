package com.org.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintArray {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] { 1, 2, 3, 4, 5 };
		System.out.println("List of array ...");
		for (int i = 0; i < arr.length; i++) {
			// System.out.println(arr[i] + " ");
		}
		for (int i : arr) {
			// System.out.print(i + " ");
		}

		List<Integer> arr1 = new ArrayList<Integer>();
		// arr1.add(2);
		// arr1.add(3);
		arr1 = Arrays.asList(arr);
		System.out.println(arr1);

	}

}
