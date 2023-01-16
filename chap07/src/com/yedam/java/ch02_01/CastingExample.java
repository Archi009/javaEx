package com.yedam.java.ch02_01;

public class CastingExample {
	public static void main(String[] args) {
		// 자동타입 변환
		Parent parent = new Child();
		parent.method1();
		parent.method2();
//		paernt.method3();

		System.out.println();

		// 강제 타입 변환
		Child child = (Child) parent;

		child.method1();
		child.method2();
		child.method3();
		// pa에 들어있는 reference가 Child가 아님
		Parent pa = new Parent(); // 자동타입 변화를 시키지 않고 그냥 강제 변환을 사용하면// 화면에 빨간 줄이 뜨지 않지만 실행시(컴파일)에 오류감지.
		if (pa instanceof Child) { // but if문을 사용해서 instanceof로 내용물을 체크하는 과정을 진행하면 오류 확인을 따로 신경쓰지 않아도 된다. 
			Child ch = (Child) pa; 
			ch.method1();
			ch.method2();
			ch.method3();
		}else {
			System.out.println("변수 pa의 인스턴스는 Chaild클래스이 인스턴스가 아입니다.");
		}
	}
}
