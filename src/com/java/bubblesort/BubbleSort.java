package com.java.bubblesort;

public class BubbleSort {
	
	// Testing BubbleSort
	public static void main(String[] args) {
		// Ordered arrays
		int[] oa1 = {1, 2, 3}; 
		int[] oa2 = {1, 2, 3, 4}; 
		int[] oa3 = {1, 2, 3, 4, 5}; 
		int[] oa4 = {1, 2, 3, 4, 5, 6}; 
		int[] oa5 = {1, 2, 3, 4, 5, 6, 7}; 
		int[] oa6 = {1, 2, 3, 4, 5, 6, 7, 8}; 
		int[] oa7 = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 
		int[] oa8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; 
		int[] oa9 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}; 
		int[] oa10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}; 

		// Unordered arrays
		int[] uoa1 = {17, 16, 15}; 
		int[] uoa2 = {17, 16, 15, 14}; 
		int[] uoa3 = {17, 16, 15, 14, 13}; 
		int[] uoa4 = {17, 16, 15, 14, 13, 12}; 
		int[] uoa5 = {17, 16, 15, 14, 13, 12, 11}; 
		int[] uoa6 = {17, 16, 15, 14, 13, 12, 11, 10}; 
		int[] uoa7 = {17, 16, 15, 14, 13, 12, 11, 10, 9}; 
		int[] uoa8 = {17, 16, 15, 14, 13, 12, 11, 10, 9, 8}; 
		int[] uoa9 = {17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7}; 
		int[] uoa10 = {17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6}; 
		
		System.out.println("Displaying unordered array 5: ");
		displayArray(uoa5);
		System.out.println();
		System.out.println("Displaying the values of unordered array 5, now ordered: ");
		bubbleSort(uoa5);
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
		for(int i = 0; i < array.length-1; i++) {
			for(int j = 0; j < array.length-1; j++) {
				if(array[j] > array[j+1]) {
					int aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
				displayArray(array);
			}
		}
	}
}
