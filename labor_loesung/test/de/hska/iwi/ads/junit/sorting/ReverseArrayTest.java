package de.hska.iwi.ads.junit.sorting;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import de.hska.iwi.ads.solution.sorting.ReverseArray;
public class ReverseArrayTest {

	@Test
	void reversingWholeArray_SHOULD_work() {
		// arrange
		Integer[] a = { 11, 7, 4, 2, 9, 10, 0 };
		ReverseArray<Integer> reverseArray = new ReverseArray<>();

		// act
		reverseArray.reverse(a, 0, a.length - 1);

		// assert
		Integer[] expected = {0, 10, 9, 2, 4, 7, 11};
		assertArrayEquals(expected, a);
	}

	@Test
	void reversingSmallArray_SHOULD_work() {
		// arrange
		Integer[] a = {0, 4};
		ReverseArray<Integer> reverseArray = new ReverseArray<>();

		// act
		reverseArray.reverse(a, 0, a.length - 1);

		// assert
		Integer[] expected = {4, 0};
		assertArrayEquals(expected, a);
	}
	
	@Test
	void reversingSpecialCase_SHOULD_work() {
		// arrange
		Integer[] a = {0, 2, 4, 7, 9, 10, 11};
		ReverseArray<Integer> reverseArray = new ReverseArray<>();

		// act
		reverseArray.reverse(a, 1, 6);

		// assert
		Integer[] expected = {0, 11, 10, 9, 7, 4, 2};
		assertArrayEquals(expected, a);	
	}
}
