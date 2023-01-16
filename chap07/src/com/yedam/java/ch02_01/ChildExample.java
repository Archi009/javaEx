package com.yedam.java.ch02_01;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		
		Parent parent = child; //타입이 다르지만 자동 타입 변환댐
		parent.method1();
		parent.method2();
		//parent.method3(); // 자동타입 변환으로 부모 클래스에 있는것만 끌고와 쓸 수 있다!
		
		
		
	}
}
