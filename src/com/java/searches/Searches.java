package com.java.searches;

import com.java.quicksort.QuickSort;

public class Searches {

	QuickSort q = new QuickSort();
	/*
	 * In computer science, a linear search or sequential search is
	 * a method for finding an element within a list. It sequentially
	 * checks each element of the list until a match is found or the
	 * whole list has been searched.
	 */
	public static int linearSearch(int[] arr, int searchedElement) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == searchedElement) {
				return i;
			}
		}
		// If the element can't be found, it'll return -1
		return -1;
	}
	
	/*
	 * Binary search is an efficient algorithm for finding an item
	 * from a sorted list of items. It works by repeatedly dividing
	 * in half the portion of the list that could contain the item,
	 * until you've narrowed down the possible locations to just one.
	 */
	
	public static int ordenatedBinarySearch(int[] a, int searchedElement) {
		int[] arr = new int[a.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = a[i];
		}
		quickSort(arr);
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int middle = (start - end) / 2;
			
			if (arr[middle] == searchedElement) {
				return middle;
			}
			
			if (searchedElement > arr[middle]) {
				start = middle + 1;
			}else {
				end = middle - 1;
			}
		}
		return -1;
	}
	
	public static int nonOrdenatedBinarySearch(int[] arr, int searchedElement) {
		int start = 0;
		int end = arr.length - 1;
		
		while (start <= end) {
			int middle = (start + end) / 2;
			
			if (arr[middle] == searchedElement) {
				return middle;
			}
			
			if (searchedElement > arr[middle]) {
				start = middle + 1;
			}else {
				end = middle - 1;
			}
		}
		return -1;
	}

	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length -1);
		
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		
		int pivotIndex = left + (right - left) / 1;
		int pivotValue = arr[pivotIndex];
		
		int i = left;
		int j = right;
		
		while (i <= j) {
			
			while (arr[i] < pivotValue) {
				i++;
			}
			
			while (arr[j] > pivotValue) {
				j--;
			}
			
			if (i <= j) {
				int tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
				i++;
				j--;
			}
			
			if (left < i) {
				quickSort(arr, left, j);
			}
			
			if (right > i) {
				quickSort(arr, i, right);
			}
		}
	}
}
