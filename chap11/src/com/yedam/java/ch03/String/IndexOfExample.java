package com.yedam.java.ch03.String;

public class IndexOfExample {
	public static void main(String[] args) {
		String subject = "혼자공부하는 자바, 신윤권";

		//
		int location = subject.indexOf("공부");
		System.out.println("'공부'의 위치 : " + location);

		// 활용
		if (subject.indexOf("자바") == -1) {
			System.out.println("자바와는 관련 없는 책입니다.");
		} else {
			System.out.println("자바와 관련이 있는 책입니다.");
		}

		if (subject.indexOf("자바") > -1) {
			System.out.println("자바와 관련이 있는 책입니다.");
		} else {
			System.out.println("자바와는 관련 없는 책입니다.");
		}
	}
}
