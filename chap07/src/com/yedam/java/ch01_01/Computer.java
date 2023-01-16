package com.yedam.java.ch01_01;

public class Computer extends Calculator {

	@Override // 컴파일시 강하게 체크 함
	// 부모 클래스를 갖고있다 라고 선언
	double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
