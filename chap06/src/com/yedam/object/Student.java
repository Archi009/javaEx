package com.yedam.object;

public class Student {

	//필드, 객체의 속성(정보,데이터)가 저장되는 부분
	//이름
	String name;
	//final String school;
	 String school; 
	//수정 불가하게 만들었기 때문에 이대로 두면 값이 지정이 안돼있어 오류
	//아래 모든 생성자에 school의 값을 넣어줘야 한다
	//수정 불가능한 한가지 값을 사용하고자 한다면 필드에서 final선언후 
	//값을 지정.
	//생성자를 통해 수정불가한 특정 몇가지 값을 지정해주고자 한다면 
	//필드에는 값이 비워진 final 을 생성해주고  
	//생성자 마다 다른 값을 넣어준다
	int age;
	int kor;
	int math;
	int eng;
	//생성자, 객체 초기화 (생성)할 때
	//어떠한 행동(생성자 안에 정의된 )울 하고 생성해라
	//생성자, 객체 초기화(생성) 할 때 사용하는 부분
	//생성하지 않아도 컴파일(실행)할 때 자바에서 알아서 생성 
	//=> class내부의 기본 생성자는 생략 가능
	// 생성자-> 매개변수, 객체 생성시 실행문 정의.
	
	Student(){
		//System.out.println("객체 생성중");
		this.school = "예담"; 
	}
	
	Student(String name){
		this.name = name;
		this.school = "예담"; 
	}
	Student(int age){
		this.school = "의자"; 
		if(age>0)
			this.age = age;
		else
			this.age =0;
	}
	Student(String name,int age){
		this(age);
		this.name = name;
		//this.age = age;
	}
	
	
	
	

	//메소드, 객체를 생성 후 기능을 사용할 때 정의 하는 부분
	void getInfo() {
		System.out.println("학생의 이름 : " + name);
		System.out.println("학생의 나이 : "+ age);
		System.out.println("다니고 있는 학교 : "+ school);
		System.out.println("국어 : "+ kor);
		System.out.println("수학 : "+ math);
		System.out.println("영어 : "+ eng);
	}
	
	
	
	
}
