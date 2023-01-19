package com.yedam.java.ch03;

public class Course {
//	일단 뭘 줄지 모르니까 다 받을게 ;
	public static void registerCourse1(Applicant<?> applicant) {
		String message = 
				applicant.kind.getClass().getSimpleName() 
				//kind라는 변수가 실제 무슨 클래스인지 알아내고 그 클래스의 실제 이름을 반환함
				
				+"이 (가) course1 을 등록함";
		System.out.println(message);
	}
	//Person, Worker 만 등록 가능<? super Worker>  Worker와 부모들까지
	public static void registerCourse2(Applicant<? super Worker> applicant) {
		
		String message = 
				applicant.kind.getClass().getSimpleName() 
				
				+"이 (가) course1 을 등록함";
		System.out.println(message);
	}

	//Student , HighStudent , MiddleStudent 만 등록 가능 <? extends Student> Student와 자식들까지 
	public static void registerCourse3(Applicant<? extends Student> applicant) {
		
		String message = 
				applicant.kind.getClass().getSimpleName() 
				
				+"이 (가) course1 을 등록함";
		System.out.println(message);
	}
}
