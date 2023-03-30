package com.java.bubblesort;

public class BubbleSort {
	
	// Testing BubbleSort
	public static void main(String[] args) {
		// Ordered arrays
		int[] oa1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
		int[] oa2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; 
		// Unordered arrays
		int[] uoa1 = {17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6}; 
		int[] uoa2 = {17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6}; 
		// Displaying arrays
		System.out.println("Displaying unordered arrays 1 and 2 (which are the same): ");
		displayArray(uoa1);
		displayArray(uoa2);	
		System.out.println();
		// Testing BubbleSort
		System.out.println("Displaying the values of unordered array 1, now ordered: ");
		bubbleSort(uoa1);
		System.out.println();
		// Testing improved BubbleSort
		System.out.println("Displaying the values of unordered array 2, now ordered (with improved BubbleSort): ");
		improvedBubbleSort(uoa2, 0);
	}
	
	// Displaying an array
	private static void displayArray(int[] array) {
		System.out.print("{");
		for(int i=0;i<array.length;i++) {
			if (i==(array.length-1)) System.out.print(array[i]+"}");
			else System.out.print(array[i]+",");
		}
		System.out.println();
	}
	
	// BubbleSort algorithm to order an unordered array
	public static void bubbleSort(int[] array) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < array.length-1; i++) {
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
				displayArray(array);			}
		}
		long end = System.currentTimeMillis();
		long totalTime = end - start;
		System.out.println("Total time spent: " + totalTime + " ms.");
	}
	
	// Improved BubbleSort algorithm
	public static int improvedBubbleSort(int[] array, int times) {
		long start = System.currentTimeMillis();
		for(int i = 0; i < array.length-1; i++) {
			// Here is the improvement
			boolean flag = false;
			for(int j = 0; j < array.length-1-i; j++) {
				// Counting how many times the process is repeated
				times++;
				if(array[j] > array[j+1]) {
					int aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
					flag = true;
				}
				displayArray(array);
			}
			if(flag == false)
				return times;
		}
		long end = System.currentTimeMillis();
		long totalTime = end - start;
		System.out.println("Total time spent: " + totalTime + " ms.");
		return times;
	}
}
