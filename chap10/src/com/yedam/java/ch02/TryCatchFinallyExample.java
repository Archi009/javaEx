package com.yedam.java.ch02;

import java.util.Scanner;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		// TryCatchFinallyExample
		// 일반예외 컴파일 할 때 걸러짐
		try {
			Class clazz = Class.forName("java.lan.String2");
		} catch (ClassNotFoundException e) {
//			e.printStackTrace(); // 빨간글, 가장 정확한 예외의 원인.
			System.out.println("해당 클래스가 존재하지 않습니다.");
		}

//		실행 예외 컴파일 시에 걸러지지 않는 예외
//		자동으로 try catch를 지정 할 수 없어 직접 써줘야.
		String data1 = null;
		String data2 = null;

		try {
			data1 = args[0];
			data2 = args[1];

			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.printf("%s + %s = %d \n", data1, data2, result);
			
//			throw new ClassCastException(); //강제로 예외를 발생시킴
			
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println("실행 매개값의 수가 부족합니다.");
		} catch (NumberFormatException e) {
//			e.printStackTrace();
			System.out.println("값이 숫자로 변환될 수 없습니다.");
		} catch (Exception e) { //예측하지 못한 예외를 걸러낼때 //엥간하면 마무리에 항상 써주자
			System.out.println("실행 예외");
//			return; //메소드를 나가야 하지만 fianlly는 항상 출력됨
		}finally { //catch부분이 실행되건 안되건 finally 구문은 실행됨
			System.out.println("프로그램이 종료되었습니다.");
		}
		try {
			findClass();
		} catch (NullPointerException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void findClass() throws NullPointerException, ClassNotFoundException {
		String className = null;
		Scanner sc = new Scanner(System.in)	;
		System.out.println("찾고자 하는 클래스 이름을 적어주세요.");
		if(className==null || className.equals("")) {
			throw new NullPointerException();
		}
		Class clazz = Class.forName(className);
	}
	
	
	
	
}
