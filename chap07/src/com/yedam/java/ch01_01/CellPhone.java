package com.yedam.java.ch01_01;

public class CellPhone {
	//필드 
	String model;
	String color;
	
	//생성자
	public CellPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//메소드
	void powerOn(){
		System.out.println("전원을 켭니다.");
	}
	
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	void sendVoice(String message) {
		System.out.println("자기 : "+message);
	}
	
	void receiveVoice(String message) {
		System.out.println("상대방 : "+ message);
	}
	
	
}
