package com.yedam.reference;

public class StringRef {
	public static void main(String[] args) {
		String strVal1 = "yedam";
		String strVal2 = "yedam";
		// 문자열 주소값으로 비교
		if (strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 메모리 주소가" + "같다");

		} else {
			System.out.println("strVal1과 strVal2는 메모리 주소가" + "같다");

		}
		// 문자열 데이터 값으로 비교
		if (strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2는 데이터 동일");
		} else {
			System.out.println("strVal1과 strVal2는 데이터 다름");
		}
		// new 연산자를 활용한 String 새롭게 객체 생성
		// heap에 객체를 만든다.
		// heap에 String 데이터를 넣을 수 있는 새로운 공간을 만든다.

		String strVal3 = new String("yedam");// 새로운 공간 (100번지)
		String strVal4 = new String("yedam");// 새로운 공간(200번지)

		if (strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 같은 메모리 주소.");
		} else {
			System.out.println("strVal3과 strVal4는 다른 메모리 주소.");
		}

		if (strVal3.equals(strVal4)) {
			System.out.println("strVal3과 strVal4는 같은 메모리 주소.");
		} else {
			System.out.println("strVal3과 strVal4는 다른 메모리 주소.");
		}

		// String strval1 = "yedam"
		// String strVal3 = new String("yedam")

		if (strVal3 == strVal1) {
			System.out.println("strVal3과 strVal4는 같은 메모리 주소.");
		} else {
			System.out.println("strVal3과 strVal4는 다른 메모리 주소.");
		}

	}
}
