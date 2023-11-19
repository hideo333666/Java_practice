package com.example.array;

public class Problem03 {
	public static void main(String[] args) {
		int[] numbers = {4, 7, 9, 2, 5};
		int sum = 0;
		
		for (int num : numbers) {
			sum += num;
		}
		
		double average = (double) sum / numbers.length;
		System.out.println("平均値:" + average);
	}
}
