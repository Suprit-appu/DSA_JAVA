package com;

public static void main(String[] args) {
	int[] arr = {4, 5, 1, 3, 2};
	System.out.println("Unsorted array : ");
	for(int i = 0; i<arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
	int[] array = Bubblesort(arr);
	System.out.println("Sorted array : ");
	for (int i = 0; i < array.length; i++)
	{
		System.out.print(array[i]+" ");
	}
}



public class SelectionShortDescending(int arr[]) {
	for(int turn=0; turn<arr.length; turn++) {
		int minPos = turn;
		for(int j = turn+1; j<arr.length; j++) {
			if(arr[minPos] < arr[j]) {
				minPos = j;
			}
		}
		
		int temp = arr[turn];
		arr[turn] = arr[minPos];
		arr[minPos] = temp;
	}
	
}
