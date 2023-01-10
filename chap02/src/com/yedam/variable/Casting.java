package com.yedam.variable;

public class Casting {
	public static void main(String[] args) {
		//자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
	    
		System.out.println("inValue: "+ intValue);
	    
		char charValue = '가';
		intValue = charValue;
		System.out.println ("가의 유니코드 :"+ intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println ("가의 유니코드 :"+ intValue);
		
		double doubleValue = longValue;
		System.out.println ("doubleValue :"+ doubleValue);
		
		//강제 타입 변환
		//작은 허용 범위 타입 = (작은 허용 범위타입) 큰범위타입
		
		int intVar = 200;     
		byte byteVar = (byte)intVar; //byte는 128까지만 들어갈 수 있는데 200이 들어가므로 다른 값이 나온다
		
		System.out.println("byteVar:" + byteVar);
		
		
		int intVar2 = 44032;
		char charVar = (char)intVar2;
		
		System.out.println("charVar:" + charVar);
		
		//실수 <-> 정수간 강제 타입 변환
        //자동 타입 변환: int -> double = 3.0
		//강제타입변환 : double -> int = 소수점 땐 정수만 타입 변환
		double doubleVar = 3.14;
		intVar2 = (int)doubleVar; // 실수를 정수로 타입변환하면 강제로 소수점 자리는 지워짐
		System.out.println("intVar2 :" +intVar2);
		

	
		
		
	}
}
