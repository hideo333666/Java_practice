package com.example.practice;

import java.util.Scanner;

public class Problem6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1つ目の整数を入力してください:");
		int number1 = scanner.nextInt(); //1つ目の整数を読み込む
		
		System.out.println("2つ目の整数を入力してください:");
		int number2 = scanner.nextInt(); //2つ目の整数を読み込む 
		
		//2つの整数の合計を計算
		int sum = number1 + number2;
		
		System.out.println("合計" + sum);
		
		scanner.close();
	}
	
}
