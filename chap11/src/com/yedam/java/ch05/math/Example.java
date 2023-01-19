package com.yedam.java.ch05.math;

public class Example {
	public static void main(String[] args) {
		//abs() : 절대값
		System.out.println("-2.14의 절대값 : " + Math.abs(-2.14));
		System.out.println("2.14의 절대값 : " + Math.abs(2.14));
		System.out.println( Math.abs(-2.14)==Math.abs(2.14));
		
		//max(), min(), : 최대값, 최소값
		System.out.println("2.8, 6.7 중 최대값 : "+ Math.max(2.8,	6.7));
		System.out.println("2.8, 6.7 중 최소값 : "+ Math.min(2.8,	6.7));
		
		//ceil() : 올림값
		System.out.println("5.3의 올림값 :" +Math.ceil(5.3));
		System.out.println("-5.3의 올림값 :" +Math.ceil(-5.3));
					
		//floor() : 버림값
		System.out.println("5.3의 버림값 :" +Math.floor(5.3));
		System.out.println("-5.3의 버림값 :" +Math.floor(-5.3));
		
		// round() : 반올림 ;사사 오입
		System.out.println("5.3의 반올림값 :" +Math.round(5.3));
		System.out.println("-5.3의 반올림값 :" +Math.round(-5.3));
		
		//rint() : 반올림 -> 소수점 앞의 값이 홀수인지 짝수인지 확인
		// 홀수 ; 5이상 // 짝수 ; 6이상
		System.out.println("5.5의 가까운 정수의 실수값 :" +Math.rint(5.5));
		System.out.println("7.5의 가까운 정수의 실수값 :" +Math.rint(7.5));
		System.out.println("4.5의 가까운 정수의 실수값 :" +Math.rint(4.5));
		System.out.println("4.6의 가까운 정수의 실수값 :" +Math.rint(4.6));
		System.out.println("5.6의 가까운 정수의 실수값 :" +Math.rint(5.6));
		System.out.println("-5.4의 가까운 정수의 실수값 :" +Math.rint(-5.4));
		System.out.println("-5.5의 가까운 정수의 실수값 :" +Math.rint(-5.5));
		System.out.println("-5.6의 가까운 정수의 실수값 :" +Math.rint(-5.6));
		System.out.println("-4.5의 가까운 정수의 실수값 :" +Math.rint(-4.5));
		
		
		
		
		
	}
}
