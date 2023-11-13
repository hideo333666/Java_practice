package com.example.practice;

import java.util.Random;

public class Foundation {
	public static void main(String[] args) {
		Random rand = new Random();
		int number = rand.nextInt(100); // 0から99までのランダムな数を生成
		boolean isPrime 
		= isPrime(number);
		System.out.println("Is" + number + " a prime number?" + isPrime);
	}
	
	public static boolean isPrime(int number) {
		// １と自身以外で割り切れる数があるかどうかを確認
		if (number <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true; 
	}
}
