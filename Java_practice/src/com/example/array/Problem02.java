package com.example.array;

public class Problem02 {
	public static void main(String[] args) {
		int[] numbers = {3, 15, 4, 1, 7};
		int max = numbers[0]; //最初の要素で初期化
		
		for (int num: numbers) {
			if (num > max) {
				max = num; //新しい最大値を見つけた場合、更新
			}
		}
		
		System.out.println("最大値: " + max);
	}
}
