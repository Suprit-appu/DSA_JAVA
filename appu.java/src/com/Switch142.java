package com;

import java.until.Scanner;

public class Switch142 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter two number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Enter a value operator");
		char operator = sc.next().charAt(0);
		
		switch (operator) {
		case '+':
			System.out.println("Sum = " + (a + b));
			break;
		case ('-'):
			System.out.println("Difference = "+ (a-b));
			break;
		case '*':
			System.out.println("Product = " + (a * b));
			break;
		case ('/'):
			System.out.println("Quotient = "+ (a/b));
			break;
		}
	}

}
