package com.yedam.java.ch06.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		
		//날짜 시간 따위의 출력 형태 설정
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		//포맷 적용
		String strNow = sdf.format(date);
		System.out.println(strNow);
	}
}
