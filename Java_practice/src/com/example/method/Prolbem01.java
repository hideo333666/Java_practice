package com.example.method;

public class Prolbem01 {
	public static void main(String[] args) {
		//メソッドのテスト
		int result = multiply(5, 6);
		System.out.println("積:" + result);
	}
	
	//2つの整数を引数として受け取り、その積を返すメソッド
	public static int multiply(int a, int b) {
		return a * b;
	}
}
