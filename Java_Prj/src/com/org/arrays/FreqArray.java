package com.org.arrays;

import java.util.HashMap;

public class FreqArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 8, 3, 2, 2, 2, 5, 1 };
		int[] frq = new int[arr.length];
		int visited = -1;

		/*
		 * for (int i = 0; i < arr.length; i++) { int count = 1; for (int j = i
		 * + 1; j < arr.length; j++) { if (arr[i] == arr[j]) { count++; frq[j] =
		 * visited; } } if (frq[i] != visited) { frq[i] = count; }
		 *
		 * } // Displays the frequency of each element present in array
		 * System.out.println("---------------------------------------");
		 * System.out.println(" Element | Frequency");
		 * System.out.println("---------------------------------------"); for
		 * (int i = 0; i < frq.length; i++) { if (frq[i] != visited) {
		 * System.out.println("    " + arr[i] + "    |    " + frq[i]); } }
		 * System.out.println("----------------------------------------");
		 */

		HashMap<Integer, Integer> no = new HashMap<Integer, Integer>();
		int mapCount = 1;
		for (int i = 0; i < arr.length; i++) {
			if (no.containsKey(arr[i])) {
				int retCount = no.get(arr[i]);
				retCount++;
				no.remove(arr[i]);
				no.put(arr[i], retCount);
			} else {
				no.put(arr[i], mapCount);
			}
		}

		System.out.println("Map =" + no);
	}
}
