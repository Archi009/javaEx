package com.yedam.enumm;

import java.util.Calendar;

public class EnumExample {
	public static void main(String[] args) {
		// Week 타입의 today변수
		// today는 Week가 가지고 있는 데이터만 가질 수 있다.
		// today데이터 범위는 monday~snnday 총 7개만
		Week today = null;

		// 오늘의 요일이 어떠한 요일인지.
		Calendar cal = Calendar.getInstance();
		// java는 일주일의 시작을 일요일이라고 봄
		// 일요일 = 1 월요일 =2 ... 금요일 =6 =>switch로 응용가능
		//오늘 요일을 숫자로 알려줌.
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WENDESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.STATURDAY;
			break;
		}
		
		System.out.println("오늘 요일 : "+today);
		
		
		
		
	}
}
