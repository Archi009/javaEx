package com.yedam.java.ch01;

public class CalculatorExample {
	public static void main(String[] args) {
		
		//익명객체
		Calculator cal = new Calculator() {
			
			@Override
			public double plus(double x, double y) {
				return x + y ;
			}
		};
		
		//람다식
		Calculator ramda = (x,y) -> x+y ;
		
		System.out.println("cal : " + cal.plus (10.5,15.8));
		System.out.println("cal : " + ramda.plus (10.5,15.8));
	}
}
