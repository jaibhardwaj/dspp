package dev.jaib.ds.pep.beginner.sorting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

	@Test
	public void quickSortTest()
	{
		int[] givenArr = {15, 30, 40, 4, 11, 9};
		int[] result = {4, 9, 11, 15, 30, 40};
		SortingMain.quickSort(givenArr, 0, 5);

		assertArrayEquals(result, givenArr);
	}

	@Test
	public void quickSelectTest()
	{
		int[] givenArr = {15, 30, 40, 4, 11, 9};
		int secondSmallest = SortingMain.quickSelect(givenArr, 0, 5, 1);
		assertEquals(9, secondSmallest);

		int fourthSmallest = SortingMain.quickSelect(givenArr, 0, 5, 3);

		assertEquals(15, fourthSmallest);
	}

	@Test
	public void countSortTest()
	{
		int[] givenArr = {15, 30, 40, -4, 11, 9};
		int[] result = {-4, 9, 11, 15, 30, 40};
		SortingMain.countSort(givenArr, -4, 40);

		assertArrayEquals(result, givenArr);
	}

	@Test
	public void radixSortTest()
	{
		int[] givenArr = {15, 30, 40, 4, 11, 9};
		int[] result = {4, 9, 11, 15, 30, 40};
		SortingMain.radixSort(givenArr);

		assertArrayEquals(result, givenArr);
	}

	@Test
	public void sortDatesTest()
	{
		String[] givenArr = {"12041996", "20101996", "05061997", "12041989", "11081987"};
		String[] result = {"11081987", "12041989", "12041996", "20101996", "05061997"};
		SortingMain.sortDates(givenArr);

		assertArrayEquals(result, givenArr);
	}

	@Test
	public void sort01Test()
	{
		int[] givenArr = {0, 1, 0, 1, 0};
		int[] result = {0, 0, 0, 1, 1};
		SortingMain.sort01(givenArr);

		assertArrayEquals(result, givenArr);
	}

	@Test
	public void sort012Test()
	{
		int[] givenArr = {1, 0, 2, 2, 1, 0, 2, 1, 0, 2};
		int[] result = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2};
		SortingMain.sort012(givenArr);

		assertArrayEquals(result, givenArr);
	}

	@Test
	public void targetSumPairTest()
	{
		int[] givenArr = {7, 15, 3, 18, 6, 4, 19, 2, 12, 11, 9};
		List<String> list = SortingMain.targetSumPair(givenArr, 15);
		int count = list.size();
		System.out.println(list);
		assertEquals(count, 3);
	}
}
