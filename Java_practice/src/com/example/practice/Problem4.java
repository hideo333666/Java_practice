package com.example.practice;

public class Problem4 {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		
		// 計算後"double型"の変数cに代入されるため自動的に2.0という"double"方の値に変換される。
		double c;
		
		// ここでの割り算は"int"型同志の演算になる。つまり小数点以下は切り捨てられる。
		c = a / b ;
		
		System.out.println(c);
	}
}
