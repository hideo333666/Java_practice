package com.example.array;

public class Problem06 {
	public static void main(String[] args) {
		int[] numbers  = {3, 1, 4, 5, 2};
		
		//バブルソート
		for (int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					//要素を入れ替える
					
					int temp = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = temp;
					
				}
			}
		}
		
		//結果を出力
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}
}	
