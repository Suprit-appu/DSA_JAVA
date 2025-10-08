package com;

public class SwapInSelectionsort {
	    public static void main(String[] args) {
	        int[] arr = {29, 10, 14, 37, 13};
	        int swaps = selectionSort(arr);
	        System.out.println("Sorted array: ");
	        for (int i : arr) {
	            System.out.print(i + " ");
	        }
	        System.out.println("\nNumber of swaps: " + swaps); // Expected output: 3
	    }

	    public static int selectionSort(int[] arr) {
	        int n = arr.length;
	        int swapCount = 0;

	        for (int i = 0; i < n - 1; i++) {
	            int minIndex = i;
	            for (int j = i + 1; j < n; j++) {
	                if (arr[j] < arr[minIndex]) {
	                    minIndex = j;
	                }
	            }

	            // Swap if the minimum element is not already in its correct position
	            if (minIndex != i) {
	                int temp = arr[minIndex];
	                arr[minIndex] = arr[i];
	                arr[i] = temp;
	                swapCount++;
	            }
	        }
	        return swapCount;
	    }
	}

