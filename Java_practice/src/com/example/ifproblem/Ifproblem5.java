package com.example.ifproblem;

public class Ifproblem5 {
	public static void main(String[] args) {
		int age = 18;
		
		if(age > 18) {
			System.out.println("子供");		
		} else if (age < 65) {
			System.out.println("成人");		
		} else {
			System.out.println("高齢者");
		}
	}
}
