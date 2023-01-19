package com.yedam.java.ch01;

public class MainExample {
	public static void main(String[] args) {
		//익명 객체 -> 상속과 구현관계에 있는 객체를 익명으로 사용하는것
		//상속 -> 익명 자식 객체
		//구현 -> 익명 구현 객체
		//익명 구현객체 한시적으로 구현하고 사용하면 끝-
		Phone test = new Phone()	{
			double version = 1.4;
			public double versionUpdate() {
				return version + 0.1;
			}
			@Override
			public void turnOn() {
				System.out.println("전원을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("전원을 끕니다.");
			}

			@Override
			public void service() {
				System.out.println("현재 버전"+versionUpdate());
				System.out.println("테스트 기능입니다.");
			}
			
		};
	test.turnOn();
	test.service();
	test.turnOff();
	}
}
