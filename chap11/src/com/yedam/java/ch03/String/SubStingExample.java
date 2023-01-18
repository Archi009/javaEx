package com.yedam.java.ch03.String;

public class SubStingExample {
	public static void main(String[] args) {
		
		String ssn= "880815 1234567";
		//substring(start,end) ->Index start 부터 end 전까지 start=<값,end
		String firstNum=ssn.substring(0,6);
		System.out.println("생년월일 : " + firstNum);
		
		
		//substring(start) ->Index start 부터 끝까지
		
		String secondNum=ssn.substring(7);
		System.out.println("개인정보 : " + secondNum);
		
		
		//split 기준을 기반으로 배열에 소분
		String[] numList = ssn.split(" ");
		for(String num : numList) {
			System.out.println(num);
		}
		System.out.println(numList[0]);
		System.out.println(numList[1]);
		
	}
}
