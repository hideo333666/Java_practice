package com.example.ifproblem;

public class Ifproblem3 {
	public static void main(String[] args) {
		int score = 50;
	
		if(score >= 90) {
			System.out.println("Excellent");
		} else if (score >= 70) {
			System.out.println("Good");
		} else if(score >= 50) {
			System.out.println("Average");
		} else {
			System.out.println("Poor");
		}
	}
}
