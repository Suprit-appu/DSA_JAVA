package com;

public class InserctionSortExample {
	public static void main(String[] args) {
		String[] arr = {"banana","apple","cherry"};
		int n = arr.length;
		
		for (int i = 1; i < n; i++) {
			String current = arr[i];
			int j = i - 1;
			
			while(j >= 0 && arr[j].compareTo(current)> 0) {
				arr[j + 1]= arr[j];
				j--;
			}
			
	arr[j+1] = current;
		}
		
		System.out.print("Sorted Strings Alphabetically:");
		for (String str : arr) {
			System.out.print(str + " ");
		}
	}

}
