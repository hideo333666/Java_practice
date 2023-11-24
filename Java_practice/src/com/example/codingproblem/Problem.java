package com.example.codingproblem;

public class Problem {
	public static void main(String[] args) {
	int a = 60;
	int b = 48;
	
	int gcd = gcd(a, b);
	int lcm = (a / gcd) * b;
	
	System.out.println("GCD: " + gcd);
	System.out.println("LCM: " + lcm);
	}
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}
