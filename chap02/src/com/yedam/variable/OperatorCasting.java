package com.yedam.variable;

public class OperatorCasting {
	public static void main(String[] args) {
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000;
		
		long result  = value1 + value2+ value3; 
		System.out.println(result); //가장큰 범위값의 타입으로 출력 된다.
		
//		실수와 정수 타입 변환 (연산)
		
		int intValue1 = 10;
		int intValue4 = intValue1/4;    // 10/4 = 2
		System.out.println(intValue4);  
		
		
		int intValue2 = 10;
		double intValue3 = intValue2 / 4.0; // 정수/실수 
		
		System.out.println(intValue3);
		
		
		int x =1 ;
		int y = 2 ;
		//double result2 = x/y;
		double result2 = x/(double)y;
		System.out.println(result2);	
		
		
//		+ 연산
//		숫자 연산(더하기)
		
		int value = 10+2+8;
		System.out.println(value); //20
		
//		문자열 결합 연산
		String str1 = 10 +2+"8";
		System.out.println("str1:"+ str1); //128
				
		String str2 = 10 +"2" + 8;
		System.out.println("str2:" + str2); //1028
		
		String str3 = "10"+2+8;
		System.out.println("str3:" + str3); //1028
		
		String str4 = "10" + (2+8); //괄호를 통해 먼저 연산할 것을 지정!
		System.out.println("str4:" + str4); //1010
		
//		String <-> 정수, 실수 타입 변환
// 		String -> 실수, 정수
		int valueStr = Integer.parseInt(str4);
		//byte byteValue = Byte.parseByte(str4); //str4 는 byte 범위 밖이다
		short shortValue = Short.parseShort(str4);
		long longValue = Long.parseLong(str4);
		double dValue = Double.parseDouble(str4);
		System.out.println(dValue);
//		boolean bVlaue = Boolean.parseBoolean(str4);
		
//		실수,정수 -> String		
//		int -> String
		String str5 = String.valueOf(valueStr);
//		long -> String
		String str6 = String.valueOf(longValue);
//		double -> String
		String str7 = String.valueOf(dValue);
		
		
	
		
		
	}
}
