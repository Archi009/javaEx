package com.yedam.java.ch02_02;

public interface RemoteControl {
	// 상수
//	public static final int MAX_VALUE = 10; 
//	본래 상수는 static final을 붙여서 상수화 해야하지만,
//	인터페이스 문서 내에서는 static final이나 abstract를 생략하고
//	필드는 상수, 메소드는 추상메소드이다 
	public int MAX_VALUE = 10; //상수는 초기값이 반드시 있어야 한다.
	public int MIN_VALUE = 0;
	
	
	//추상메소드
/*	public default void method() {
		System.out.println("일반 메소드입니다.");
	}//default를 부여해서 일반 메소드라고 표시 해줘야 일반메소드 사용가능
	*/
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
}
