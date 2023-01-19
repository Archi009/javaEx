package com.yedam.java.ch02;

public class Example {
	public static void main(String[] args) {
		//매개변수가 없는 경우
		Workable work = () -> {
			System.out.println("출근 시러");
			System.out.println("프로그래밍 하자");
		};
		
		work.work();
		
		work = () -> System.out.println("한 줄 만 출력하면 중괄호 생략가능");
		work.work();
		
		//매개변수가 있는 경우
		//임시 매개변수(x)를 입력하면 됨 
		Speakable speak = (x) -> {
			System.out.println("현재 볼륨은 중간입니다.");
			System.out.println("현재 재생되는 음악은 "+x+"입니다");
		};
		
		speak.speak("아이유 - 밤편지");
		speak = x -> System.out.println("현재 재생되는 음악은 "+x+"입니다");
		
		speak.speak("윤하 - 사건의 지평선");
		
		//리턴값이 있는 경우
		Calculator cal = (x,y) ->{
			int result = (int)(x+y);
			return result;
		};
		System.out.println(cal.plus(1, 3));
		
		
		cal = (x, y) -> (int)(x+y);
		System.out.println(cal.plus(4, 5));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
