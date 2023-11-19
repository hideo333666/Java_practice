package com.example.array;

public class Problem01 {
	public static void main(String[] args) {
		//整数の配列を定義
		int[] numbers = {1, 2, 3, 4, 8};
		
		// 合計を格納する変数
		int sum = 0;
		
		// 配列の各要素をループで処理
		for(int num : numbers) {
			sum += num;  //合計に加算
		}
		
		System.out.println("合計: " + sum);
	}
}
