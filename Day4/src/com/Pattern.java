package com;

public class Pattern {
	public static void main(String[] args) {
		int n = 5;
		for(int line = 1;li
				ne<=n;line++) {
			for(int star = 1;star<= n-line+1;star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
