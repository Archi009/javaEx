package com.yedam.java.ch01_01;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();

		tv.turnOn();
		tv.search("네이버");
		tv.setVolume(-100);
		tv.setVolume(20);
		tv.turnOff();

//		필요시 인터페이스 타입 변수로 타입변환을 시켜 제한된 기능을 사용하기도 한다.
		RemoteControl re = tv;
		Searchable searchable = tv;
		
		
	}
}
