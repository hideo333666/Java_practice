package com.example.practice;

public class Problem {
	public static void main(String[] args) {
		int age = 1; //ここに判定したい年齢を入力
		
		if (age < 18) {
			System.out.println("You are a minor.");
		} else if (age >= 18 && age < 65) {
			System.out.println("You are an adult.");
		} else {
			System.out.println("You are a senior.");
		}
	}
}
