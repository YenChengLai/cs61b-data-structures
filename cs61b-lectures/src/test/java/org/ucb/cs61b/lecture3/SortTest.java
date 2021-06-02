package org.ucb.cs61b.lecture3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class SortTest {
	
	@Test
	public static void testSort() {
		String[] input = new String[] { "i", "have", "a", "dog" };
		String[] expected = new String[] { "a", "dog", "have", "i" };
		Sort.sort(input);

		Assertions.assertArrayEquals(expected, input);
	}

	@Test
	public static void testFindSmallest() {
		String[] input = new String[] { "i", "have", "a", "dog" };
		int expected = 2;

		int actual = Sort.findSmallest(input, 0);
		Assertions.assertEquals(expected, actual);
	}

}
