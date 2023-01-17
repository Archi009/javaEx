package com.yedam.java.ch03_01;

public class PhoneExample {
	public static void main(String[] args) {
//		Phone phone = new Phone("홍길동"); 추상클래스를 적용하면 그 클래스의 생성자를 통해 객체를 만들지 못 한다
	
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		//자동 타입 변환 (변수로는 됨)
//		Phone phone = new SmartPhone("홍길동");
		
		//강제 타입 변환 (new연산자를 통할 수 없음)
//		SmartPhone smartPhone1 = (SmartPhone) new Phone ("홍길동");
	
		smartPhone.turnOn();
		smartPhone.internetSearch();
	
	}
	
}
