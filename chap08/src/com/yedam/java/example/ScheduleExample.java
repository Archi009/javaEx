package com.yedam.java.example;

import java.util.Scanner;

public class ScheduleExample {
	public static void main(String[] args) {
//		top-down   main먼저 만들고 객체
//		bottom-up  객체 만들고 main

		Scanner scanner = new Scanner(System.in);
		//null 값으로 지정해 줄 수 있는건 
		Scheduler scheduler = null;

		System.out.println("전화 상담 할당 방식을 선택하세요.");
		System.out.println("R : 한명씩 차례로 할당 ");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당 ");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당 ");

		String ch = scanner.next();
//		new 연산자를 사용 할 수 있는 타입은 참조타입(배열 클래스 인터페이스)
//		자동상태 변화가 일어나는것을 보니, Scheduler에 상속될 수 있다.
		if ("R".equals(ch) || "r".equals(ch)) {
			scheduler = new RoundRobin();
		} else if ("L".equals(ch) || "l".equals(ch)) {
			scheduler = new LeastJob();
		} else if ("P".equals(ch) || "p".equals(ch)) {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("지원되지 않는 기능입니다.");
			return;
		}
		
		//현재 메소드를 불러 올 때 instanceof와 같은 확인 작없이 없는데,
		//이는 추상 매소드로서 사용한 다는 뜻이다.(강제로 메소드를 할당 시키기 때문)
		//이때 공통된 필드값을 가졌거나 일반 메소드가 있지 않으니 interface를 쓴것으로 추측된다.
		scheduler.getNextCall();      //상담 : 다음 전화 
		scheduler.sendCallToAgent();  //배분 방법

	}
}
