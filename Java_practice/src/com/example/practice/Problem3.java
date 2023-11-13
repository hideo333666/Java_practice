package com.example.practice;

public class Problem3 {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5}; //配列の定義
		int total = 0; //合計値を格納する変数
		
		for (int number : numbers) {
			total += number; //　各要素を合計値に加算
		}
		
		System.out.println("Total: " + total); // 合計値の出力
	}
}
