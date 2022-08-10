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

	@Test
	public void mergeTwoSortedArraysTest()
	{
		int[] sa1 = {-2, 5, 10, 18};
		int[] sa2 = {4, 9, 11, 15, 30, 40};
		int[] saResult = {-2, 4, 5, 9, 10, 11, 15, 18, 30, 40};
		final int[] mergedArray = SortingMain.mergeTwoSortedArrays(sa1, sa2);

		assertArrayEquals(saResult, mergedArray);
	}

	@Test
	public void mergeSortTest()
	{
		int[] givenArr = {15, 30, 40, 4, 11, 9};
		int[] result = {4, 9, 11, 15, 30, 40};
		final int[] mergedArray = SortingMain.mergeSort(givenArr, 0, 5);

		assertArrayEquals(result, mergedArray);
	}

	@Test
	public void partitionAnArrayOnPivotTest()
	{
		int[] givenArr = {15, 30, 40, 4, 11, 9};
		int pivot = 12;
		int[] result = {4, 11, 9, 15, 30, 40};
		SortingMain.partitionAnArrayOnPivot(givenArr, pivot);
		assertArrayEquals(result, givenArr);
	}
}
