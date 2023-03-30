package com.java.quicksort;

/*
Quicksort is a highly efficient sorting technique that divides a large data array
into smaller ones. A vast array is divided into two arrays, one containing values
smaller than the provided value, say pivot, on which the partition is based.
The other contains values greater than the pivot value.
 */
public class QuickSort {
	// Testing QuickSort
	public static void main(String[] args) {
		// Partially ordered array
		int[] poa = { 10, 9, 7, 5, 3, 12, 6, 4, 11, 12, 13, 14, 15, 16, 17 };
		// Displaying the original array
		System.out.println("Displaying the values of the partially ordered array: ");
		displayArray(poa);
		// Testing QuickSort
		quickSort(poa, 0, poa.length - 1);
		System.out.println("Displaying the same array, now ordered with QuickSort: ");
		displayArray(poa);
	}
	
	public static void quickSort(int[] arr, int start, int end) {
		int mid;
		if (start < end) {
			mid = partition(arr, start, end);
			quickSort(arr, start, mid);
			quickSort(arr, mid + 1, end);
		}
	}
	
	public static int partition(int[] arr, int start, int end) {
		int pivot, top, i;
		pivot = arr[start];
		top = start;
		for (i = start + 1; i <= end; i++) {
			if (arr[i] < pivot) {
				arr[top] = arr[i];
				arr[i] = arr[top + 1];
				top++;
			}
		}
		arr[top] = pivot;
		return top;
	}
	
	// Displaying an array
	private static void displayArray(int[] array) {
		int i;
		System.out.print("{ ");
		for(i=0; i<array.length - 1; i++) {
			System.err.print(array[i] + ", ");
		}
		System.out.println(array[i] + "}");
	}
}
