package dev.jaib.ds.pep.beginner.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingMainTest
{

	@Test
	public void bubbleSortTest()
	{
		int[] givenArr = {15, 30, 40, 4, 11, 9};
		int[] result = {4, 9, 11, 15, 30, 40};
		SortingMain.bubbleSort(givenArr);
		assertArrayEquals(result, givenArr);
	}

	@Test
	public void selectionSortTest()
	{
		int[] givenArr = {15, 30, 40, 4, 11, 9};
		int[] result = {4, 9, 11, 15, 30, 40};
		SortingMain.selectionSort(givenArr);
		assertArrayEquals(result, givenArr);
	}

	@Test
	public void insertionSortTest()
	{
		int[] givenArr = {15, 30, 40, 4, 11, 9};
		int[] result = {4, 9, 11, 15, 30, 40};
		SortingMain.insertionSort(givenArr);
		assertArrayEquals(result, givenArr);
	}
}
