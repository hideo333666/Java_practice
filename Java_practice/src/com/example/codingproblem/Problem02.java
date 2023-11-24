package com.example.codingproblem;

public class Problem02 {
	public static void main(String[] args) {
		int n = 25;
		System.out.println("Fibonacci number at position " + n + ": " + fibonacci(n));
	}
	
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		int a = 0, b = 1;
		for(int i = 2; i <= n; i++) {
			int temp = b;
			b = a + b;
			a = temp;
		}
		return b;
	}
}
