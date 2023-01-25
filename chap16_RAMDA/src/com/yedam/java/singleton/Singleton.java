package com.yedam.java.singleton;

public class Singleton {
	//싱글톤
	//프로그램 내에서 단 하나의 객체를 보장
	//java <->db연결
	//springframe에서 사용

	private Singleton singleton= null; 
	//Singleton singleton = new Singleton();
	
	//생성자 private 막음 => 외부에서 Singleton 객체 생성 못함.
	private Singleton(){
		
	}
	//외부에서 Singleton 내부에서 만든 객체 연결하는 메소드.
	public Singleton getInstance()	{
		if(singleton == null) {
			singleton = new Singleton(); //100번지
		}
		return singleton;
	}
	
}
