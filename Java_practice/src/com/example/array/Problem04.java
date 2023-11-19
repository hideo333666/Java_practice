package com.example.array;

public class Problem04 {
	public static void main(String[] args) {
		int[] numbers = {5, 4, 3, 2, 1};
		int[] reversed = new int[numbers.length];
		
		for (int i = 0; i < numbers.length; i++) {
			reversed[i] = numbers[numbers.length - 1 - i];
		}
		
		//結果を出力（オプション）
		for (int num : reversed) {
			System.out.print(num + " ");
		}
	}
}
