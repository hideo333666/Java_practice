package com.example.ifproblem;

public class Ifproblem4 {
	public static void main(String[] args) {
		int score = 90;
		
		if (score >= 90) {
			System.out.println("優秀");
		} else if (score >= 70) {
			System.out.println("良好");
		} else if (score >= 50) {
			System.out.println("普通");
		} else {
			System.out.println("不合格");
		}
	}
}
