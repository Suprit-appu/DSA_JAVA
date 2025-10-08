package com;

public class Switch {
	public static void main(String[] args) {
		int a = 5;
		int b = 10;

		char operator = '*'; 
		
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
