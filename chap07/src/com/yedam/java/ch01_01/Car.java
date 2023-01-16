package com.yedam.java.ch01_01;

public class Car {
	//필드
	public int speed;
	public final int maxSpeed = 300; //final 지정된 필드는 초기화 된값이 고정됨으로 값을 넣어줘야한다
	
	//생성자
	
	
	//메소드
	public void speedUp() {
		speed +=1;
	}
	
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
