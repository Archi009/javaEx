package com.yedam.java.test;

import java.util.Scanner;

public class CalOldprofesser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 만 나이 계산기 (올해 기준 +-100살)

		// 1.계산식(하드코딩) ->올해만 사용
		// 1-1)2000년 이후 2023년 이전 출생 -> (23-태어난 년도)+1
		// 1-2)1923년 이후 2000년 이전 출생 -> (123-태어난 년도)

		
		System.out.println("생년월일>");
		String birth = sc.nextLine();
		//substring 의 사용법 substring(0,2) 인덱스 0번 부터 2번 전까지 나눈다.
		int birthNo = Integer.parseInt(birth.substring(0,2));
		
		if(birthNo  <= 23) {// 1-1)2000년 이후 2023년 이전 출생 -> (23-태어난 년도)+1
		 System.out.println("나이 : "+((23-birthNo)+1));
		//1922~1999
		}else if(birthNo >23){// 1-2)1923년 이후 2000년 이전 출생 -> (123-태어난 년도)
			System.out.println("나이 : "+(123-birthNo));		
		}
		
		
		
		
		
		
		
		
		
		// 1.계산식(일반화)
		// Calendar, date(simledateFormat) => 오늘 날짜, 년도
		// 1-1)2000년 이후 2023년 이전 출생 -> (기준 년도-태어난 년도)+1
		// 1-2)1923년 이후 2000년 이전 출생 -> (기준 년도-태어난 년도)

		
		
		
	}
}
