package com.example.array;

public class Problem07 {
	public static void main(String[] args) {
		int[][] matrix = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		
		//　対角洗浄の要素の話を計算するための変数
		 int sum = 0;
		 
		 //ループを使って対角線上の要素の話を計算
		 for (int i = 0; i < matrix.length; i++) {
			 sum += matrix[i][i];
		 }
		 
		 //結果を出力
		 System.out.println("対角線上の要素の和: " + sum);
	}
}
