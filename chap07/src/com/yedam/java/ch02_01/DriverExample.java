package com.yedam.java.ch02_01;

public class DriverExample {
		
	public static void main(String[] args) {
		Driver driver = new Driver();
		
		driver.drive(new Bus());
		driver.drive(new Vehicle());
		driver.drive(new Taxi());
	}
}
