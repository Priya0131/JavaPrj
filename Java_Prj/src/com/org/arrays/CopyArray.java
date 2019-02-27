package com.org.arrays;

public class CopyArray {

	public static void main(String[] args) {
		int[] arry1 = new int[] { 1, 2, 3, 4, 5 };
		int arry2[] = new int[arry1.length];

		// copy elements from one array arry1 to arry2
		for (int i = 0; i < arry1.length; i++) {
			arry2[i] = arry1[i];
		}

		System.out.println("Orginal elements ...");

		// print arry1
		for (int i = 0; i < arry1.length; i++) {
			System.out.print(arry1[i] + " ");
		}
		System.out.println();
		System.out.println("Copied elements ...");
		// print arry2
		for (int i = 0; i < arry2.length; i++) {
			System.out.print(arry2[i] + " ");
		}
	}

}
