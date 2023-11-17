package com.example.ifproblem;

public class Ifproblem7 {
	public static void main(String[] args) {
		double price = 1205;
		boolean isMember = true;
		
		if(isMember) {
			price *= 0.9; //会員の場合、10%割引
		} else if (price >= 5000) {
			price *= 0.95; //非会員で五千円以上の場合、5%割引
		}
		System.out.println("最終価格:" + price + "円");
	}
}
