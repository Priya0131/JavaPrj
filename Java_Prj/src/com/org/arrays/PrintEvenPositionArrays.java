package com.org.arrays;

public class PrintEvenPositionArrays {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		System.out.println("Print the elements which are in even position of array");

		for (int i = 1; i < arr.length; i = i + 2) {
			System.out.print(arr[i] + " ");
		}

	}

}
