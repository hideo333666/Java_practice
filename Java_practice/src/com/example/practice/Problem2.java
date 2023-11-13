package com.example.practice;

public class Problem2 {
	public static void main(String[] args) {
		String text = "omaehamousinndeiru";
		int length = text.length(); 
		
		if (text.length() <= 10) {
			System.out.println("Short text. Length:" + length);
		} else if (text.length() > 10 && text.length() <= 20 ) {
			System.out.println("Medium text. Length: " + length);
		} else {
			System.out.println("Long text. Length: " + length);
		}
	}
}
