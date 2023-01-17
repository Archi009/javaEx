package com.yedam.java.ch02_01;

public class CarExample {
public static void main(String[] args) {
	Car myCar = new Car();
	
	myCar.run();
	
	myCar.frontLeftTire = new KumhoTire();
	myCar.backRightTire = new KumhoTire();
	
	myCar.run();
	
}
}
