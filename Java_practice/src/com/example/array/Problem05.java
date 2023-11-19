package com.example.array;

public class Problem05 {
	public static void main(String[] args) {
		int[] numbers = {1, 3, 5, 7, 9};
		int target = 11; //検索する値
		boolean found = false;
		
		for (int num : numbers) {
			if(num == target) {
				found = true;
				break;
			}
		}
		
		if (found) {
			System.out.println(target + " は配列に存在します、");
		} else {
			System.out.println(target + " は配列に存在しません。");
		}
	}
}
