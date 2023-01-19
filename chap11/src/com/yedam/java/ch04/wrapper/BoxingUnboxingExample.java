package com.yedam.java.ch04.wrapper;

public class BoxingUnboxingExample {
	public static void main(String[] args) {

		// 박싱
		Integer obj1 = Integer.valueOf(100);
		Integer obj2 = Integer.valueOf("30040"); // 정수의 포맷으로 문자를 입력해도 된다.
//		Integer obj3 = new Integer(1000);        //진행은 되나, 권장하지 않는 방법

		// 언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();

		// 자동 박싱
		Integer newObj1 = value1;
		Integer newObj2 = value2;

		// 자동 언박싱
		int result = newObj1 + newObj2;
		System.out.println(result);

		int newVAlue1 = newObj1;
		int newVAlue2 = newObj2;

		// Wrapper 클래스 값 비교
		Integer data1 = 300;
		Integer data2 = 300;
		System.out.println(" == 결과 : " + (data1 == data2));
		System.out.println("언박싱 후 == 결과" + (data1.intValue() == data2.intValue()));
		System.out.println("equals()==결과 : " + data1.equals(data2));

		System.out.println("예외사항");
		//특정 범위 내에서는 기본타입 비교도 허용 되는데,
		//범위가 작다
		Integer data3 = 30;
		Integer data4 = 30;
		System.out.println(" == 결과 : " + (data3 == data4));
		System.out.println("언박싱 후 == 결과" + (data3.intValue() == data4.intValue()));
		System.out.println("equals()==결과 : " + data3.equals(data4));
		
	}
}
