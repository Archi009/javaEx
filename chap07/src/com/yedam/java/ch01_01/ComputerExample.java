package com.yedam.java.ch01_01;

public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;

		Calculator calculator = new Calculator();
		System.out.println("원면적: " + calculator.areaCircle(r) + "실행");
		System.out.println();

		Computer computer = new Computer();
		System.out.println("원면적: " + computer.areaCircle(r) + "실행");
		System.out.println();
	}
}
