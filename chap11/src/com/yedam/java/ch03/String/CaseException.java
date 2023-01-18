package com.yedam.java.ch03.String;

public class CaseException {
	public static final String DATA = "HELLO WORLD!!";

	public static void main(String[] args) {
		String inputData = "Hello World!!";
		String newInputDataL= inputData.toLowerCase() ;//소문자
		String newInputDataU= inputData.toUpperCase() ;//대문자
		
		if(newInputDataU.equals(DATA.toUpperCase())) { 
//			비교 대상또한 같은 단위의 문자로 바꿔서 비교 해야한다.
			System.out.println("있는 데이터 입니다.");
		}else {
			System.out.println("없는 데이터 입니다.");
		}
		
		
		//대소문자 구분없이 의미만 비교하는 메소드
		if(inputData.equalsIgnoreCase(DATA)) {// 대소문자 구분없이 비교 가능 메소드 
			System.out.println("있는 데이터 입니다.");
		}else {
			System.out.println("없는 데이터 입니다.");
		}
	}
}
