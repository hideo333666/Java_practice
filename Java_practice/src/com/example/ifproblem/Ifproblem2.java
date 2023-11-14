package com.example.ifproblem;

public class Ifproblem2 {
	public static void main(String[] args) {
		int temperature = -5;
		
		if(temperature >= 30 ) {
			System.out.println("It's hot. Go swimming.");
		} else if(temperature >= 20) {
			System.out.println("It's nice. Go for a wakl.");
		} else if(temperature >= 10) {
			System.out.println("It's cool. Wear a jacket.");
		} else {
			System.out.println("It's cold. Stay inside.");
		}
	}
}
