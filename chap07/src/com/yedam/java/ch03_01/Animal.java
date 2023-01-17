package com.yedam.java.ch03_01;

public abstract class Animal {
	//필드 
	
	public String kind; //종
	// 생성자

	// 메소드
	public void breath() {
		System.out.println("숨을 쉽니다. ");
	}
	
	public abstract void sound(); 
	
}
