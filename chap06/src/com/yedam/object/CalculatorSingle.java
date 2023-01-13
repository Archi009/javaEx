package com.yedam.object;
/*
 * 필요시 마다 매번 객체를 생성하지 않고 
 * 한번만 객체 생성해놓고 필요시에 참조
 */
public class CalculatorSingle {
	//싱글톤
	static CalculatorSingle instance = new CalculatorSingle();
	//메소드
	static CalculatorSingle getInstance() {
		return instance;
	}
		
	//생성자
	private CalculatorSingle(){}	
	
	
	
	
	//필드
	//메소드
	//메소드 리턴 타입이 존재 할때
	int sum(int a, int b) {
		return a+b;
	}
	
	double sub(int a, int b) {
		return a-b ;
	}
	
	String result(String value) {
		String temp = "value 테스트 "	+value;
		return temp;
	}
	
	//리턴문이 없는 메소드 생성
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int sum2(int ...values) {
		System.out.println(values);	
		for(int a:values) {
			System.out.println(a);
		}
		int total = 0;
		for(int a:values) {
			total += a ;
		}
		return total;
	}//values:참조
	
	
	
	
	
	
}
