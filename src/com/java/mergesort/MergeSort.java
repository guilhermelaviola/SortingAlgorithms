package com.java.mergesort;

/*
Merge sort is a sorting technique based on divide and conquer technique.
With worst-case time complexity being Ο(n log n), it is one of the most respected
algorithms. Merge sort first divides the array into equal halves and then combines
them in a sorted manner.
*/

public class MergeSort {

	private static int[] array;
	private static int[] auxArray;
	
	public static void main(String[] args) {
		// Partially ordered array
		int[] poa = { 10, 9, 7, 5, 3, 12, 6, 4, 11, 12, 13, 14, 15, 16, 17 };
		// Displaying the original array
		System.out.println("Displaying the values of the partially ordered array: ");
		displayArray(poa);
		// Testing MergeSort
		mergeSort(poa);
		System.out.println("Displaying the same array, now ordered with MergeSort: ");
		displayArray(poa);
	}
	
	public static void mergeSort(int[] arr) {
		array = arr;
		auxArray = new int[arr.length];
		sort(0, arr.length - 1);
	}
	
	private static void sort(int start, int end) {
		if (start < end) {
			int m = (start + end) / 2;
			sort(start, m);
			sort(m + 1, end);
			merge(start, m, end);
		}
	}
	
	private static void merge(int start, int mid, int end) {
		int i, j, k;
		
		// Copying the elements from the main array to the auxiliary array
		for (i = start; i <= end; i++){
			auxArray[i] = array[i];
		}
		
		i = start;
		j = mid + 1;
		k = start;
		
		while (i <= mid && j <= end){
			if(auxArray[i] <= auxArray[j])
				array[k++] = auxArray[i++];
			else
				array[k++] = auxArray[j++];
		}
		
		while (i < mid) {
			array[k++] = auxArray[i++];
		}
	}
	
	// Displaying an array
	private static void displayArray(int[] array) {
		System.out.print("{ ");
		for(int i=0;i<array.length;i++) {
			System.err.print(array[i] + ", ");
		}
		System.out.println("}");
	}
}
