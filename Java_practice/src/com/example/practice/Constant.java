package com.example.practice;

public class Constant {
	public static void main(String[] args) {
		int age = 20;
		System.out.println("私の年齢は" + age);
		age = 31; 
		System.out.println("いや、本当の年齢は" + age);
		
        final double PI = 3.14;
        int pie = 5;
        System.out.println("半径" + pie + "cmのパイの面積は、");
        System.out.println(pie * pie * PI);
        System.out.println("パイの半径を倍にします");
        PI = 10;
        System.out.println("半径" + pie + "cmのパイの面積は、");
        System.out.println(pie * pie * PI);
 
		
	}
}
