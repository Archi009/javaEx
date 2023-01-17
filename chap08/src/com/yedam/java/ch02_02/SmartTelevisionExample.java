package com.yedam.java.ch02_02;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		
	SmartTelevision tv = new SmartTelevision();
	
	RemoteControl rc = tv;
	rc.turnOff();
	
	Searchable sc = tv;
	sc.search("다음");
	
	SmartTv sm = tv;
	sm.alarm("2023/01/18");
	sm.search("우웅~ 치킨");
	sm.turnOff();
	}	
}
