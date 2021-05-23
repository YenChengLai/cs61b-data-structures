package org.ucb.cs61b.homework0;

public class Exercise1a {

	// purpose: draw a triangle with 5 * at the bottom
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
