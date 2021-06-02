package org.ucb.cs61b.lecture3;

public class Sort {

	/**
	 * do selection sort to the
	 * 
	 * @param input
	 */
	public static void sort(String[] input) {
		sort(input, 0);
	}

	/**
	 * recursive helper method
	 * 
	 * @param input
	 * @param start
	 */
	public static void sort(String[] input, int start) {
		if (start == input.length - 1) {
			return;
		}

		int smallest = findSmallest(input, start);
		swap(input, start, smallest);
		sort(input, ++start);
	}

	/**
	 * return the index of the smallest String in the array
	 * 
	 * @param input
	 * @return
	 */
	public static int findSmallest(String[] input, int start) {
		int smallest = start;
		for (int i = start; i < input.length; i++) {
			if (input[i].compareTo(input[smallest]) < 0) {
				smallest = i;
			}
		}

		return smallest;
	}

	/**
	 * swapping the values of specific indexes
	 * 
	 * @param input
	 * @param from
	 * @param to
	 */
	public static void swap(String[] input, int from, int to) {
		String temp = input[from];
		input[from] = input[to];
		input[to] = temp;
	}

}
