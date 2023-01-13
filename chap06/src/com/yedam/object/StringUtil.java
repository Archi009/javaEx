package com.yedam.object;

public class StringUtil {

	// hello 인사
	static void greet() {
		System.out.println("hello");
	}

	static void greet(String str) {
		System.out.println(str);
	}

	static int greetLength(String str) {
		// 보내줄 값의 타입이 무엇인지에 따라 메소드의 타입도 정해진다
		int result;
		result = str.length();
		return result;
	}

}
